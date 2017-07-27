PresetFM_2 {

//class methods

	*load {

	"PresetFM_2.load OK".postln;

	////////////////HybFMSynth Preset 2

~h1 = 1; ~h2 = 1/2; ~h3 = 1/3; ~h4 = 1/4; ~h5 = 1/5; ~h6 = 1/6; ~h7 = 1/7; ~h8 = 1/8; ~h9 = 1/9; ~h10 = 1/10;
~waveTableCur_Buffer.sine3((1.0..10), [~h1, ~h2, ~h3, ~h4, ~h5, ~h6, ~h7, ~h8, ~h9, ~h10], 0, true, true, true);
~wtHarmG.value = [~h1, ~h2, ~h3, ~h4, ~h5, ~h6, ~h7, ~h8, ~h9, ~h10];

	~bendRatioMul = 2; ~bendRatioMulG.value = ~bendRatioMul;

	~freqDur1 = 0.05; ~bendDurG.value = ~freqDur1;
	~freqDur2 = 0.001;
	~amp = 1; ~ampG.value = ~amp;

	~atk = 0.983; ~atkG.value = ~atk;
	~dec = 0.541; ~decG.value = ~dec;
	~sus = 0.465;   ~susG.value = ~sus;
	~rel = 0.634; ~relG.value = ~rel;

	~curSwitch = 0; ~curSwitchG.value = ~curSwitch;


	//////////////Modulators Controlls
	//=================================

	~ampM = 1000; ~ampMG.value = ~ampM;
	~freqMMul = 120; ~freqMMulG.value = ~freqMMul;


	~atkM = 0.7; ~atkMG.value = ~atkM;
	~decM = 0.3; ~decMG.value = ~decM;
	~susM = 1;   ~susMG.value = ~susM;
	~relM = 0.4; ~relMG.value = ~relM;
	~fbM = 0; ~fbMG.value = ~fbM;

	~modSwitch = 0; ~modSwitchG.value = ~modSwitch;


	//////////////Carrier 2 Controlls
	//=================================

//~waveTableCur_Buffer2.sine3([1, 2, 3, 4], 1.0/[1, 2, 3, 0.1], 0, true, true, true);
~h2_1 = 0.1; ~h2_2 = 1/20; ~h2_3 = 1/30; ~h2_4 = 1; ~h2_5 = 0; ~h2_6 = 0; ~h2_7 = 0; ~h2_8 = 0; ~h2_9 = 0; ~h2_10 = 0;
~waveTableCur_Buffer2.sine3((1.0..10), [~h2_1, ~h2_2, ~h2_3, ~h2_4, ~h2_5, ~h2_6, ~h2_7, ~h2_8, ~h2_9, ~h2_10], 0, true, true, true);
~wtHarm2G.value = [~h2_1, ~h2_2, ~h2_3, ~h2_4, ~h2_5, ~h2_6, ~h2_7, ~h2_8, ~h2_9, ~h2_10];
	~bendRatioMul2 = 10; ~bendRatioMul2G.value = ~bendRatioMul2;

	~freqDur1_2 = 0.01; ~bendDur2G.value = ~freqDur1_2;

	~freqDur2_2 = 0.001;
	~amp2 = 1; ~amp2G.value = ~amp2;

	~atk2 = 0.0175; ~atk2G.value = ~atk2;
	~dec2 = 0.152; ~dec2G.value = ~dec2;
	~sus2 = 0.157;   ~sus2G.value = ~sus2;
	~rel2 = 0.622; ~rel2G.value = ~rel2;

	~cur2Switch = 1; ~cur2SwitchG.value = ~cur2Switch;


	//////////////Modulators 2 Controlls
	//=================================

	~ampM2 = 500; ~ampM2G.value = ~ampM2;
	~freqMMul2 = 1.2; ~freqMMul2G.value = ~freqMMul2;

	~atkM2 = 0.085; ~atkM2G.value = ~atkM2;
	~decM2 = 0.3; ~decM2G.value = ~decM2;
	~susM2 = 1;   ~susM2G.value = ~susM2;
	~relM2 = 0.4; ~relM2G.value = ~relM2;
	~fbM2 = 0; ~fbM2G.value = ~fbM2;

	~mod2Switch = 1; ~mod2SwitchG.value = ~mod2Switch;


	//////////////Algorythm Defaults
	//=================================

     //	~mod2To1 = Bus.new(\audio, 50, 1);
	//~outWT2 = ~mod2To1; ~amp2 = 100;

	~algMenu.value = 0;
	~outWT2 = [0, 1]; ~amp2 = 1;


		}

}









