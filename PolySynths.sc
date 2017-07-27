PolySynths {

//class methods

	*load {


//////////Initialize the WaveTable 1

~waveTableCur_Buffer = Buffer.alloc(Server.default, 512*8, 1);
~waveTableCur_Buffer.sine3((1.0..10), 1.0/(1..10), 0, true, true, true);
~h1 = 1; ~h2 = 1/2; ~h3 = 1/3; ~h4 = 1/4; ~h5 = 1/5; ~h6 = 1/6; ~h7 = 1/7; ~h8 = 1/8; ~h9 = 1/9; ~h10 = 1/10;

SynthDef(\FMSynth, { | bufnum,

	atk = 0.005, dec = 0.3, sus = 0.4, rel = 0.15, amp = 1, fb = 0 , gate = 0.0,

	atkM = 0.005, decM = 0.3, susM = 0.4, relM = 0.15, ampM = 1, fbM = 0, freqM = 1, gateM = 0.0

	lfoFreq = 1, lfoAmp = 1, lfo_mix = 0,

	extMod = 0, curSwitch = 1, modSwitch = 1,

	timeScale = 1
	|

	var sourceCur, sourceMod, envelopeCur, envelopeMod, lfo1, mixlfo;

	lfo1 = SinOsc.kr(lfoFreq, 0, lfoAmp)/*.range(-10, 10)*/;

	envelopeCur = EnvGen.ar(Env.adsr( atk, dec, sus, rel, curve: \amp_c.kr([1, 1])),
							gate: gate,
							levelScale: Latch.kr(gate, gate),
							timeScale: Latch.kr(timeScale, gate),
		                    doneAction: 2
							);

	envelopeMod = EnvGen.ar(Env.adsr( atkM, decM, susM, relM, peakLevel: 1, curve: \amp_c.kr([1, 1])),
							gate: gateM,
		                    levelScale: Latch.kr(gateM,gateM),
//							timeScale: 1,
                    		doneAction: 0
							);

	sourceMod = SinOscFB.ar(freqM, fbM, ampM * envelopeMod) * modSwitch  /*.abs*/;

	sourceCur = Osc.ar(bufnum,

		EnvGen.ar( Env(

			\freq_l.kr([2960, 70, 90]),
			\freq_d.kr([0.07, 0.2]),
			\freq_c.kr([-13, -1]),

		) ) + sourceMod + extMod, fb,

		amp * envelopeCur * curSwitch

		);

	mixlfo = XFade2.ar(sourceCur, sourceCur*lfo1, lfo_mix, 1);

	Out.ar([0, 1], mixlfo)

}).add;

//:Array

~noteArray = Array.newClear(128);
~bendcount = -1;

~on.remove;
~on = NoteOnResponder({ |src, chan, note, vel|

                 var x;
         	"WaveTable __  1  freq = ".post; (note.midicps*~midiTranspose1/2).postln;
			~waveTableCur_Buffer.sine3((1.0..10),
				[~h1, ~h2, ~h3, ~h4, ~h5, ~h6, ~h7, ~h8, ~h9, ~h10], 0, true, true, true);

                 ~noteArray.put(note,

					x = Synth(\FMSynth, [\gate, vel/127, \gateM, vel/100,

						\bufnum, ~waveTableCur_Buffer,
						\freq_l, [note.midicps*~bendRatioMul, note.midicps, note.midicps]*~midiTranspose1/2,
						\freq_d, [~freqDur1, ~freqDur2],
			            \freq_c, [-5, -1],    //default [0, -1]
						\atk, ~atk,
						\dec, ~dec,
						\sus, ~sus,
						\rel, ~rel,
						\fb, ~fb,
						\amp, ~amp,
						\curSwitch, ~curSwitch,
			            \timeScale, 1, //24.midicps/note.midicps

			           /////////Modulator Conntrols

						\freqM, note.midicps*~freqMMul,
						\atkM, ~atkM,
						\decM, ~decM,
						\susM, ~susM,
						\relM, ~relM,
						\fbM, ~fbM,
						\ampM, ~ampM,
						\modSwitch, ~modSwitch,

						/////////Lfo Conntrols

						\lfoFreq, 1,
						\lfoAmp, 1,
						\lfo_mix, -1

					]));

                 x.map(\extMod, ~mod2To1);

                 ~bendcount = note;
 			});

~off.remove;
~off = NoteOffResponder({ |src,chan,note,vel|
                 ~noteArray[note].set(\gate, 0.0, \gateM, 0.0);

			});


~bend = MIDIIn.bend = { |src,chan,val|

				(val/100).postln;
 				~noteArray.[~bendcount].set(\fb, val/100 );
 			};



////////////////////Initialize the WaveTable 2

~waveTableCur_Buffer2 = Buffer.alloc(Server.default, 512*8, 1);
~waveTableCur_Buffer2.sine3((1.0..10), 1.0/(1..10), 0, true, true, true);
~h2_1 = 1; ~h2_2 = 1/2; ~h2_3 = 1/3; ~h2_4 = 1/4; ~h2_5 = 1/5; ~h2_6 = 1/6; ~h2_7 = 1/7; ~h2_8 = 1/8; ~h2_9 = 1/9; ~h2_10 = 1/10;

SynthDef(\FMSynth_2, { | bufnum,

	atk = 0.005, dec = 0.3, sus = 0.4, rel = 0.15, amp = 1, fb = 0 , gate = 0.0, out

	atkM = 0.005, decM = 0.3, susM = 0.4, relM = 0.15, ampM = 1, fbM = 0, freqM = 1, gateM = 0.0

	lfoFreq = 1, lfoAmp = 1, lfo_mix = 0,

	extMod = 0, cur2Switch = 1, mod2Switch = 1

	|

	var sourceCur, sourceMod, envelopeCur, envelopeMod, lfo1, mixlfo;

	lfo1 = SinOsc.kr(lfoFreq, 0, lfoAmp)/*.range(-10, 10)*/;

	envelopeCur = EnvGen.ar(Env.adsr( atk, dec, sus, rel, curve: \amp_c.kr([1, 1])),
							gate: gate,
							levelScale: Latch.kr(gate, gate),
							doneAction: 2
							);

	envelopeMod = EnvGen.ar(Env.adsr( atkM, decM, susM, relM, peakLevel: 1, curve: \amp_c.kr([1, 1])),
							gate: gateM,
							levelScale: Latch.kr(gateM,gateM),
							doneAction: 0
							);

	sourceMod = SinOscFB.ar(freqM, fbM, ampM * envelopeMod) * mod2Switch/*.abs*/;

	sourceCur = Osc.ar(bufnum,

		EnvGen.ar( Env(

			\freq_l.kr([2960, 70, 90]),
			\freq_d.kr([0.07, 0.2]),
			\freq_c.kr([-13, -1]),

		) ) + sourceMod + extMod, fb,

		amp * envelopeCur * cur2Switch

		);

	mixlfo = XFade2.ar(sourceCur, sourceCur*lfo1, lfo_mix, 1);


//	Out.ar([0, 1], mixlfo)
	Out.ar([out, out+1], mixlfo)

}).add;


//:Array

~noteArray2 = Array.newClear(128);
~bendcount2 = -1;

//:
~on2.remove;
~on2 = NoteOnResponder({ |src, chan, note, vel|

                 var x;
               "WaveTable __  2  freq = ".post; (note.midicps*~midiTranspose2/2).postln;
			~waveTableCur_Buffer2.sine3((1.0..10),
			[~h2_1, ~h2_2, ~h2_3, ~h2_4, ~h2_5, ~h2_6, ~h2_7, ~h2_8, ~h2_9, ~h2_10], 0, true, true, true);

//			~waveTableCur_Buffer2.sine3((1.0..10), 1/[10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 1], 0, true, true, true);


	          ~noteArray2.put(note,

					x = Synth(\FMSynth_2, [\gate, vel/127, \gateM, vel/100,

						\bufnum, ~waveTableCur_Buffer2,
						\freq_l, [note.midicps*~bendRatioMul2, note.midicps, note.midicps]*~midiTranspose2/2,
						\freq_d, [~freqDur1_2, ~freqDur2_2],
						\freq_c, [-5, -1],
						\atk, ~atk2,
						\dec, ~dec2,
						\sus, ~sus2,
						\rel, ~rel2,
						\fb, ~fb2,
						\amp, ~amp2,
						\out, ~outWT2,
						\cur2Switch, ~cur2Switch,

						/////////Modulator Conntrols

						\freqM, note.midicps*~freqMMul2,
						\atkM, ~atkM2,
						\decM, ~decM2,
						\susM, ~susM2,
						\relM, ~relM2,
						\fbM, ~fbM2,
						\ampM, ~ampM2,
						\mod2Switch, ~mod2Switch,

						/////////Lfo Conntrols

						\lfoFreq, 10,
						\lfoAmp, 1,
						\lfo_mix, -1

					]));

                x.map(\extMod, ~mod3To2);

	           ~bendcount2 = note;

             });

~off2.remove;
~off2 = NoteOffResponder({ |src,chan,note,vel|
                 ~noteArray2[note].set(\gate, 0.0, \gateM, 0.0);

			});


~bend2 = MIDIIn.bend = { |src,chan,val|

				(val/100).postln;
 				~noteArray2.[~bendcount2].set(\fb, val/100 );
 			};



///////////////////Initialize the WaveTable 3

~waveTableCur_Buffer3 = Buffer.alloc(Server.default, 512*8, 1);
~waveTableCur_Buffer3.sine3((1.0..10), 1.0/(1..10), 0, true, true, true);
~h3_1 = 1; ~h3_2 = 1/2; ~h3_3 = 1/3; ~h3_4 = 1/4; ~h3_5 = 1/5; ~h3_6 = 1/6; ~h3_7 = 1/7; ~h3_8 = 1/8; ~h3_9 = 1/9; ~h3_10 = 1/10;

SynthDef(\FMSynth_3, { | bufnum,

	atk = 0.005, dec = 0.3, sus = 0.4, rel = 0.15, amp = 1, fb = 0 , gate = 0.0, out

	atkM = 0.005, decM = 0.3, susM = 0.4, relM = 0.15, ampM = 1, fbM = 0, freqM = 1, gateM = 0.0

	lfoFreq = 1, lfoAmp = 1, lfo_mix = 0,

	cur3Switch = 1, mod3Switch = 1

	|

	var sourceCur, sourceMod, envelopeCur, envelopeMod, lfo1, mixlfo;

	lfo1 = SinOsc.kr(lfoFreq, 0, lfoAmp)/*.range(-10, 10)*/;

	envelopeCur = EnvGen.ar(Env.adsr( atk, dec, sus, rel, curve: \amp_c.kr([1, 1])),
							gate: gate,
							levelScale: Latch.kr(gate, gate),
							doneAction: 2
							);

	envelopeMod = EnvGen.ar(Env.adsr( atkM, decM, susM, relM, peakLevel: 1, curve: \amp_c.kr([1, 1])),
							gate: gateM,
							levelScale: Latch.kr(gateM,gateM),
							doneAction: 0
							);

	sourceMod = SinOscFB.ar(freqM, fbM, ampM * envelopeMod) * mod3Switch/*.abs*/;

	sourceCur = Osc.ar(bufnum,

		EnvGen.ar( Env(

			\freq_l.kr([2960, 70, 90]),
			\freq_d.kr([0.07, 0.2]),
			\freq_c.kr([-13, -1]),

		) ) + sourceMod, fb,

		amp * envelopeCur * cur3Switch

		);

	mixlfo = XFade2.ar(sourceCur, sourceCur*lfo1, lfo_mix, 1);


//	Out.ar([0, 1], mixlfo)
	Out.ar([out, out+1], mixlfo)

}).add;


//:Array

~noteArray3 = Array.newClear(128);
~bendcount3 = -1;

//:
~on3.remove;
~on3 = NoteOnResponder({ |src, chan, note, vel|

                 var x;
              "WaveTable __  3  freq = ".post; (note.midicps*~midiTranspose3/2).postln;
			~waveTableCur_Buffer3.sine3((1.0..10),
				[~h3_1, ~h3_2, ~h3_3, ~h3_4, ~h3_5, ~h3_6, ~h3_7, ~h3_8, ~h3_9, ~h3_10], 0, true, true, true);

                 ~noteArray3.put(note,

					x = Synth(\FMSynth_3, [\gate, vel/127, \gateM, vel/100,

						\bufnum, ~waveTableCur_Buffer3,
						\freq_l, [note.midicps*~bendRatioMul3, note.midicps, note.midicps]*~midiTranspose3/2,
						\freq_d, [~freqDur1_3, ~freqDur2_3],
						\freq_c, [-5, -1],
						\atk, ~atk3,
						\dec, ~dec3,
						\sus, ~sus3,
						\rel, ~rel3,
						\fb, ~fb3,
						\amp, ~amp3,
						\out, ~outWT3,
						\cur3Switch, ~cur3Switch,

						/////////Modulator Conntrols

						\freqM, note.midicps*~freqMMul3,
						\atkM, ~atkM3,
						\decM, ~decM3,
						\susM, ~susM3,
						\relM, ~relM3,
						\fbM, ~fbM3,
						\ampM, ~ampM3,
						\mod3Switch, ~mod3Switch,

						/////////Lfo Conntrols

						\lfoFreq, 10,
						\lfoAmp, 1,
						\lfo_mix, -1

					]));

                 ~bendcount3 = note;
 			});

~off3.remove;
~off3 = NoteOffResponder({ |src,chan,note,vel|
                 ~noteArray3[note].set(\gate, 0.0, \gateM, 0.0);

			});


~bend3 = MIDIIn.bend = { |src,chan,val|

				(val/100).postln;
 				~noteArray3.[~bendcount3].set(\fb, val/100 );
 			};




	}

}









