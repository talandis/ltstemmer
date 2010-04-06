// This file was generated automatically by the Snowball to Java compiler

package org.tartarus.snowball.ext;

import org.tartarus.snowball.Among;

 /**
  * This class was automatically generated by a Snowball to Java compiler 
  * It implements the stemming algorithm defined by a snowball script.
  */

public class lithuanian_stemmer extends org.tartarus.snowball.SnowballProgram {

private static final long serialVersionUID = 1L;

        private final static lithuanian_stemmer methodObject = new lithuanian_stemmer ();

                private final static Among a_0[] = {
                    new Among ( "tas", -1, 1, "", methodObject ),
                    new Among ( "tis", -1, 1, "", methodObject )
                };

                private final static Among a_1[] = {
                    new Among ( "a", -1, 1, "", methodObject ),
                    new Among ( "ia", 0, 1, "", methodObject ),
                    new Among ( "uoja", 0, 1, "", methodObject ),
                    new Among ( "e", -1, 1, "", methodObject ),
                    new Among ( "oje", 3, 1, "", methodObject ),
                    new Among ( "ioje", 4, 1, "", methodObject ),
                    new Among ( "toje", 4, 1, "", methodObject ),
                    new Among ( "yje", 3, 1, "", methodObject ),
                    new Among ( "\u00C4\u0097je", 3, 1, "", methodObject ),
                    new Among ( "iame", 3, 1, "", methodObject ),
                    new Among ( "ajame", 3, 1, "", methodObject ),
                    new Among ( "ose", 3, 1, "", methodObject ),
                    new Among ( "iose", 11, 1, "", methodObject ),
                    new Among ( "uose", 11, 1, "", methodObject ),
                    new Among ( "iuose", 13, 1, "", methodObject ),
                    new Among ( "uosiuose", 14, 1, "", methodObject ),
                    new Among ( "yse", 3, 1, "", methodObject ),
                    new Among ( "\u00C4\u0097se", 3, 1, "", methodObject ),
                    new Among ( "i", -1, 1, "", methodObject ),
                    new Among ( "ai", 18, 1, "", methodObject ),
                    new Among ( "iai", 19, 1, "", methodObject ),
                    new Among ( "ei", 18, 1, "", methodObject ),
                    new Among ( "ieji", 18, 1, "", methodObject ),
                    new Among ( "oji", 18, 1, "", methodObject ),
                    new Among ( "ioji", 23, 1, "", methodObject ),
                    new Among ( "uoji", 23, 1, "", methodObject ),
                    new Among ( "asi", 18, 1, "", methodObject ),
                    new Among ( "iasi", 26, 1, "", methodObject ),
                    new Among ( "amasi", 26, 1, "", methodObject ),
                    new Among ( "osi", 18, 1, "", methodObject ),
                    new Among ( "\u00C4\u0097jausi", 18, 1, "", methodObject ),
                    new Among ( "ti", 18, 1, "", methodObject ),
                    new Among ( "anti", 31, 1, "", methodObject ),
                    new Among ( "ianti", 32, 1, "", methodObject ),
                    new Among ( "inti", 31, 1, "", methodObject ),
                    new Among ( "yti", 31, 1, "", methodObject ),
                    new Among ( "ui", 18, 1, "", methodObject ),
                    new Among ( "iui", 36, 1, "", methodObject ),
                    new Among ( "oj", -1, 1, "", methodObject ),
                    new Among ( "iam", -1, 1, "", methodObject ),
                    new Among ( "ajam", -1, 1, "", methodObject ),
                    new Among ( "iajam", 40, 1, "", methodObject ),
                    new Among ( "om", -1, 1, "", methodObject ),
                    new Among ( "osiom", 42, 1, "", methodObject ),
                    new Among ( "o", -1, 1, "", methodObject ),
                    new Among ( "io", 44, 1, "", methodObject ),
                    new Among ( "ojo", 44, 1, "", methodObject ),
                    new Among ( "imo", 44, 1, "", methodObject ),
                    new Among ( "uo", 44, 1, "", methodObject ),
                    new Among ( "s", -1, 1, "", methodObject ),
                    new Among ( "as", 49, 1, "", methodObject ),
                    new Among ( "ias", 50, 1, "", methodObject ),
                    new Among ( "umas", 50, 1, "", methodObject ),
                    new Among ( "es", 49, 1, "", methodObject ),
                    new Among ( "ies", 53, 1, "", methodObject ),
                    new Among ( "is", 49, 1, "", methodObject ),
                    new Among ( "ais", 55, 1, "", methodObject ),
                    new Among ( "iais", 56, 1, "", methodObject ),
                    new Among ( "aisiais", 57, 1, "", methodObject ),
                    new Among ( "omis", 55, 1, "", methodObject ),
                    new Among ( "iomis", 59, 1, "", methodObject ),
                    new Among ( "\u00C4\u0097mis", 55, 1, "", methodObject ),
                    new Among ( "asis", 55, 1, "", methodObject ),
                    new Among ( "usis", 55, 1, "", methodObject ),
                    new Among ( "ams", 49, 1, "", methodObject ),
                    new Among ( "iams", 64, 1, "", methodObject ),
                    new Among ( "iems", 49, 1, "", methodObject ),
                    new Among ( "iesiems", 66, 1, "", methodObject ),
                    new Among ( "oms", 49, 1, "", methodObject ),
                    new Among ( "osioms", 68, 1, "", methodObject ),
                    new Among ( "\u00C4\u0097ms", 49, 1, "", methodObject ),
                    new Among ( "ens", 49, 1, "", methodObject ),
                    new Among ( "os", 49, 1, "", methodObject ),
                    new Among ( "ios", 72, 1, "", methodObject ),
                    new Among ( "osios", 73, 1, "", methodObject ),
                    new Among ( "usios", 73, 1, "", methodObject ),
                    new Among ( "uos", 72, 1, "", methodObject ),
                    new Among ( "ers", 49, 1, "", methodObject ),
                    new Among ( "us", 49, 1, "", methodObject ),
                    new Among ( "aus", 78, 1, "", methodObject ),
                    new Among ( "iaus", 79, 1, "", methodObject ),
                    new Among ( "ius", 78, 1, "", methodObject ),
                    new Among ( "uosius", 81, 1, "", methodObject ),
                    new Among ( "usius", 81, 1, "", methodObject ),
                    new Among ( "ys", 49, 1, "", methodObject ),
                    new Among ( "\u00C4\u0085s", 49, 1, "", methodObject ),
                    new Among ( "i\u00C4\u0085s", 85, 1, "", methodObject ),
                    new Among ( "\u00C4\u0097s", 49, 1, "", methodObject ),
                    new Among ( "am\u00C4\u0097s", 87, 1, "", methodObject ),
                    new Among ( "\u00C4\u0099s", 49, 1, "", methodObject ),
                    new Among ( "\u00C5\u00ABs", 49, 1, "", methodObject ),
                    new Among ( "ant", -1, 1, "", methodObject ),
                    new Among ( "iant", 91, 1, "", methodObject ),
                    new Among ( "u", -1, 1, "", methodObject ),
                    new Among ( "iau", 93, 1, "", methodObject ),
                    new Among ( "iu", 93, 1, "", methodObject ),
                    new Among ( "uoju", 93, 1, "", methodObject ),
                    new Among ( "umu", 93, 1, "", methodObject ),
                    new Among ( "\u00C4\u0085", -1, 1, "", methodObject ),
                    new Among ( "i\u00C4\u0085", 98, 1, "", methodObject ),
                    new Among ( "\u00C4\u0085j\u00C4\u0085", 98, 1, "", methodObject ),
                    new Among ( "\u00C4\u0097", -1, 1, "", methodObject ),
                    new Among ( "\u00C4\u0099", -1, 1, "", methodObject ),
                    new Among ( "\u00C4\u00AF", -1, 1, "", methodObject ),
                    new Among ( "\u00C4\u0085j\u00C4\u00AF", 103, 1, "", methodObject ),
                    new Among ( "\u00C5\u00B3", -1, 1, "", methodObject ),
                    new Among ( "i\u00C5\u00B3", 105, 1, "", methodObject ),
                    new Among ( "t\u00C5\u00B3j\u00C5\u00B3", 105, 1, "", methodObject )
                };

                private final static Among a_2[] = {
                    new Among ( "\u00C4\u008D", -1, 1, "", methodObject ),
                    new Among ( "d\u00C5\u00BE", -1, 2, "", methodObject )
                };

                private final static Among a_3[] = {
                    new Among ( "ia", -1, 1, "", methodObject ),
                    new Among ( "yb", -1, 1, "", methodObject ),
                    new Among ( "enyb", 1, 1, "", methodObject ),
                    new Among ( "ij", -1, 1, "", methodObject ),
                    new Among ( "oj", -1, 1, "", methodObject ),
                    new Among ( "toj", 4, 1, "", methodObject ),
                    new Among ( "uoj", 4, 1, "", methodObject ),
                    new Among ( "iuoj", 6, 1, "", methodObject ),
                    new Among ( "auj", -1, 1, "", methodObject ),
                    new Among ( "\u00C4\u0097j", -1, 1, "", methodObject ),
                    new Among ( "ik", -1, 1, "", methodObject ),
                    new Among ( "inink", -1, 1, "", methodObject ),
                    new Among ( "tok", -1, 1, "", methodObject ),
                    new Among ( "uk", -1, 1, "", methodObject ),
                    new Among ( "iuk", 13, 1, "", methodObject ),
                    new Among ( "tuk", 13, 1, "", methodObject ),
                    new Among ( "yk", -1, 1, "", methodObject ),
                    new Among ( "i\u00C5\u00A1k", -1, 1, "", methodObject ),
                    new Among ( "el", -1, 1, "", methodObject ),
                    new Among ( "ekl", -1, 1, "", methodObject ),
                    new Among ( "ikl", -1, 1, "", methodObject ),
                    new Among ( "ykl", -1, 1, "", methodObject ),
                    new Among ( "uol", -1, 1, "", methodObject ),
                    new Among ( "iul", -1, 1, "", methodObject ),
                    new Among ( "\u00C4\u0097l", -1, 1, "", methodObject ),
                    new Among ( "dam", -1, 1, "", methodObject ),
                    new Among ( "iam", -1, 1, "", methodObject ),
                    new Among ( "jim", -1, 1, "", methodObject ),
                    new Among ( "ojim", 27, 1, "", methodObject ),
                    new Among ( "\u00C4\u0097jim", 27, 1, "", methodObject ),
                    new Among ( "om", -1, 1, "", methodObject ),
                    new Among ( "sm", -1, 1, "", methodObject ),
                    new Among ( "um", -1, 1, "", methodObject ),
                    new Among ( "ym", -1, 1, "", methodObject ),
                    new Among ( "izm", -1, 1, "", methodObject ),
                    new Among ( "ien", -1, 1, "", methodObject ),
                    new Among ( "uomen", -1, 1, "", methodObject ),
                    new Among ( "sen", -1, 1, "", methodObject ),
                    new Among ( "in", -1, 1, "", methodObject ),
                    new Among ( "ain", 38, 1, "", methodObject ),
                    new Among ( "esn", -1, 1, "", methodObject ),
                    new Among ( "tyn", -1, 1, "", methodObject ),
                    new Among ( "\u00C4\u0097n", -1, 1, "", methodObject ),
                    new Among ( "ok\u00C5\u00A1n", -1, 1, "", methodObject ),
                    new Among ( "\u00C5\u00ABn", -1, 1, "", methodObject ),
                    new Among ( "uo", -1, 1, "", methodObject ),
                    new Among ( "iuo", 45, 1, "", methodObject ),
                    new Among ( "imas", -1, 1, "", methodObject ),
                    new Among ( "tas", -1, 1, "", methodObject ),
                    new Among ( "es", -1, 1, "", methodObject ),
                    new Among ( "uos", -1, 1, "", methodObject ),
                    new Among ( "iaus", -1, 1, "", methodObject ),
                    new Among ( "avus", -1, 1, "", methodObject ),
                    new Among ( "\u00C4\u0097s", -1, 1, "", methodObject ),
                    new Among ( "ant", -1, 1, "", methodObject ),
                    new Among ( "iant", 54, 1, "", methodObject ),
                    new Among ( "int", -1, 1, "", methodObject ),
                    new Among ( "yst", -1, 1, "", methodObject ),
                    new Among ( "yt", -1, 1, "", methodObject ),
                    new Among ( "ulyt", 58, 1, "", methodObject ),
                    new Among ( "\u00C4\u0097t", -1, 1, "", methodObject ),
                    new Among ( "iau", -1, 1, "", methodObject ),
                    new Among ( "av", -1, 1, "", methodObject ),
                    new Among ( "dav", 62, 1, "", methodObject ),
                    new Among ( "iav", 62, 1, "", methodObject ),
                    new Among ( "eiv", -1, 1, "", methodObject ),
                    new Among ( "atv", -1, 1, "", methodObject ),
                    new Among ( "tuv", -1, 1, "", methodObject ),
                    new Among ( "\u00C4\u0097z", -1, 1, "", methodObject ),
                    new Among ( "o\u00C4\u008D", -1, 1, "", methodObject ),
                    new Among ( "\u00C5\u00A1\u00C4\u0097", -1, 1, "", methodObject ),
                    new Among ( "u\u00C5\u00BE", -1, 1, "", methodObject )
                };

                private final static Among a_4[] = {
                    new Among ( "iant", -1, 1, "", methodObject ),
                    new Among ( "i\u00C5\u00ABk\u00C5\u00A1t", -1, 1, "", methodObject )
                };

                private static final char g_v[] = {17, 65, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16, 0, 64, 1, 0, 64, 0, 0, 0, 0, 0, 0, 0, 4, 4 };

        private boolean B_CHANGE;
        private boolean B_FOUND;
        private boolean B_PRE;
        private int I_p2;
        private int I_p1;

                private void copy_from(lithuanian_stemmer other) {
                    B_CHANGE = other.B_CHANGE;
                    B_FOUND = other.B_FOUND;
                    B_PRE = other.B_PRE;
                    I_p2 = other.I_p2;
                    I_p1 = other.I_p1;
                    super.copy_from(other);
                }

                private boolean r_mark_regions() {
            int v_1;
                    // (, line 108
                    I_p1 = limit;
                    I_p2 = limit;
                    // do, line 111
                    v_1 = cursor;
                    lab0: do {
                        // (, line 111
                        // gopast, line 112
                        golab1: while(true)
                        {
                            lab2: do {
                                if (!(in_grouping(g_v, 97, 371)))
                                {
                                    break lab2;
                                }
                                break golab1;
                            } while (false);
                            if (cursor >= limit)
                            {
                                break lab0;
                            }
                            cursor++;
                        }
                        // gopast, line 112
                        golab3: while(true)
                        {
                            lab4: do {
                                if (!(out_grouping(g_v, 97, 371)))
                                {
                                    break lab4;
                                }
                                break golab3;
                            } while (false);
                            if (cursor >= limit)
                            {
                                break lab0;
                            }
                            cursor++;
                        }
                        // setmark p1, line 112
                        I_p1 = cursor;
                        // gopast, line 113
                        golab5: while(true)
                        {
                            lab6: do {
                                if (!(out_grouping(g_v, 97, 371)))
                                {
                                    break lab6;
                                }
                                break golab5;
                            } while (false);
                            if (cursor >= limit)
                            {
                                break lab0;
                            }
                            cursor++;
                        }
                        // setmark p2, line 113
                        I_p2 = cursor;
                    } while (false);
                    cursor = v_1;
                    return true;
                }

                private boolean r_R1() {
                    if (!(I_p1 <= cursor))
                    {
                        return false;
                    }
                    return true;
                }

                private boolean r_step1_noun() {
            int among_var;
                    // (, line 131
                    // not, line 131
                    lab0: do {
                        // call R1, line 131
                        if (!r_R1())
                        {
                            break lab0;
                        }
                        return false;
                    } while (false);
                    // [, line 132
                    ket = cursor;
                    // substring, line 132
                    among_var = find_among_b(a_0, 2);
                    if (among_var == 0)
                    {
                        return false;
                    }
                    // ], line 132
                    bra = cursor;
                    switch(among_var) {
                        case 0:
                            return false;
                        case 1:
                            // (, line 136
                            // <-, line 136
                            slice_from("t");
                            // set PRE, line 136
                            B_PRE = true;
                            break;
                    }
                    return true;
                }

                private boolean r_step2() {
            int among_var;
            int v_1;
                    // (, line 144
                    // and, line 144
                    v_1 = limit - cursor;
                    // not, line 144
                    lab0: do {
                        // Boolean test PRE, line 144
                        if (!(B_PRE))
                        {
                            break lab0;
                        }
                        return false;
                    } while (false);
                    cursor = limit - v_1;
                    // not, line 144
                    lab1: do {
                        // call R1, line 144
                        if (!r_R1())
                        {
                            break lab1;
                        }
                        return false;
                    } while (false);
                    // [, line 145
                    ket = cursor;
                    // substring, line 145
                    among_var = find_among_b(a_1, 108);
                    if (among_var == 0)
                    {
                        return false;
                    }
                    // ], line 145
                    bra = cursor;
                    switch(among_var) {
                        case 0:
                            return false;
                        case 1:
                            // (, line 165
                            // set FOUND, line 165
                            B_FOUND = true;
                            // delete, line 165
                            slice_del();
                            break;
                    }
                    return true;
                }

                private boolean r_step3() {
            int among_var;
            int v_1;
                    // (, line 173
                    // and, line 173
                    v_1 = limit - cursor;
                    // Boolean test FOUND, line 173
                    if (!(B_FOUND))
                    {
                        return false;
                    }
                    cursor = limit - v_1;
                    // not, line 173
                    lab0: do {
                        // call R1, line 173
                        if (!r_R1())
                        {
                            break lab0;
                        }
                        return false;
                    } while (false);
                    // [, line 174
                    ket = cursor;
                    // substring, line 174
                    among_var = find_among_b(a_2, 2);
                    if (among_var == 0)
                    {
                        return false;
                    }
                    // ], line 174
                    bra = cursor;
                    switch(among_var) {
                        case 0:
                            return false;
                        case 1:
                            // (, line 176
                            // <-, line 176
                            slice_from("t");
                            // set CHANGE, line 176
                            B_CHANGE = true;
                            break;
                        case 2:
                            // (, line 177
                            // <-, line 177
                            slice_from("d");
                            // set CHANGE, line 177
                            B_CHANGE = true;
                            break;
                    }
                    return true;
                }

                private boolean r_step4() {
            int among_var;
            int v_1;
            int v_5;
                    // (, line 185
                    // and, line 185
                    v_1 = limit - cursor;
                    // or, line 185
                    lab0: do {
                        lab1: do {
                            // Boolean test FOUND, line 185
                            if (!(B_FOUND))
                            {
                                break lab1;
                            }
                            break lab0;
                        } while (false);
                        // Boolean test PRE, line 185
                        if (!(B_PRE))
                        {
                            return false;
                        }
                    } while (false);
                    cursor = limit - v_1;
                    // not, line 185
                    lab2: do {
                        // Boolean test CHANGE, line 185
                        if (!(B_CHANGE))
                        {
                            break lab2;
                        }
                        return false;
                    } while (false);
                    cursor = limit - v_1;
                    // not, line 185
                    lab3: do {
                        // call R1, line 185
                        if (!r_R1())
                        {
                            break lab3;
                        }
                        return false;
                    } while (false);
                    // loop, line 185
                    for (v_5 = 3; v_5 > 0; v_5--)
                    {
                        // [, line 186
                        ket = cursor;
                    }
                    // substring, line 186
                    among_var = find_among_b(a_3, 72);
                    if (among_var == 0)
                    {
                        return false;
                    }
                    // ], line 186
                    bra = cursor;
                    switch(among_var) {
                        case 0:
                            return false;
                        case 1:
                            // (, line 198
                            // delete, line 198
                            slice_del();
                            break;
                    }
                    return true;
                }

                private boolean r_step5() {
            int among_var;
            int v_1;
                    // (, line 206
                    // and, line 206
                    v_1 = limit - cursor;
                    // Boolean test CHANGE, line 206
                    if (!(B_CHANGE))
                    {
                        return false;
                    }
                    cursor = limit - v_1;
                    // not, line 206
                    lab0: do {
                        // call R1, line 206
                        if (!r_R1())
                        {
                            break lab0;
                        }
                        return false;
                    } while (false);
                    // [, line 207
                    ket = cursor;
                    // substring, line 207
                    among_var = find_among_b(a_4, 2);
                    if (among_var == 0)
                    {
                        return false;
                    }
                    // ], line 207
                    bra = cursor;
                    switch(among_var) {
                        case 0:
                            return false;
                        case 1:
                            // (, line 210
                            // delete, line 210
                            slice_del();
                            break;
                    }
                    return true;
                }

                public boolean stem() {
            int v_1;
            int v_2;
            int v_3;
            int v_4;
            int v_5;
            int v_6;
            int v_7;
                    // (, line 219
                    // unset PRE, line 220
                    B_PRE = false;
                    // unset FOUND, line 221
                    B_FOUND = false;
                    // unset CHANGE, line 222
                    B_CHANGE = false;
                    // do, line 223
                    v_1 = cursor;
                    lab0: do {
                        // call mark_regions, line 223
                        if (!r_mark_regions())
                        {
                            break lab0;
                        }
                    } while (false);
                    cursor = v_1;
                    // backwards, line 224
                    limit_backward = cursor; cursor = limit;
                    // (, line 225
                    // do, line 226
                    v_2 = limit - cursor;
                    lab1: do {
                        // call step1_noun, line 226
                        if (!r_step1_noun())
                        {
                            break lab1;
                        }
                    } while (false);
                    cursor = limit - v_2;
                    // do, line 227
                    v_3 = limit - cursor;
                    lab2: do {
                        // call step2, line 227
                        if (!r_step2())
                        {
                            break lab2;
                        }
                    } while (false);
                    cursor = limit - v_3;
                    // do, line 228
                    v_4 = limit - cursor;
                    lab3: do {
                        // call step3, line 228
                        if (!r_step3())
                        {
                            break lab3;
                        }
                    } while (false);
                    cursor = limit - v_4;
                    // do, line 229
                    v_5 = limit - cursor;
                    lab4: do {
                        // call step4, line 229
                        if (!r_step4())
                        {
                            break lab4;
                        }
                    } while (false);
                    cursor = limit - v_5;
                    // do, line 230
                    v_6 = limit - cursor;
                    lab5: do {
                        // call step5, line 230
                        if (!r_step5())
                        {
                            break lab5;
                        }
                    } while (false);
                    cursor = limit - v_6;
                    // do, line 231
                    v_7 = limit - cursor;
                    lab6: do {
                        // call step3, line 231
                        if (!r_step3())
                        {
                            break lab6;
                        }
                    } while (false);
                    cursor = limit - v_7;
                    cursor = limit_backward;                    return true;
                }

        public boolean equals( Object o ) {
            return o instanceof lithuanian_stemmer;
        }

        public int hashCode() {
            return lithuanian_stemmer.class.getName().hashCode();
        }



}

