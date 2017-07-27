PresetPost {

//class methods

	*new {

	~testpreset = Array.fill(100);

////////////////HybFMSynth Preset Post

////////////////////////////////////////////////////////Carrier 1 Controlls
//==================================================

~testpreset[0] = ~h1;
~testpreset[1] = ~h2;
~testpreset[2] = ~h3;
~testpreset[3] = ~h4;
~testpreset[4] = ~h5;
~testpreset[5] = ~h6;
~testpreset[6] = ~h7;
~testpreset[7] = ~h8;
~testpreset[8] = ~h9;
~testpreset[9] = ~h10;
                                          ~wtHarmG.value = [~h1, ~h2, ~h3, ~h4, ~h5, ~h6, ~h7, ~h8, ~h9, ~h10];

~testpreset[10] = ~bendRatioMul;           ~bendRatioMulG.value = ~bendRatioMul;

~testpreset[11] = ~freqDur1;             ~bendDurG.value = ~freqDur1;
~testpreset[12] = ~freqDur2;
~testpreset[13] = ~amp;                          ~ampG.value = ~amp;

~testpreset[14] = ~atk;                        ~atkG.value = ~atk;
~testpreset[15] = ~dec;                       ~decG.value = ~dec;
~testpreset[16] = ~sus;                          ~susG.value = ~sus;
~testpreset[17] = ~rel;                            ~relG.value = ~rel;

~testpreset[18] = ~curSwitch;           ~curSwitchG.value = ~curSwitch;


////////////////////////////////////////////////////////Modulators 1 Controlls
//==================================================

~testpreset[19] = ~ampM;                     ~ampMG.value = ~ampM;
~testpreset[20] = ~freqMMul;                 ~freqMMulG.value = ~freqMMul;


~testpreset[21] = ~atkM;                          ~atkMG.value = ~atkM;
~testpreset[22] = ~decM;                         ~decMG.value = ~decM;
~testpreset[23] = ~susM;                            ~susMG.value = ~susM;
~testpreset[24] = ~relM;                           ~relMG.value = ~relM;
~testpreset[25] = ~fbM;                                ~fbMG.value = ~fbM;

~testpreset[26] = ~modSwitch;                 ~modSwitchG.value = ~modSwitch;



////////////////////////////////////////////////////////Carrier 2 Controlls
//==================================================

~testpreset[27] = ~h2_1;
~testpreset[28] = ~h2_2;
~testpreset[29] = ~h2_3;
~testpreset[30] = ~h2_4;
~testpreset[31] = ~h2_5;
~testpreset[32] = ~h2_6;
~testpreset[33] = ~h2_7;
~testpreset[34] = ~h2_8;
~testpreset[35] = ~h2_9;
~testpreset[36] = ~h2_10;
                                                      ~wtHarm2G.value = [~h2_1, ~h2_2, ~h2_3, ~h2_4, ~h2_5, ~h2_6, ~h2_7, ~h2_8, ~h2_9, ~h2_10];



~testpreset[37] = ~bendRatioMul2;                          ~bendRatioMul2G.value = ~bendRatioMul2;

~testpreset[38] = ~freqDur1_2;                                ~bendDur2G.value = ~freqDur1_2;
~testpreset[39] = ~freqDur2_2;
~testpreset[40] = ~amp2;                                                    ~amp2G.value = ~amp2;

~testpreset[41] = ~atk2;                                                   ~atk2G.value = ~atk2;
~testpreset[42] = ~dec2;                                                    ~dec2G.value = ~dec2;
~testpreset[43] = ~sus2;                                                       ~sus2G.value = ~sus2;
~testpreset[44] = ~rel2;                                                      ~rel2G.value = ~rel2;

~testpreset[45] = ~cur2Switch = 1;                                         ~cur2SwitchG.value = ~cur2Switch;


////////////////////////////////////////////////////////Modulators 2 Controlls
//==================================================

~testpreset[46] = ~ampM2;                                     ~ampM2G.value = ~ampM2;
~testpreset[47] = ~freqMMul2;                                  ~freqMMul2G.value = ~freqMMul2;

~testpreset[48] = ~atkM2;                                      ~atkM2G.value = ~atkM2;
~testpreset[49] = ~decM2;                                      ~decM2G.value = ~decM2;
~testpreset[50] = ~susM2;                                         ~susM2G.value = ~susM2;
~testpreset[51] = ~relM2;                                          ~relM2G.value = ~relM2;
~testpreset[52] = ~fbM2;                                             ~fbM2G.value = ~fbM2;

~testpreset[53] = ~mod2Switch;                             ~mod2SwitchG.value = ~mod2Switch;



////////////////////////////////////////////////////////Carrier 2 Controlls
//==================================================

~testpreset[54] = ~h3_1;
~testpreset[55] = ~h3_2;
~testpreset[56] = ~h3_3;
~testpreset[57] = ~h3_4;
~testpreset[58] = ~h3_5;
~testpreset[59] = ~h3_6;
~testpreset[60] = ~h3_7;
~testpreset[61] = ~h3_8;
~testpreset[62] = ~h3_9;
~testpreset[63] = ~h3_10;

                                                                        ~wtHarm3G.value = [~h3_1, ~h3_2, ~h3_3, ~h3_4, ~h3_5, ~h3_6, ~h3_7, ~h3_8, ~h3_9, ~h3_10];

~testpreset[64] = ~bendRatioMul3;                                      ~bendRatioMul3G.value = ~bendRatioMul3;

~testpreset[65] = ~freqDur1_3;                         ~bendDur3G.value = ~freqDur1_3;
~testpreset[66] = ~freqDur2_3;
~testpreset[67] = ~amp3;                                   ~amp3G.value = ~amp3;

~testpreset[68] = ~atk3;                               ~atk3G.value = ~atk3;
~testpreset[69] = ~dec3;                               ~dec3G.value = ~dec3;
~testpreset[70] = ~sus3;                                   ~sus3G.value = ~sus3;
~testpreset[71] = ~rel3;                                    ~rel3G.value = ~rel3;

~testpreset[72] = ~cur3Switch;                        ~cur3SwitchG.value = ~cur3Switch;


////////////////////////////////////////////////////////Modulators 3 Controlls
//==================================================

~testpreset[73] = ~ampM3;                              ~ampM3G.value = ~ampM3;
~testpreset[74] = ~freqMMul3;                         ~freqMMul3G.value = ~freqMMul3;

~testpreset[75] = ~atkM3;                                ~atkM3G.value = ~atkM3;
~testpreset[76] = ~decM3;                                ~decM3G.value = ~decM3;
~testpreset[77] = ~susM3;                                ~susM3G.value = ~susM3;
~testpreset[78] = ~relM3;                                 ~relM3G.value = ~relM3;
~testpreset[79] = ~fbM3;                                  ~fbM3G.value = ~fbM3;

~testpreset[80] = ~mod3Switch;                       ~mod3SwitchG.value = ~mod3Switch;


////////////////////////////////////////////////////////WaveTable Transposes
//==================================================

~testpreset[81] = ~midiTranspose1G.value;     //       ~midiTranspose1G.value = ~midiTranspose1;
~testpreset[82] = ~midiTranspose2G.value;       //     ~midiTranspose2G.value = ~midiTranspose2;
~testpreset[83] = ~midiTranspose3G.value;          //  ~midiTranspose3G.value = ~midiTranspose3;

~testpreset[84] = ~midiTranspose1;
~testpreset[85] = ~midiTranspose2;
~testpreset[86] = ~midiTranspose3;


//////////////////////////////////////////////////////////Algorythm Defaults
//==================================================


~testpreset[87] = ~algMenu.value;
~testpreset[88] = ~outWT2;
~testpreset[89] = ~outWT3;

//~mod2To1 = Bus.new(\audio, 50, 1);
//~outWT2 = ~mod2To1;
//~outWT2 = [0, 1]; ~amp2 = 1;
//~outWT3 = [0, 1]; ~amp3 = 1;



//Post The ARRAY

		90.do{|i| ~testpreset[ i ].value.post; ",".post};




	}

}

/*///////TEST

~outWT2;
~outWT3;
~amp2;
~amp3;

/*




