PresetFM_4 {

//class methods

	*load { var preset_4;

preset_4 =
[1,0,0,0,0,0,0,0,0,0,2,0.05,0.001,1,0.7,0.3,1,2,1,1000,1,2,0.3,1,3,0.7,1,1,0,0,0,0,0.95121949911118,0,0,0,0,10,0.01,0.001,100,0.01,0.3,1,0.4,1,500,1,0.85,0.3,1,3,0,1,1,0,0,0,0,0,0,0,0,0,10,0.01,0.001,1,0.01,0.3,0.724,0.4,1,500,1.5,1.207,0.125,1,3,0,1,3,15,27,2,1,0.5];


/////////////////////////////////////////HybFMSynth Preset Deafault  Antistrofi Diadikasia
//==========================================================



//////Defaults

//////////////Carrier Controlls
//=============================

~h1 = preset_4[0];
~h2 = preset_4[1];
~h3 = preset_4[2];
~h4 = preset_4[3];
~h5 = preset_4[4];
~h6 = preset_4[5];
~h7 = preset_4[6];
~h8 = preset_4[7];
~h9 = preset_4[8];
~h10 = preset_4[9];
                                          ~wtHarmG.value = [~h1, ~h2, ~h3, ~h4, ~h5, ~h6, ~h7, ~h8, ~h9, ~h10];



~bendRatioMul = preset_4[10];           ~bendRatioMulG.value = ~bendRatioMul;

~freqDur1 = preset_4[11];             ~bendDurG.value = ~freqDur1;
~freqDur2 = preset_4[12];
~amp = preset_4[13];                          ~ampG.value = ~amp;

~atk = preset_4[14];                        ~atkG.value = ~atk;
~dec = preset_4[15];                       ~decG.value = ~dec;
~sus = preset_4[16];                          ~susG.value = ~sus;
~rel = preset_4[17];                            ~relG.value = ~rel;

~curSwitch = preset_4[18];           ~curSwitchG.value = ~curSwitch;


//////////////Modulators Controlls
//=================================

~ampM = preset_4[19];                     ~ampMG.value = ~ampM;
~freqMMul = preset_4[20];                 ~freqMMulG.value = ~freqMMul;


~atkM = preset_4[21];                          ~atkMG.value = ~atkM;
~decM = preset_4[22];                         ~decMG.value = ~decM;
~susM = preset_4[23];                            ~susMG.value = ~susM;
~relM = preset_4[24];                           ~relMG.value = ~relM;
~fbM = preset_4[25];                                ~fbMG.value = ~fbM;

~modSwitch = preset_4[26];                 ~modSwitchG.value = ~modSwitch;


//////////////Carrier 2 Controlls
//=================================

~h2_1 = preset_4[27];
~h2_2 = preset_4[28];
~h2_3 = preset_4[29];
~h2_4 = preset_4[30];
~h2_5 = preset_4[31];
~h2_6 = preset_4[32];
~h2_7 = preset_4[33];
~h2_8 = preset_4[34];
~h2_9 = preset_4[35];
~h2_10 = preset_4[36];
                                                      ~wtHarm2G.value = [~h2_1, ~h2_2, ~h2_3, ~h2_4, ~h2_5, ~h2_6, ~h2_7, ~h2_8, ~h2_9, ~h2_10];



~bendRatioMul2 = preset_4[37];                          ~bendRatioMul2G.value = ~bendRatioMul2;

~freqDur1_2 = preset_4[38];                                ~bendDur2G.value = ~freqDur1_2;
~freqDur2_2 = preset_4[39];
~amp2 = preset_4[40];                                                    ~amp2G.value = ~amp2;

~atk2 = preset_4[41];                                                   ~atk2G.value = ~atk2;
~dec2 = preset_4[42];                                                    ~dec2G.value = ~dec2;
~sus2 = preset_4[43];                                                       ~sus2G.value = ~sus2;
~rel2 = preset_4[44];                                                      ~rel2G.value = ~rel2;

~cur2Switch = preset_4[45];                                         ~cur2SwitchG.value = ~cur2Switch;


//////////////Modulators 2 Controlls
//=================================

~ampM2 = preset_4[46];                                     ~ampM2G.value = ~ampM2;
~freqMMul2 = preset_4[47];                                  ~freqMMul2G.value = ~freqMMul2;

~atkM2 = preset_4[48];                                      ~atkM2G.value = ~atkM2;
~decM2 = preset_4[49];                                      ~decM2G.value = ~decM2;
~susM2 = preset_4[50];                                         ~susM2G.value = ~susM2;
~relM2 = preset_4[51];                                          ~relM2G.value = ~relM2;
~fbM2 = preset_4[52];                                             ~fbM2G.value = ~fbM2;

~mod2Switch = preset_4[53];                             ~mod2SwitchG.value = ~mod2Switch;



//////////////Carrier 3 Controlls
//=================================

~h3_1 = preset_4[54];
~h3_2 = preset_4[55];
~h3_3 = preset_4[56];
~h3_4 = preset_4[57];
~h3_5 = preset_4[58];
~h3_6 = preset_4[59];
~h3_7 = preset_4[60];
~h3_8 = preset_4[61];
~h3_9 =preset_4[62];
~h3_10 = preset_4[63];

                                                                        ~wtHarm3G.value = [~h3_1, ~h3_2, ~h3_3, ~h3_4, ~h3_5, ~h3_6, ~h3_7, ~h3_8, ~h3_9, ~h3_10];

~bendRatioMul3 =preset_4[64];                   ~bendRatioMul3G.value = ~bendRatioMul3;

~freqDur1_3 = preset_4[65];                        ~bendDur3G.value = ~freqDur1_3;
~freqDur2_3 = preset_4[66];
~amp3 = preset_4[67];                                 ~amp3G.value = ~amp3;

~atk3 = preset_4[68];                                   ~atk3G.value = ~atk3;
~dec3 = preset_4[69];                                   ~dec3G.value = ~dec3;
~sus3 = preset_4[70];                                   ~sus3G.value = ~sus3;
~rel3 = preset_4[71];                                    ~rel3G.value = ~rel3;

~cur3Switch = preset_4[72];                         ~cur3SwitchG.value = ~cur3Switch;


//////////////Modulators 3 Controlls
//=================================

~ampM3 = preset_4[73];                            ~ampM3G.value = ~ampM3;
~freqMMul3 = preset_4[74];                          ~freqMMul3G.value = ~freqMMul3;

~atkM3 = preset_4[75];                                 ~atkM3G.value = ~atkM3;
~decM3 = preset_4[76];                                ~decM3G.value = ~decM3;
~susM3 = preset_4[77];                                     ~susM3G.value = ~susM3;
~relM3 = preset_4[78];                                      ~relM3G.value = ~relM3;
~fbM3 = preset_4[79];                                      ~fbM3G.value = ~fbM3;

~mod3Switch = preset_4[80];                               ~mod3SwitchG.value = ~mod3Switch;


//////////////WaveTable Transposes
//=================================

~midiTranspose1G.value = preset_4[81];      //      ~midiTranspose1G.value = ~midiTranspose1;
~midiTranspose2G.value = preset_4[82];      //    ~midiTranspose2G.value = ~midiTranspose2;
~midiTranspose3G.value = preset_4[83];      //    ~midiTranspose3G.value = ~midiTranspose3;

~midiTranspose1 = preset_4[84];
~midiTranspose2 = preset_4[85];
~midiTranspose3 = preset_4[86];


//////////////AlgoRythm Set
//====================

~algMenu.value = 1;
~outWT2 = ~mod2To1; ~amp2 = 100;


		"PresetFM_4 loaded OK".postln;



	}

}









