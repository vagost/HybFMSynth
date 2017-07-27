PresetFM_5 {

//class methods

	*load { var preset_5;

preset_5 =
[1,0,0,0,0,0,0,0,0,0,12,0.01,0.001,1,0.7,0.3,1,2,1,100,1,0.929,0.3,1,0.4,0,1,1,0,0,0,0,0,0,0,0,0,10,0.01,0.001,1,0.001,0.3,1,0.4,1,100,9,1.41,0.3,1,0.4,0,1,0,0.23170731961727,0.54878050088882,0.74390244483948,1,1,1,1,1,1,1,2,0.001,1,2,0.8,0.152,2.88,1,100,69,0.7,0.3,1,0.4,10,0,15,15,27,1,1,0.5,0,[ 0, 1 ],[ 0, 1 ]];

/////////////////////////////////////////HybFMSynth Preset Deafault  Antistrofi Diadikasia
//==========================================================



//////Defaults

//////////////Carrier Controlls
//=============================

~h1 = preset_5[0];
~h2 = preset_5[1];
~h3 = preset_5[2];
~h4 = preset_5[3];
~h5 = preset_5[4];
~h6 = preset_5[5];
~h7 = preset_5[6];
~h8 = preset_5[7];
~h9 = preset_5[8];
~h10 = preset_5[9];
                                          ~wtHarmG.value = [~h1, ~h2, ~h3, ~h4, ~h5, ~h6, ~h7, ~h8, ~h9, ~h10];



~bendRatioMul = preset_5[10];           ~bendRatioMulG.value = ~bendRatioMul;

~freqDur1 = preset_5[11];             ~bendDurG.value = ~freqDur1;
~freqDur2 = preset_5[12];
~amp = preset_5[13];                          ~ampG.value = ~amp;

~atk = preset_5[14];                        ~atkG.value = ~atk;
~dec = preset_5[15];                       ~decG.value = ~dec;
~sus = preset_5[16];                          ~susG.value = ~sus;
~rel = preset_5[17];                            ~relG.value = ~rel;

~curSwitch = preset_5[18];           ~curSwitchG.value = ~curSwitch;


//////////////Modulators Controlls
//=================================

~ampM = preset_5[19];                     ~ampMG.value = ~ampM;
~freqMMul = preset_5[20];                 ~freqMMulG.value = ~freqMMul;


~atkM = preset_5[21];                          ~atkMG.value = ~atkM;
~decM = preset_5[22];                         ~decMG.value = ~decM;
~susM = preset_5[23];                            ~susMG.value = ~susM;
~relM = preset_5[24];                           ~relMG.value = ~relM;
~fbM = preset_5[25];                                ~fbMG.value = ~fbM;

~modSwitch = preset_5[26];                 ~modSwitchG.value = ~modSwitch;


//////////////Carrier 2 Controlls
//=================================

~h2_1 = preset_5[27];
~h2_2 = preset_5[28];
~h2_3 = preset_5[29];
~h2_4 = preset_5[30];
~h2_5 = preset_5[31];
~h2_6 = preset_5[32];
~h2_7 = preset_5[33];
~h2_8 = preset_5[34];
~h2_9 = preset_5[35];
~h2_10 = preset_5[36];
                                                      ~wtHarm2G.value = [~h2_1, ~h2_2, ~h2_3, ~h2_4, ~h2_5, ~h2_6, ~h2_7, ~h2_8, ~h2_9, ~h2_10];



~bendRatioMul2 = preset_5[37];                          ~bendRatioMul2G.value = ~bendRatioMul2;

~freqDur1_2 = preset_5[38];                                ~bendDur2G.value = ~freqDur1_2;
~freqDur2_2 = preset_5[39];
~amp2 = preset_5[40];                                                    ~amp2G.value = ~amp2;

~atk2 = preset_5[41];                                                   ~atk2G.value = ~atk2;
~dec2 = preset_5[42];                                                    ~dec2G.value = ~dec2;
~sus2 = preset_5[43];                                                       ~sus2G.value = ~sus2;
~rel2 = preset_5[44];                                                      ~rel2G.value = ~rel2;

~cur2Switch = preset_5[45];                                         ~cur2SwitchG.value = ~cur2Switch;


//////////////Modulators 2 Controlls
//=================================

~ampM2 = preset_5[46];                                     ~ampM2G.value = ~ampM2;
~freqMMul2 = preset_5[47];                                  ~freqMMul2G.value = ~freqMMul2;

~atkM2 = preset_5[48];                                      ~atkM2G.value = ~atkM2;
~decM2 = preset_5[49];                                      ~decM2G.value = ~decM2;
~susM2 = preset_5[50];                                         ~susM2G.value = ~susM2;
~relM2 = preset_5[51];                                          ~relM2G.value = ~relM2;
~fbM2 = preset_5[52];                                             ~fbM2G.value = ~fbM2;

~mod2Switch = preset_5[53];                             ~mod2SwitchG.value = ~mod2Switch;



//////////////Carrier 3 Controlls
//=================================

~h3_1 = preset_5[54];
~h3_2 = preset_5[55];
~h3_3 = preset_5[56];
~h3_4 = preset_5[57];
~h3_5 = preset_5[58];
~h3_6 = preset_5[59];
~h3_7 = preset_5[60];
~h3_8 = preset_5[61];
~h3_9 =preset_5[62];
~h3_10 = preset_5[63];

                                                                        ~wtHarm3G.value = [~h3_1, ~h3_2, ~h3_3, ~h3_4, ~h3_5, ~h3_6, ~h3_7, ~h3_8, ~h3_9, ~h3_10];

~bendRatioMul3 =preset_5[64];                   ~bendRatioMul3G.value = ~bendRatioMul3;

~freqDur1_3 = preset_5[65];                        ~bendDur3G.value = ~freqDur1_3;
~freqDur2_3 = preset_5[66];
~amp3 = preset_5[67];                                 ~amp3G.value = ~amp3;

~atk3 = preset_5[68];                                   ~atk3G.value = ~atk3;
~dec3 = preset_5[69];                                   ~dec3G.value = ~dec3;
~sus3 = preset_5[70];                                   ~sus3G.value = ~sus3;
~rel3 = preset_5[71];                                    ~rel3G.value = ~rel3;

~cur3Switch = preset_5[72];                         ~cur3SwitchG.value = ~cur3Switch;


//////////////Modulators 3 Controlls
//=================================

~ampM3 = preset_5[73];                            ~ampM3G.value = ~ampM3;
~freqMMul3 = preset_5[74];                          ~freqMMul3G.value = ~freqMMul3;

~atkM3 = preset_5[75];                                 ~atkM3G.value = ~atkM3;
~decM3 = preset_5[76];                                ~decM3G.value = ~decM3;
~susM3 = preset_5[77];                                     ~susM3G.value = ~susM3;
~relM3 = preset_5[78];                                      ~relM3G.value = ~relM3;
~fbM3 = preset_5[79];                                      ~fbM3G.value = ~fbM3;

~mod3Switch = preset_5[80];                               ~mod3SwitchG.value = ~mod3Switch;


//////////////WaveTable Transposes
//=================================

~midiTranspose1G.value = preset_5[81];      //      ~midiTranspose1G.value = ~midiTranspose1;
~midiTranspose2G.value = preset_5[82];      //    ~midiTranspose2G.value = ~midiTranspose2;
~midiTranspose3G.value = preset_5[83];      //    ~midiTranspose3G.value = ~midiTranspose3;

~midiTranspose1 = preset_5[84];
~midiTranspose2 = preset_5[85];
~midiTranspose3 = preset_5[86];



//////////////AlgoRythm Set
//====================

	~algMenu.value = 0;
	~outWT2 = [0, 1]; ~amp2 = 1;


		"PresetFM_5 loaded OK".postln;



	}

}









