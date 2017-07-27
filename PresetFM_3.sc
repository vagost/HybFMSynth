PresetFM_3 {

//class methods

	*load { var preset_3;

preset_3 =
[0.43902438879013,0.25609755516052,0,0.036585364490747,0,0,0,0,0,0,2,0.05,0.001,1,0.001,0.254,1,0.962,1,1000,0.25,0.001,0.119,0.281,0.001,0.42,1,1,0,0,0,0,0,0,0,0,0,10,0.01,0.001,1,0.01,0.3,1,0.4,1,500,2,0.7,0.3,1,0.4,0,1,0.085365854203701,0.20731706917286,0.28048780560493,0.39024388790131,0.46341463923454,0.47560974955559,0.45121949911118,0.21951219439507,0.073170728981495,0,0.5,0.1,0.001,0.39655172413793,0.001,0.3,1,0.4,1,500,0.25,0.164,0.296,0.001,0.4,0,1,15,27,27,1,0.5,0.5];


/////////////////////////////////////////HybFMSynth Preset Deafault  Antistrofi Diadikasia
//==========================================================



//////Defaults

//////////////Carrier Controlls
//=============================

~h1 = preset_3[0];
~h2 = preset_3[1];
~h3 = preset_3[2];
~h4 = preset_3[3];
~h5 = preset_3[4];
~h6 = preset_3[5];
~h7 = preset_3[6];
~h8 = preset_3[7];
~h9 = preset_3[8];
~h10 = preset_3[9];
                                          ~wtHarmG.value = [~h1, ~h2, ~h3, ~h4, ~h5, ~h6, ~h7, ~h8, ~h9, ~h10];



~bendRatioMul = preset_3[10];           ~bendRatioMulG.value = ~bendRatioMul;

~freqDur1 = preset_3[11];             ~bendDurG.value = ~freqDur1;
~freqDur2 = preset_3[12];
~amp = preset_3[13];                          ~ampG.value = ~amp;

~atk = preset_3[14];                        ~atkG.value = ~atk;
~dec = preset_3[15];                       ~decG.value = ~dec;
~sus = preset_3[16];                          ~susG.value = ~sus;
~rel = preset_3[17];                            ~relG.value = ~rel;

~curSwitch = preset_3[18];           ~curSwitchG.value = ~curSwitch;


//////////////Modulators Controlls
//=================================

~ampM = preset_3[19];                     ~ampMG.value = ~ampM;
~freqMMul = preset_3[20];                 ~freqMMulG.value = ~freqMMul;


~atkM = preset_3[21];                          ~atkMG.value = ~atkM;
~decM = preset_3[22];                         ~decMG.value = ~decM;
~susM = preset_3[23];                            ~susMG.value = ~susM;
~relM = preset_3[24];                           ~relMG.value = ~relM;
~fbM = preset_3[25];                                ~fbMG.value = ~fbM;

~modSwitch = preset_3[26];                 ~modSwitchG.value = ~modSwitch;


//////////////Carrier 2 Controlls
//=================================

~h2_1 = preset_3[27];
~h2_2 = preset_3[28];
~h2_3 = preset_3[29];
~h2_4 = preset_3[30];
~h2_5 = preset_3[31];
~h2_6 = preset_3[32];
~h2_7 = preset_3[33];
~h2_8 = preset_3[34];
~h2_9 = preset_3[35];
~h2_10 = preset_3[36];
                                                      ~wtHarm2G.value = [~h2_1, ~h2_2, ~h2_3, ~h2_4, ~h2_5, ~h2_6, ~h2_7, ~h2_8, ~h2_9, ~h2_10];



~bendRatioMul2 = preset_3[37];                          ~bendRatioMul2G.value = ~bendRatioMul2;

~freqDur1_2 = preset_3[38];                                ~bendDur2G.value = ~freqDur1_2;
~freqDur2_2 = preset_3[39];
~amp2 = preset_3[40];                                                    ~amp2G.value = ~amp2;

~atk2 = preset_3[41];                                                   ~atk2G.value = ~atk2;
~dec2 = preset_3[42];                                                    ~dec2G.value = ~dec2;
~sus2 = preset_3[43];                                                       ~sus2G.value = ~sus2;
~rel2 = preset_3[44];                                                      ~rel2G.value = ~rel2;

~cur2Switch = preset_3[45];                                         ~cur2SwitchG.value = ~cur2Switch;


//////////////Modulators 2 Controlls
//=================================

~ampM2 = preset_3[46];                                     ~ampM2G.value = ~ampM2;
~freqMMul2 = preset_3[47];                                  ~freqMMul2G.value = ~freqMMul2;

~atkM2 = preset_3[48];                                      ~atkM2G.value = ~atkM2;
~decM2 = preset_3[49];                                      ~decM2G.value = ~decM2;
~susM2 = preset_3[50];                                         ~susM2G.value = ~susM2;
~relM2 = preset_3[51];                                          ~relM2G.value = ~relM2;
~fbM2 = preset_3[52];                                             ~fbM2G.value = ~fbM2;

~mod2Switch = preset_3[53];                             ~mod2SwitchG.value = ~mod2Switch;



//////////////Carrier 3 Controlls
//=================================

~h3_1 = preset_3[54];
~h3_2 = preset_3[55];
~h3_3 = preset_3[56];
~h3_4 = preset_3[57];
~h3_5 = preset_3[58];
~h3_6 = preset_3[59];
~h3_7 = preset_3[60];
~h3_8 = preset_3[61];
~h3_9 =preset_3[62];
~h3_10 = preset_3[63];

                                                                        ~wtHarm3G.value = [~h3_1, ~h3_2, ~h3_3, ~h3_4, ~h3_5, ~h3_6, ~h3_7, ~h3_8, ~h3_9, ~h3_10];

~bendRatioMul3 =preset_3[64];                   ~bendRatioMul3G.value = ~bendRatioMul3;

~freqDur1_3 = preset_3[65];                        ~bendDur3G.value = ~freqDur1_3;
~freqDur2_3 = preset_3[66];
~amp3 = preset_3[67];                                 ~amp3G.value = ~amp3;

~atk3 = preset_3[68];                                   ~atk3G.value = ~atk3;
~dec3 = preset_3[69];                                   ~dec3G.value = ~dec3;
~sus3 = preset_3[70];                                   ~sus3G.value = ~sus3;
~rel3 = preset_3[71];                                    ~rel3G.value = ~rel3;

~cur3Switch = preset_3[72];                         ~cur3SwitchG.value = ~cur3Switch;


//////////////Modulators 3 Controlls
//=================================

~ampM3 = preset_3[73];                            ~ampM3G.value = ~ampM3;
~freqMMul3 = preset_3[74];                          ~freqMMul3G.value = ~freqMMul3;

~atkM3 = preset_3[75];                                 ~atkM3G.value = ~atkM3;
~decM3 = preset_3[76];                                ~decM3G.value = ~decM3;
~susM3 = preset_3[77];                                     ~susM3G.value = ~susM3;
~relM3 = preset_3[78];                                      ~relM3G.value = ~relM3;
~fbM3 = preset_3[79];                                      ~fbM3G.value = ~fbM3;

~mod3Switch = preset_3[80];                               ~mod3SwitchG.value = ~mod3Switch;


//////////////WaveTable Transposes
//=================================

~midiTranspose1G.value = preset_3[81];      //      ~midiTranspose1G.value = ~midiTranspose1;
~midiTranspose2G.value = preset_3[82];      //    ~midiTranspose2G.value = ~midiTranspose2;
~midiTranspose3G.value = preset_3[83];      //    ~midiTranspose3G.value = ~midiTranspose3;

~midiTranspose1 = preset_3[84];
~midiTranspose2 = preset_3[85];
~midiTranspose3 = preset_3[86];


	~algMenu.value = 0;
	~outWT2 = [0, 1]; ~amp2 = 1;



		"PresetFM_3 loaded OK".postln;

	}

}










