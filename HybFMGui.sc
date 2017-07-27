HybFMGui {

//class methods

	*load { var n;

		var window = Window.new("HybFM",Rect(605, 601, 1200, 800)).front;
window.alwaysOnTop_(true);

		PolySynths.load;

///////////////////////////WaveTable Oscillator 1 Controls
//============================================================

StaticText.new(window,Rect(150, 0, 200, 20)).string_("WaveTable Oscillator 1");

~curSwitchG = Button.new(window,Rect(100, 0, 25, 25))
	.states_([ [ "OFF", Color(0), Color(0.4) ], [ "ON", Color(0), Color(1.0) ] ])
	.action_{|v| (if (v.value == 1) {~curSwitch = 1}{~curSwitch = 0})};


~ampG = Slider.new(window,Rect(380, 20, 20, 80))
	.action_{|v| ~amp = v.value; "amp = ".post; ~amp.postln;};


/////////////////////////////////////////////////////WaveTable Harminics

	n = 10;
	~wtHarmG = MultiSliderView(window,Rect(420,20,n*13+2,100));
	~wtHarmG.value = [~h1, ~h2, ~h3, ~h4, ~h5, ~h6, ~h7, ~h8, ~h9, ~h10];
	~wtHarmG.action = { arg q, mul = 1;
		if (q.index == 0) {~h1 = q.currentvalue*mul; ~h1.postln;};
		if (q.index == 1) {~h2 = q.currentvalue*mul; ~h2.postln;};
		if (q.index == 2) {~h3 = q.currentvalue*mul; ~h3.postln;};
		if (q.index == 3) {~h4 = q.currentvalue*mul; ~h4.postln;};
		if (q.index == 4) {~h5 = q.currentvalue*mul; ~h5.postln;};
		if (q.index == 5) {~h6 = q.currentvalue*mul; ~h6.postln;};
		if (q.index == 6) {~h7 = q.currentvalue*mul; ~h7.postln;};
		if (q.index == 7) {~h8 = q.currentvalue*mul; ~h8.postln;};
		if (q.index == 8) {~h9 = q.currentvalue*mul; ~h9.postln;};
		if (q.index == 9) {~h10 = q.currentvalue*mul; ~h10.postln;};
		~wtHarmG.value = [~h1, ~h2, ~h3, ~h4, ~h5, ~h6, ~h7, ~h8, ~h9, ~h10];

	};

/////////////////////////////////////////////////////WaveTable 1 Transpose

~midiTranspose1G = EZPopUpMenu.new(window, Rect(320,130, 230, 22), "Transpose",
    [
		"+4 oct" ->{( "+4 oct").postln; ~midiTranspose1 = 2.pow(4)},
		"+3 oct" ->{( "+3 oct").postln; ~midiTranspose1 = 2.pow(3)},
		"+2 oct" ->{( "+2 oct").postln; ~midiTranspose1 = 2.pow(2)},
		"+12" ->{( "+12").postln; ~midiTranspose1 = 2.pow(12/12)},
		"+11" ->{( "+11").postln; ~midiTranspose1 = 2.pow(11/12)},
		"+10" ->{( "+10").postln; ~midiTranspose1 = 2.pow(10/12)},
		"+9" ->{( "+9").postln; ~midiTranspose1 = 2.pow(9/12)},
		"+8" ->{( "+8").postln; ~midiTranspose1 = 2.pow(8/12)},
		"+7" ->{( "+7").postln; ~midiTranspose1 = 2.pow(7/12)},
		"+6" ->{( "+6").postln; ~midiTranspose1 = 2.pow(6/12)},
		"+5" ->{( "+5").postln; ~midiTranspose1 = 2.pow(5/12)},
		"+4" ->{( "+4").postln; ~midiTranspose1 = 2.pow(4/12)},
		"+3" ->{( "+3").postln; ~midiTranspose1 = 2.pow(3/12)},
		"+2" ->{( "+2").postln; ~midiTranspose1 = 2.pow(2/12)},
		"+1" ->{( "+1").postln; ~midiTranspose1 = 2.pow(1/12)},
		" 0 " ->{( "0").postln; ~midiTranspose1 = 1;},
		"-1" ->{( "-1").postln; ~midiTranspose1 = 1/2.pow(1/12)},
		"-2" ->{( "-2").postln; ~midiTranspose1 = 1/2.pow(2/12)},
		"-3" ->{( "-3").postln; ~midiTranspose1 = 1/2.pow(3/12)},
		"-4" ->{( "-4").postln; ~midiTranspose1 = 1/2.pow(4/12)},
		"-5" ->{( "-5").postln; ~midiTranspose1 = 1/2.pow(5/12)},
		"-6" ->{( "-6").postln; ~midiTranspose1 = 1/2.pow(6/12)},
		"-7" ->{( "-7").postln; ~midiTranspose1 = 1/2.pow(7/12)},
		"-8" ->{( "-8").postln; ~midiTranspose1 = 1/2.pow(8/12)},
		"-9" ->{( "-9").postln; ~midiTranspose1 = 1/2.pow(9/12)},
		"-10" ->{( "-10").postln; ~midiTranspose1 = 1/2.pow(10/12)},
		"-11" ->{( "-11").postln; ~midiTranspose1 = 1/2.pow(11/12)},
		"-12" ->{( "-12").postln; ~midiTranspose1 = 1/2.pow(12/12)},
		"-2 oct" ->{( "-2 oct").postln; ~midiTranspose1 = 1/2.pow(2)},
		"-3 oct" ->{( "-3 oct").postln; ~midiTranspose1 = 1/2.pow(3)},
		"-4 oct" ->{( "-4 oct").postln; ~midiTranspose1 = 1/2.pow(4)},
	],
	globalAction: { ("cents ").postln;},
    initVal: 15,
    initAction: true,
    labelWidth: 180,
    labelHeight: 20,
    layout: \horz,
    gap: 2@2
);

/////////////////////////////////////////////////////WaveTable Envelope

~atkG = EZKnob.new(window, Rect(10, 25, 70, 100), "ATK", ControlSpec(0.001, 2,  'lin',  0.001) , layout: \vert2 )
	.action_{|v|
	                        ~atk = ~atkG.value;		"atk = ".post; ~atk.postln; };

~decG = EZKnob.new(window,Rect(100, 25, 70, 100), "DEC", ControlSpec(0.001, 0.8,  'lin',  0.001) , layout: \vert2 )
	.action_{|v|
            			 	~dec = ~decG.value ;	"dec = ".post; ~dec.postln; };

~susG = EZKnob.new(window,Rect(190, 25, 70, 100), "SUS", ControlSpec(0.001, 1.4,  'lin',  0.001) , layout: \vert2 )
	.action_{|v|
	                        ~sus = ~susG.value;         	"sus = ".post; ~sus.postln; };

~relG = EZKnob.new(window,Rect(280, 25, 70, 100), "REL", ControlSpec(0.001,  3,  'lin',  0.001) , layout: \vert2 )
	.action_{|v|
				            ~rel = ~relG.value;		"rel = ".post; ~rel.postln;};

/////////////////////////////////////////////////////WaveTable Bend-Ratio-Time

~bendRatioMulG = EZNumber.new(window,Rect(80, 130, 40, 30), nil, ControlSpec(0.08, 100,  'lin',  0.01))
	.action_{|v| ~bendRatioMul = v.value; "Bend Ratio Mul = ".post; ~bendRatioMul.postln;};
			StaticText.new(window,Rect(60, 160, 100, 20))
				.string_("Bend Ratio Mul");

~bendDurG = EZNumber.new(window,Rect(180, 130, 40, 30), nil, ControlSpec(0.01, 10,  'lin',  0.01))
	.action_{|v| ~freqDur1 = v.value; "Bend Dur = ".post; ~freqDur1.postln;};
			StaticText.new(window,Rect(180, 160, 100, 20))
				.string_("Bend Dur");


///////////////////////////Modulator Oscillator 1 Controls
//============================================================
~topAdd = 200;

StaticText.new(window,Rect(150, ~topAdd, 200, 20)).string_("FeedBack Modulator");

~modSwitchG = Button.new(window,Rect(100, ~topAdd-5, 25, 25))
	.states_([ [ "OFF", Color(0), Color(0.4) ], [ "ON", Color(0), Color(1.0) ] ])
	.action_{|v| (if (v.value == 1) {~modSwitch = 1}{~modSwitch = 0})};

/////////////////////////////////////////////////////Modulator Envelope


~atkMG = EZKnob.new(window, Rect(10, 20+~topAdd, 70, 100), "ATK", ControlSpec(0.001, 2,  'lin',  0.001) , layout: \vert2 )
	.action_{|v|
	                        ~atkM = ~atkMG.value;		"atkM = ".post; ~atkM.postln; };


~decMG = EZKnob.new(window, Rect(100, 20+~topAdd, 70, 100), "DEC", ControlSpec(0.001, 0.8,  'lin',  0.001) , layout: \vert2 )
	.action_{|v|
            			 	~decM = ~decMG.value;	"decM = ".post; ~decM.postln;};

~susMG = EZKnob.new(window,Rect(190, 20+~topAdd, 70, 100), "SUS", ControlSpec(0.001, 1,  'lin',  0.001) , layout: \vert2 )
	.action_{|v|
           			    	~susM = ~susMG.value;	"susM = ".post; ~susM.postln;};

~relMG = EZKnob.new(window,Rect(280, 20+~topAdd, 70, 100), "REL", ControlSpec(0.001, 3,  'lin',  0.001) , layout: \vert2 )
	.action_{|v|
            				~relM = ~relMG.value; 	"relM = ".post; ~relM.postln;};


//Modulators Frequency
~freqMMulG = NumberBox.new(window,Rect(370, 20+~topAdd, 30, 30))
	.action_{|v| ~freqMMul = v.value; "FreqMod Mul = ".post; ~freqMMul.postln;};
			StaticText.new(window,Rect(350, 60+~topAdd, 100, 20))
				.string_("Freq MOD Mul");

//Modulators Amplitude
~ampMG = NumberBox.new(window,Rect(460, 20+~topAdd, 30, 30))
	.action_{|v| ~ampM = v.value; "AmpMod = ".post; ~ampM.postln;};
			StaticText.new(window,Rect(460, 60+~topAdd, 100, 20))
				.string_("Amp MOD");

//Modulators FeedBack
~fbMG = EZSlider.new(window,Rect(370, 90+~topAdd, 140, 20), nil, ControlSpec(0, 10,  'lin',  0.01))
	.action_{|v| ~fbM = v.value; "FeedBackMod_1 = ".post; ~fbM.postln;};
			StaticText.new(window,Rect(395, 110+~topAdd, 100, 20))
			.string_("FeedBack");


///////////////////////////WaveTable Oscillator 2 Controls
//============================================================

~leftAdd = 580;

StaticText.new(window,Rect(150+~leftAdd, 0, 200, 20)).string_("WaveTable Oscillator 2");

~cur2SwitchG = Button.new(window,Rect(100+~leftAdd, 0, 25, 25))
	.states_([ [ "OFF", Color(0), Color(0.4) ], [ "ON", Color(0), Color(1.0) ] ])
	.action_{|v| (if (v.value == 1) {~cur2Switch = 1}{~cur2Switch = 0; /*~amp2 = 1;*/})};  ///// ?

~amp2G = Slider.new(window,Rect(380+~leftAdd, 20, 20, 80))
	.action_{|v| ~amp2 = v.value; "amp2 = ".post; ~amp2.postln;};


/////////////////////////////////////////////////////WaveTable 2 Harminics

	n = 10;
	~wtHarm2G = MultiSliderView(window,Rect(420+~leftAdd,20,n*13+2,100));
	~wtHarm2G.value = [~h2_1, ~h2_2, ~h2_3, ~h2_4, ~h2_5, ~h2_6, ~h2_7, ~h2_8, ~h2_9, ~h2_10];
	~wtHarm2G.action = { arg q, mul = 1;
		if (q.index == 0) {~h2_1 = q.currentvalue*mul; ~h2_1.postln;};
		if (q.index == 1) {~h2_2 = q.currentvalue*mul; ~h2_2.postln;};
		if (q.index == 2) {~h2_3 = q.currentvalue*mul; ~h2_3.postln;};
		if (q.index == 3) {~h2_4 = q.currentvalue*mul; ~h2_4.postln;};
		if (q.index == 4) {~h2_5 = q.currentvalue*mul; ~h2_5.postln;};
		if (q.index == 5) {~h2_6 = q.currentvalue*mul; ~h2_6.postln;};
		if (q.index == 6) {~h2_7 = q.currentvalue*mul; ~h2_7.postln;};
		if (q.index == 7) {~h2_8 = q.currentvalue*mul; ~h2_8.postln;};
		if (q.index == 8) {~h2_9 = q.currentvalue*mul; ~h2_9.postln;};
		if (q.index == 9) {~h2_10 = q.currentvalue*mul; ~h2_10.postln;};
		~wtHarm2G.value = [~h2_1, ~h2_2, ~h2_3, ~h2_4, ~h2_5, ~h2_6, ~h2_7, ~h2_8, ~h2_9, ~h2_10];

	};

/////////////////////////////////////////////////////WaveTable 2 Transpose

~midiTranspose2G = EZPopUpMenu.new(window, Rect(320+~leftAdd,130, 230, 22), "Transpose",
    [
		"+4 oct" ->{( "+4 oct").postln; ~midiTranspose2 = 2.pow(4)},
		"+3 oct" ->{( "+3 oct").postln; ~midiTranspose2 = 2.pow(3)},
		"+2 oct" ->{( "+2 oct").postln; ~midiTranspose2 = 2.pow(2)},
		"+12" ->{( "+12").postln; ~midiTranspose2 = 2.pow(12/12)},
		"+11" ->{( "+11").postln; ~midiTranspose2 = 2.pow(11/12)},
		"+10" ->{( "+10").postln; ~midiTranspose2 = 2.pow(10/12)},
		"+9" ->{( "+9").postln; ~midiTranspose2 = 2.pow(9/12)},
		"+8" ->{( "+8").postln; ~midiTranspose2 = 2.pow(8/12)},
		"+7" ->{( "+7").postln; ~midiTranspose2 = 2.pow(7/12)},
		"+6" ->{( "+6").postln; ~midiTranspose2 = 2.pow(6/12)},
		"+5" ->{( "+5").postln; ~midiTranspose2 = 2.pow(5/12)},
		"+4" ->{( "+4").postln; ~midiTranspose2 = 2.pow(4/12)},
		"+3" ->{( "+3").postln; ~midiTranspose2 = 2.pow(3/12)},
		"+2" ->{( "+2").postln; ~midiTranspose2 = 2.pow(2/12)},
		"+1" ->{( "+1").postln; ~midiTranspose2 = 2.pow(1/12)},
		" 0 " ->{( "0").postln; ~midiTranspose2 = 1;},
		"-1" ->{( "-1").postln; ~midiTranspose2 = 1/2.pow(1/12)},
		"-2" ->{( "-2").postln; ~midiTranspose2 = 1/2.pow(2/12)},
		"-3" ->{( "-3").postln; ~midiTranspose2 = 1/2.pow(3/12)},
		"-4" ->{( "-4").postln; ~midiTranspose2 = 1/2.pow(4/12)},
		"-5" ->{( "-5").postln; ~midiTranspose2 = 1/2.pow(5/12)},
		"-6" ->{( "-6").postln; ~midiTranspose2 = 1/2.pow(6/12)},
		"-7" ->{( "-7").postln; ~midiTranspose2 = 1/2.pow(7/12)},
		"-8" ->{( "-8").postln; ~midiTranspose2 = 1/2.pow(8/12)},
		"-9" ->{( "-9").postln; ~midiTranspose2 = 1/2.pow(9/12)},
		"-10" ->{( "-10").postln; ~midiTranspose2 = 1/2.pow(10/12)},
		"-11" ->{( "-11").postln; ~midiTranspose2 = 1/2.pow(11/12)},
		"-12" ->{( "-12").postln; ~midiTranspose2 = 1/2.pow(12/12)},
		"-2 oct" ->{( "-2 oct").postln; ~midiTranspose2 = 1/2.pow(2)},
		"-3 oct" ->{( "-3 oct").postln; ~midiTranspose2 = 1/2.pow(3)},
		"-4 oct" ->{( "-4 oct").postln; ~midiTranspose2 = 1/2.pow(4)},
	],
	globalAction: { ("cents ").postln;},
    initVal: 15,
    initAction: true,
    labelWidth: 180,
    labelHeight: 20,
    layout: \horz,
    gap: 2@2
);

/////////////////////////////////////////////////////WaveTable 2 Envelope


~atk2G = EZKnob.new(window, Rect(10+~leftAdd, 25, 70, 100), "ATK", ControlSpec(0.001, 2,  'lin',  0.001) , layout: \vert2 )
	.action_{|v|
	                        ~atk2 = ~atk2G.value;		"atk2 = ".post; ~atk2.postln; };

~dec2G = EZKnob.new(window,Rect(100+~leftAdd, 25, 70, 100), "DEC", ControlSpec(0.001, 0.8,  'lin',  0.001) , layout: \vert2 )
	.action_{|v|
            			 	~dec2 = ~dec2G.value ;	"dec2 = ".post; ~dec2.postln; };

~sus2G = EZKnob.new(window,Rect(190+~leftAdd, 25, 70, 100), "SUS", ControlSpec(0.001, 1.4,  'lin',  0.001) , layout: \vert2 )
	.action_{|v|
	                        ~sus2 = ~sus2G.value;      "sus2 = ".post; ~sus2.postln; };

~rel2G = EZKnob.new(window,Rect(280+~leftAdd, 25, 70, 100), "REL", ControlSpec(0.001,  3,  'lin',  0.001) , layout: \vert2 )
	.action_{|v|
				            ~rel2 = ~rel2G.value;		"rel2 = ".post; ~rel2.postln;};

/////////////////////////////////////////////////////WaveTable 2 Bend-Ratio-Time


~bendRatioMul2G = EZNumber.new(window,Rect(650, 130, 40, 30), nil, ControlSpec(0.08, 100,  'lin',  0.01))
	.action_{|v| ~bendRatioMul2 = v.value; "Bend Ratio Mul = ".post; ~bendRatioMul2.postln;};
			StaticText.new(window,Rect(630, 160, 100, 20))
				.string_("Bend Ratio Mul");

~bendDur2G = EZNumber.new(window,Rect(750, 130, 40, 30), nil, ControlSpec(0.01, 10,  'lin',  0.01))
	.action_{|v| ~freqDur1_2 = v.value; "Bend Dur = ".post; ~freqDur1_2.postln;};
			StaticText.new(window,Rect(750, 160, 100, 20))
				.string_("Bend Dur");



///////////////////////////Modulator Oscillator 2 Controls
//============================================================

StaticText.new(window,Rect(150+~leftAdd, ~topAdd, 200, 20)).string_("FeedBack Modulator 2");

~mod2SwitchG = Button.new(window,Rect(100+~leftAdd, ~topAdd-5, 25, 25))
	.states_([ [ "OFF", Color(0), Color(0.4) ], [ "ON", Color(0), Color(1.0) ] ])
	.action_{|v| (if (v.value == 1) {~mod2Switch = 1}{~mod2Switch = 0})};


/////////////////////////////////////////////////////Modulator 2 Envelope

~atkM2G = EZKnob.new(window, Rect(10+~leftAdd, 20+~topAdd, 70, 100), "ATK", ControlSpec(0.001, 2,  'lin',  0.001) , layout: \vert2 )
	.action_{|v|
	                        ~atkM2 = ~atkM2G.value;		"atkM2 = ".post; ~atkM2.postln; };


~decM2G = EZKnob.new(window, Rect(100+~leftAdd, 20+~topAdd, 70, 100), "DEC", ControlSpec(0.001, 0.8,  'lin',  0.001) , layout: \vert2 )
	.action_{|v|
            			 	~decM2 = ~decM2G.value;	"decM2 = ".post; ~decM2.postln;};


~susM2G = EZKnob.new(window,Rect(190+~leftAdd, 20+~topAdd, 70, 100), "SUS", ControlSpec(0.001, 1,  'lin',  0.001) , layout: \vert2 )
	.action_{|v|
           			    	~susM2 = ~susM2G.value;	"susM2 = ".post; ~susM2.postln;};


~relM2G = EZKnob.new(window,Rect(280+~leftAdd, 20+~topAdd, 70, 100), "REL", ControlSpec(0.001, 3,  'lin',  0.001) , layout: \vert2 )
	.action_{|v|
            				~relM2 = ~relM2G.value; 	     "relM2 = ".post; ~relM2.postln;};


//Modulators 2 Frequency
~freqMMul2G = NumberBox.new(window,Rect(370+~leftAdd, 20+~topAdd, 30, 30))
	.action_{|v| ~freqMMul2 = v.value; "FreqMod2 Mul = ".post; ~freqMMul2.postln;};
			StaticText.new(window,Rect(350+~leftAdd, 60+~topAdd, 100, 20))
				.string_("Freq MOD2 Mul");

//Modulators 2 Amplitude
~ampM2G = NumberBox.new(window,Rect(460+~leftAdd, 20+~topAdd, 30, 30))
	.action_{|v| ~ampM2 = v.value; "AmpMod2 = ".post; ~ampM2.postln;};
			StaticText.new(window,Rect(460+~leftAdd, 60+~topAdd, 100, 20))
				.string_("Amp MOD2");

//Modulators 2 FeedBack
~fbM2G = EZSlider.new(window,Rect(370+~leftAdd, 90+~topAdd, 140, 20), nil, ControlSpec(0, 10,  'lin',  0.01))
	.action_{|v| ~fbM2 = v.value; "FeedBackMod_2 = ".post; ~fbM2.postln;};
			StaticText.new(window,Rect(395+~leftAdd, 110+~topAdd, 100, 20))
				.string_("FeedBack");


///////////////////////////WaveTable Oscillator 3 Controls
//============================================================
~topAdd3 = 400;

StaticText.new(window,Rect(150, ~topAdd3, 200, 20)).string_("WaveTable Oscillator 3");

~cur3SwitchG = Button.new(window,Rect(100, 0+~topAdd3, 25, 25))
	.states_([ [ "OFF", Color(0), Color(0.4) ], [ "ON", Color(0), Color(1.0) ] ])
	.action_{|v| (if (v.value == 1) {~cur3Switch = 1}{~cur3Switch = 0})};


~amp3G = Slider.new(window,Rect(380, 20+~topAdd3, 20, 80))
	.action_{|v| ~amp3 = v.value; "amp3 = ".post; ~amp3.postln;};


/////////////////////////////////////////////////////WaveTable 3 Harminics

	n = 10;
	~wtHarm3G = MultiSliderView(window,Rect(420,20+~topAdd3,n*13+2,100));
	~wtHarm3G.value = [~h3_1, ~h3_2, ~h3_3, ~h3_4, ~h3_5, ~h3_6, ~h3_7, ~h3_8, ~h3_9, ~h3_10];
	~wtHarm3G.action = { arg q, mul = 1;
		if (q.index == 0) {~h3_1 = q.currentvalue*mul; ~h3_1.postln;};
		if (q.index == 1) {~h3_2 = q.currentvalue*mul; ~h3_2.postln;};
		if (q.index == 2) {~h3_3 = q.currentvalue*mul; ~h3_3.postln;};
		if (q.index == 3) {~h3_4 = q.currentvalue*mul; ~h3_4.postln;};
		if (q.index == 4) {~h3_5 = q.currentvalue*mul; ~h3_5.postln;};
		if (q.index == 5) {~h3_6 = q.currentvalue*mul; ~h3_6.postln;};
		if (q.index == 6) {~h3_7 = q.currentvalue*mul; ~h3_7.postln;};
		if (q.index == 7) {~h3_8 = q.currentvalue*mul; ~h3_8.postln;};
		if (q.index == 8) {~h3_9 = q.currentvalue*mul; ~h3_9.postln;};
		if (q.index == 9) {~h3_10 = q.currentvalue*mul; ~h3_10.postln;};
		~wtHarm3G.value = [~h3_1, ~h3_2, ~h3_3, ~h3_4, ~h3_5, ~h3_6, ~h3_7, ~h3_8, ~h3_9, ~h3_10];

	};


/////////////////////////////////////////////////////WaveTable 3 Transpose

~midiTranspose3G = EZPopUpMenu.new(window, Rect(320,130+~topAdd3, 230, 22), "Transpose",
    [
		"+4 oct" ->{( "+4 oct").postln; ~midiTranspose3 = 2.pow(4)},
		"+3 oct" ->{( "+3 oct").postln; ~midiTranspose3 = 2.pow(3)},
		"+2 oct" ->{( "+2 oct").postln; ~midiTranspose3 = 2.pow(2)},
		"+12" ->{( "+12").postln; ~midiTranspose3 = 2.pow(12/12)},
		"+11" ->{( "+11").postln; ~midiTranspose3 = 2.pow(11/12)},
		"+10" ->{( "+10").postln; ~midiTranspose3 = 2.pow(10/12)},
		"+9" ->{( "+9").postln; ~midiTranspose3 = 2.pow(9/12)},
		"+8" ->{( "+8").postln; ~midiTranspose3 = 2.pow(8/12)},
		"+7" ->{( "+7").postln; ~midiTranspose3 = 2.pow(7/12)},
		"+6" ->{( "+6").postln; ~midiTranspose3 = 2.pow(6/12)},
		"+5" ->{( "+5").postln; ~midiTranspose3 = 2.pow(5/12)},
		"+4" ->{( "+4").postln; ~midiTranspose3 = 2.pow(4/12)},
		"+3" ->{( "+3").postln; ~midiTranspose3 = 2.pow(3/12)},
		"+2" ->{( "+2").postln; ~midiTranspose3 = 2.pow(2/12)},
		"+1" ->{( "+1").postln; ~midiTranspose3 = 2.pow(1/12)},
		" 0 " ->{( "0").postln; ~midiTranspose3 = 1;},
		"-1" ->{( "-1").postln; ~midiTranspose3 = 1/2.pow(1/12)},
		"-2" ->{( "-2").postln; ~midiTranspose3 = 1/2.pow(2/12)},
		"-3" ->{( "-3").postln; ~midiTranspose3 = 1/2.pow(3/12)},
		"-4" ->{( "-4").postln; ~midiTranspose3 = 1/2.pow(4/12)},
		"-5" ->{( "-5").postln; ~midiTranspose3 = 1/2.pow(5/12)},
		"-6" ->{( "-6").postln; ~midiTranspose3 = 1/2.pow(6/12)},
		"-7" ->{( "-7").postln; ~midiTranspose3 = 1/2.pow(7/12)},
		"-8" ->{( "-8").postln; ~midiTranspose3 = 1/2.pow(8/12)},
		"-9" ->{( "-9").postln; ~midiTranspose3 = 1/2.pow(9/12)},
		"-10" ->{( "-10").postln; ~midiTranspose3 = 1/2.pow(10/12)},
		"-11" ->{( "-11").postln; ~midiTranspose3 = 1/2.pow(11/12)},
		"-12" ->{( "-12").postln; ~midiTranspose3 = 1/2.pow(12/12)},
		"-2 oct" ->{( "-2 oct").postln; ~midiTranspose3 = 1/2.pow(2)},
		"-3 oct" ->{( "-3 oct").postln; ~midiTranspose3 = 1/2.pow(3)},
		"-4 oct" ->{( "-4 oct").postln; ~midiTranspose3 =1/2.pow(4)},
	],
	globalAction: { ("cents ").postln;},
    initVal: 15,
    initAction: true,
    labelWidth: 180,
    labelHeight: 20,
    layout: \horz,
    gap: 2@2
);

/////////////////////////////////////////////////////WaveTable 3 Envelope

~atk3G = EZKnob.new(window, Rect(10, 25+~topAdd3, 70, 100), "ATK", ControlSpec(0.001, 2,  'lin',  0.001) , layout: \vert2 )
	.action_{|v|
	                        ~atk3 = ~atk3G.value;		"atk3 = ".post; ~atk3.postln; };

~dec3G = EZKnob.new(window,Rect(100, 25+~topAdd3, 70, 100), "DEC", ControlSpec(0.001, 0.8,  'lin',  0.001) , layout: \vert2 )
	.action_{|v|
            			 	~dec3 = ~dec3G.value ;	"dec3 = ".post; ~dec3.postln; };

~sus3G = EZKnob.new(window,Rect(190, 25+~topAdd3, 70, 100), "SUS", ControlSpec(0.001, 1.4,  'lin',  0.001) , layout: \vert2 )
	.action_{|v|
	                        ~sus3 = ~sus3G.value;     "sus3 = ".post; ~sus3.postln; };

~rel3G = EZKnob.new(window,Rect(280, 25+~topAdd3, 70, 100), "REL", ControlSpec(0.001,  3,  'lin',  0.001) , layout: \vert2 )
	.action_{|v|
				            ~rel3 = ~rel3G.value;		"rel3 = ".post; ~rel3.postln;};


/////////////////////////////////////////////////////WaveTable 3 Bend-Ratio-Time

~bendRatioMul3G = EZNumber.new(window,Rect(80, 130+~topAdd3, 40, 30), nil, ControlSpec(0.08, 100,  'lin',  0.01))
     .action_{|v| ~bendRatioMul3 = v.value; "Bend Ratio Mul = ".post; ~bendRatioMul3.postln;};
			StaticText.new(window,Rect(60, 160+~topAdd3, 100, 20))
				.string_("Bend Ratio Mul");

~bendDur3G = EZNumber.new(window,Rect(180, 130+~topAdd3, 40, 30), nil, ControlSpec(0.01, 10,  'lin',  0.01))
   	.action_{|v| ~freqDur1_3 = v.value; "Bend Dur = ".post; ~freqDur1_3.postln;};
			StaticText.new(window,Rect(180, 160+~topAdd3, 100, 20))
				.string_("Bend Dur");


///////////////////////////Modulator Oscillator 3 Controls
//============================================================
~topAdd = 200;

StaticText.new(window,Rect(150, ~topAdd3+~topAdd, 200, 20)).string_("FeedBack Modulator");

~mod3SwitchG = Button.new(window,Rect(100, ~topAdd3+~topAdd-5, 25, 25))
	.states_([ [ "OFF", Color(0), Color(0.4) ], [ "ON", Color(0), Color(1.0) ] ])
	.action_{|v| (if (v.value == 1) {~mod3Switch = 1}{~mod3Switch = 0})};

/////////////////////////////////////////////////////Modulator 3 Envelope

~atkM3G = EZKnob.new(window, Rect(10,  20+~topAdd3+~topAdd, 70, 100), "ATK", ControlSpec(0.001, 2,  'lin',  0.001) , layout: \vert2 )
	.action_{|v|
	                        ~atkM3 = ~atkM3G.value;		"atkM3 = ".post; ~atkM3.postln; };


~decM3G = EZKnob.new(window, Rect(100, 20+~topAdd3+~topAdd, 70, 100), "DEC", ControlSpec(0.001, 0.8,  'lin',  0.001) , layout: \vert2 )
	.action_{|v|
            			 	~decM3 = ~decM3G.value;	"decM3 = ".post; ~decM3.postln;};


~susM3G = EZKnob.new(window,Rect(190, 20+~topAdd3+~topAdd, 70, 100), "SUS", ControlSpec(0.001, 1,  'lin',  0.001) , layout: \vert2 )
	.action_{|v|
           			    	~susM3 = ~susM3G.value;	"susM3 = ".post; ~susM3.postln;};


~relM3G = EZKnob.new(window,Rect(280, 20+~topAdd3+~topAdd, 70, 100), "REL", ControlSpec(0.001, 3,  'lin',  0.001) , layout: \vert2 )
	.action_{|v|
            				~relM3 = ~relM3G.value; 	     "relM3 = ".post; ~relM3.postln;};


//Modulators 3 Frequency
~freqMMul3G = NumberBox.new(window,Rect(370, 20+~topAdd3+~topAdd, 30, 30))
	.action_{|v| ~freqMMul3 = v.value; "FreqMod3 Mul = ".post; ~freqMMul3.postln;};
			StaticText.new(window,Rect(350, 60+~topAdd3+~topAdd, 100, 20))
				.string_("Freq MOD Mul");

//Modulators 3 Amplitude
~ampM3G = NumberBox.new(window,Rect(460, 20+~topAdd3+~topAdd, 30, 30))
	.action_{|v| ~ampM3 = v.value; "AmpMod3 = ".post; ~ampM3.postln;};
			StaticText.new(window,Rect(460, 60+~topAdd3+~topAdd, 100, 20))
				.string_("Amp MOD");

//Modulators 3 FeedBack
~fbM3G = EZSlider.new(window,Rect(370, 90+~topAdd3+~topAdd, 140, 20), nil, ControlSpec(0, 10,  'lin',  0.01))
	.action_{|v| ~fbM3 = v.value; "FeedBackMod_3 = ".post; ~fbM3.postln;};
			StaticText.new(window,Rect(395, 110+~topAdd3+~topAdd, 100, 20))
				.string_("FeedBack");



///////////////////////////LFO Oscillator Controls
//============================================================
//LFO Frequency
//LFO Amplitude
//LFO Mix

///////////////////////////Algorith Set Menu
//============================================================

StaticText.new(window,Rect(260+~leftAdd, 180+~topAdd, 100, 20))
				.string_("Algorythm");

~algMenu = PopUpMenu.new(window,Rect(260+~leftAdd, 200+~topAdd,180,20));
    ~algMenu.items = [ "1 - 2 - 3",  "2 FM to 1",  "3 FM to 2",  "3 FM to 2 FM to 1" ];
	~algMenu.action = { arg v; //v.value.postln;

	    if (v.value == 0) { ~outWT2 = [0, 1]; ~amp2 = 1;  ~outWT3 = [0, 1];  ~amp3 = 1; "1-2".postln;

			~amp2G_2.remove;
			~amp2G_2Text.remove;
			~amp3G_2.remove;
			~amp3G_2Text.remove;

	      };


		if (v.value == 1) {~outWT2 = ~mod2To1; ~amp2 = 100; ~outWT3 = [0, 1]; "2 FM to 1".postln;

		    ~amp2G_2.remove;
			~amp2G_2Text.remove;
		    ~amp2G_2 = NumberBox.new(window,Rect(580+~leftAdd, 20, 30, 30))
					.action_{|v| ~amp2 = v.value; "WT_2 MOD Amp = ".post; ~amp2.postln;};
			~amp2G_2Text = StaticText.new(window,Rect(560+~leftAdd, 50, 100, 20))
							.string_("WT_MOD Amp");

			~amp2G_2.value = 100;
		    ~amp3G_2.remove;
			~amp3G_2Text.remove;

	  };


	  if (v.value == 2) { ~outWT3 = ~mod3To2; ~amp3 = 100; "3 FM to 2".postln;

			~amp3G_2.remove;
     		~amp3G_2Text .remove;
		    ~amp3G_2 = NumberBox.new(window,Rect(580, 20+~topAdd3, 30, 30))
					.action_{|v| ~amp3 = v.value; "WT_3 MOD Amp = ".post; ~amp3.postln;};
			~amp3G_2Text = StaticText.new(window,Rect(560, 50+~topAdd3, 100, 20))
							.string_("WT_MOD Amp");

			~amp3G_2.value = 100;

        	~outWT2 = [0, 1]; ~amp2 = 1;
		    ~amp2G_2.remove;
			~amp2G_2Text.remove;


	   };


	 if (v.value == 3) { ~outWT2 = ~mod2To1; ~amp2 = 100; "3 FM to 2 FM to 1".postln;
		                         ~outWT3 = ~mod3To2; ~amp3 = 100;

		   ~amp2G_2.remove; ~amp2G_2Text .remove; ~amp3G_2.remove; ~amp3G_2Text .remove;

		   ~amp2G_2 = NumberBox.new(window,Rect(580+~leftAdd, 20, 30, 30))
					.action_{|v| ~amp2 = v.value; "WT_2 MOD Amp = ".post; ~amp2.postln;};
			~amp2G_2Text = StaticText.new(window,Rect(560+~leftAdd, 50, 100, 20))
							.string_("WT_MOD Amp");
		    ~amp3G_2 = NumberBox.new(window,Rect(580, 20+~topAdd3, 30, 30))
					.action_{|v| ~amp3 = v.value; "WT_3 MOD Amp = ".post; ~amp3.postln;};
			~amp3G_2Text = StaticText.new(window,Rect(560, 50+~topAdd3, 100, 20))
							.string_("WT_MOD Amp");

     		~amp2G_2.value = 100;
	    	~amp3G_2.value = 100;


	  };



};

///////////////////////////PRESETS
//============================================================

////Run Default Preset
PresetFMDefault.load;

~presetPostG = Button.new(window,Rect(460+~leftAdd, 250+~topAdd, 80, 25))
	.states_([ [ "PRESET", Color(0), Color(120) ], [ "OK", Color(0), Color(1.0) ] ])
.action_{|v| (if (v.value == 1) {PresetPost.new}{"".postln;})};




StaticText.new(window,Rect(260+~leftAdd, 230+~topAdd, 100, 20))
				.string_("Presets");

~presetMenu = PopUpMenu.new(window,Rect(260+~leftAdd, 250+~topAdd,180,20));
     ~presetMenu.items = ["Preset_Default","Preset_2", "Preset_3 high", "Preset_4", "Preset_5 perc"];
     ~presetMenu.action = { arg v; //v.value.postln;
		if (v.value == 0) {PresetFMDefault.load;};
		if (v.value == 1) {PresetFM_2.load;};
		if (v.value == 2) {PresetFM_3.load;};
		if (v.value == 3) {PresetFM_4.load;};
		if (v.value == 4) {PresetFM_5.load;};
};



	}

}









