PresetFMDefault {

//class methods

	*load {


	////////////////HybFMSynth Preset Deafault

	//////Defaults

	//////////////Carrier Controlls
	//=============================

~h1 = 1; ~h2 = 1/2; ~h3 = 1/3; ~h4 = 1/4; ~h5 = 1/5; ~h6 = 1/6; ~h7 = 1/7; ~h8 = 1/8; ~h9 = 1/9; ~h10 = 1/10;
~waveTableCur_Buffer.sine3((1.0..10), [~h1, ~h2, ~h3, ~h4, ~h5, ~h6, ~h7, ~h8, ~h9, ~h10], 0, true, true, true);
~wtHarmG.value = [~h1, ~h2, ~h3, ~h4, ~h5, ~h6, ~h7, ~h8, ~h9, ~h10];
	~bendRatioMul = 2; ~bendRatioMulG.value = ~bendRatioMul;

	~freqDur1 = 0.05; ~bendDurG.value = ~freqDur1;
	~freqDur2 = 0.001;
	~amp = 1; ~ampG.value = ~amp;

	 ~midiTranspose1 = 1;   ~midiTranspose1G.value = 15;

	~atk = 0.7; ~atkG.value = ~atk;
	~dec = 0.3; ~decG.value = ~dec;
	~sus = 1;   ~susG.value = ~sus;
	~rel = 2; ~relG.value = ~rel;

	~curSwitch = 1; ~curSwitchG.value = ~curSwitch;


	//////////////Modulators Controlls
	//=================================

	~ampM = 1000; ~ampMG.value = ~ampM;
	~freqMMul = 120; ~freqMMulG.value = ~freqMMul;


	~atkM = 0.7; ~atkMG.value = ~atkM;
	~decM = 0.3; ~decMG.value = ~decM;
	~susM = 1;   ~susMG.value = ~susM;
	~relM = 0.4; ~relMG.value = ~relM;
	~fbM = 0; ~fbMG.value = ~fbM;

	~modSwitch = 1; ~modSwitchG.value = ~modSwitch;


	//////////////Carrier 2 Controlls
	//=================================

~h2_1 = 1; ~h2_2 = 1/2; ~h2_3 = 1/3; ~h2_4 = 1/4; ~h2_5 = 1/5; ~h2_6 = 1/6; ~h2_7 = 1/7; ~h2_8 = 1/8; ~h2_9 = 1/9; ~h2_10 = 1/10;
~waveTableCur_Buffer2.sine3((1.0..10), [~h2_1, ~h2_2, ~h2_3, ~h2_4, ~h2_5, ~h2_6, ~h2_7, ~h2_8, ~h2_9, ~h2_10], 0, true, true, true);
~wtHarm2G.value = [~h2_1, ~h2_2, ~h2_3, ~h2_4, ~h2_5, ~h2_6, ~h2_7, ~h2_8, ~h2_9, ~h2_10];

	~bendRatioMul2 = 10; ~bendRatioMul2G.value = ~bendRatioMul2;

	~freqDur1_2 = 0.01; ~bendDur2G.value = ~freqDur1_2;
	~freqDur2_2 = 0.001;
	~amp2 = 1; ~amp2G.value = ~amp2;

	 ~midiTranspose2 = 1;   ~midiTranspose2G.value = 15;

	~atk2 = 0.01; ~atk2G.value = ~atk2;
	~dec2 = 0.3; ~dec2G.value = ~dec2;
	~sus2 = 1;   ~sus2G.value = ~sus2;
	~rel2 = 0.4; ~rel2G.value = ~rel2;

	~cur2Switch = 1; ~cur2SwitchG.value = ~cur2Switch;


	//////////////Modulators 2 Controlls
	//=================================

	~ampM2 = 500; ~ampM2G.value = ~ampM2;
	~freqMMul2 = 2; ~freqMMul2G.value = ~freqMMul2;

	~atkM2 = 0.7; ~atkM2G.value = ~atkM2;
	~decM2 = 0.3; ~decM2G.value = ~decM2;
	~susM2 = 1;   ~susM2G.value = ~susM2;
	~relM2 = 0.4; ~relM2G.value = ~relM2;
	~fbM2 = 0; ~fbM2G.value = ~fbM2;

	~mod2Switch = 1; ~mod2SwitchG.value = ~mod2Switch;



	//////////////Carrier 3 Controlls
	//=================================

~h3_1 = 1; ~h3_2 = 1/2; ~h3_3 = 1/3; ~h3_4 = 1/4; ~h3_5 = 1/5; ~h3_6 = 1/6; ~h3_7 = 1/7; ~h3_8 = 1/8; ~h3_9 = 1/9; ~h3_10 = 1/10;
~waveTableCur_Buffer3.sine3((1.0..10), [~h3_1, ~h3_2, ~h3_3, ~h3_4, ~h3_5, ~h3_6, ~h3_7, ~h3_8, ~h3_9, ~h3_10], 0, true, true, true);
~wtHarm3G.value = [~h3_1, ~h3_2, ~h3_3, ~h3_4, ~h3_5, ~h3_6, ~h3_7, ~h3_8, ~h3_9, ~h3_10];

	~bendRatioMul3 = 10; ~bendRatioMul3G.value = ~bendRatioMul3;

	~freqDur1_3 = 0.01; ~bendDur3G.value = ~freqDur1_3;
	~freqDur2_3 = 0.001;
	~amp3 = 1; ~amp3G.value = ~amp3;

	 ~midiTranspose3 = 1;   ~midiTranspose3G.value = 15;

	~atk3 = 0.01; ~atk3G.value = ~atk3;
	~dec3 = 0.3; ~dec3G.value = ~dec3;
	~sus3 = 1;   ~sus3G.value = ~sus3;
	~rel3 = 0.4; ~rel3G.value = ~rel3;

	~cur3Switch = 1; ~cur3SwitchG.value = ~cur3Switch;


	//////////////Modulators 3 Controlls
	//=================================

	~ampM3 = 500; ~ampM3G.value = ~ampM3;
	~freqMMul3 = 2; ~freqMMul3G.value = ~freqMMul3;

	~atkM3 = 0.7; ~atkM3G.value = ~atkM3;
	~decM3 = 0.3; ~decM3G.value = ~decM3;
	~susM3 = 1;   ~susM3G.value = ~susM3;
	~relM3 = 0.4; ~relM3G.value = ~relM3;
	~fbM3 = 0; ~fbM3G.value = ~fbM3;

	~mod3Switch = 1; ~mod3SwitchG.value = ~mod3Switch;

	//////////////Algorythm Defaults
	//=================================

	~mod2To1 = Bus.new(\audio, 50, 1);
    ~mod3To2 = Bus.new(\audio, 60, 1);

	~algMenu.value = 0;

	~outWT2 = [0, 1]; ~amp2 = 1;
	~outWT3 = [0, 1]; ~amp3 = 1;




//__if Everything is OK post!!

		"PresetFMDefault loaded OK".postln;

	}

}










