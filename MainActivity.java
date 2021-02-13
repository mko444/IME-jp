package com.example.jp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String now1,now2,now3;
    String out ="";
    int word_len=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static String tennka1(String in) {
        int len_input=in.length();
        in=in+"   ";
        in=in.toLowerCase();
        int word_len=2;
        String now1,now2,now3,now4;
        String out ="";
        for(int i =0;i<len_input;i+=word_len) {
            now1 = in.substring(i, i + 1);
            now2 = in.substring(i + 1, i + 2);
            now3 = in.substring(i + 2, i + 3);
            now4 = in.substring(i + 3, i + 4);
            switch (now1) {
                case ("\n"): {
                    out = out + "\n";
                    word_len = 1;
                    break;
                }//换行
                case (" "): {
                    out = out + " ";
                    word_len = 1;
                    break;
                }//空白
                case ("a"): {
                    out = out + "あ";
                    word_len = 1;
                    break;
                }//あ
                case ("i"): {
                    out = out + "い";
                    word_len = 1;
                    break;
                }//い
                case ("u"): {
                    out = out + "う";
                    word_len = 1;
                    break;
                }//う
                case ("e"): {
                    out = out + "え";
                    word_len = 1;
                    break;
                }//え
                case ("o"): {
                    out = out + "お";
                    word_len = 1;
                    break;
                }//お
                case ("b"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "ば";
                            word_len = 2;
                            break;
                        }//ba
                        case ("i"): {
                            out = out + "び";
                            word_len = 2;
                            break;
                        }//bi
                        case ("u"): {
                            out = out + "ぶ";
                            word_len = 2;
                            break;
                        }//bu
                        case ("e"): {
                            out = out + "べ";
                            word_len = 2;
                            break;
                        }//be
                        case ("o"): {
                            out = out + "ぼ";
                            word_len = 2;
                            break;
                        }//bo
                        case ("y"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "びゃ";
                                    word_len = 3;
                                    break;
                                }//びゃ
                                case ("u"): {
                                    out = out + "びゅ";
                                    word_len = 3;
                                    break;
                                }//びゅ
                                case ("o"): {
                                    out = out + "びょ";
                                    word_len = 3;
                                    break;
                                }//びょ
                                default: {
                                    out = out + "?";
                                    word_len = 2;
                                    break;
                                }//-2
                            }//び+
                            break;
                        }
                        case ("b"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default:{
                            out = out + "b";
                            word_len = 1;
                            break;
                        }//b
                    }
                    break;
                }//ば行
                case ("c"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "か";
                            word_len = 2;
                            break;
                        }
                        case ("i"): {
                            out = out + "し";
                            word_len = 2;
                            break;
                        }//し
                       case ("u"): {
                            out = out + "く";
                            word_len = 2;
                            break;
                        }
                        case ("e"): {
                            out = out + "せ";
                            word_len = 2;
                            break;
                        }
                        case ("o"): {
                            out = out + "こ";
                            word_len = 2;
                            break;
                        }
                        case ("h"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "ちゃ";
                                    word_len = 3;
                                    break;
                                }//ちゃ
                                case ("u"): {
                                    out = out + "ちゅ";
                                    word_len = 3;
                                    break;
                                }//ちゅ
                                case ("o"): {
                                    out = out + "ちょ";
                                    word_len = 3;
                                    break;
                                }//ちょ
                                case ("i"): {
                                    out = out + "ち";
                                    word_len = 3;
                                    break;
                                }//ち
                                default: {
                                    out = out + "?";
                                    word_len = 2;
                                    break;
                                }//-2
                            }
                            break;
                        }//ち+
                        case ("c"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "c";
                            word_len = 1;
                            break;
                        }//c
                    }
                    break;
                }
                case ("d"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "だ";
                            word_len = 2;
                            break;
                        }//だ
                        case ("i"): {
                            out = out + "ぢ";
                            word_len = 2;
                            break;
                        }//ぢ
                        case ("u"): {
                            out = out + "づ";
                            word_len = 2;
                            break;
                        }//づ
                        case ("e"): {
                            out = out + "で";
                            word_len = 2;
                            break;
                        }//で
                        case ("o"): {
                            out = out + "ど";
                            word_len = 2;
                            break;
                        }//ど
                        case ("d"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "d";
                            word_len = 1;
                            break;
                        }//d
                    }
                    break;
                }//だ行
                case ("f"): {
                    switch (now2) {
/*
                        case ("a"): {
                            out = out + "?";
                            word_len = 2;
                            break;
                        }
                        case ("i"): {
                            out = out + "?";
                            word_len = 2;
                            break;
                        }
                        case ("u"): {
                            out = out + "?";
                            word_len = 2;
                            break;
                        }
                        case ("e"): {
                            out = out + "?";
                            word_len = 2;
                            break;
                        }
                        case ("o"): {
                            out = out + "?";
                            word_len = 2;
                            break;
                        }
*/
                        default: {
                            out = out + "f";
                            word_len = 1;
                            break;
                        }//f
                    }
                    break;
                }
                case ("g"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "が";
                            word_len = 2;
                            break;
                        }//が
                        case ("i"): {
                            out = out + "ぎ";
                            word_len = 2;
                            break;
                        }//ぎ
                        case ("u"): {
                            out = out + "ぐ";
                            word_len = 2;
                            break;
                        }//ぐ
                        case ("e"): {
                            out = out + "げ";
                            word_len = 2;
                            break;
                        }//げ
                        case ("o"): {
                            out = out + "ご";
                            word_len = 2;
                            break;
                        }//ご
                        case ("y"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "ぎゃ";
                                    word_len = 3;
                                    break;
                                }//ぎゃ
                                case ("u"): {
                                    out = out + "ぎゅ";
                                    word_len = 3;
                                    break;
                                }//ぎゅ
                                case ("o"): {
                                    out = out + "ぎょ";
                                    word_len = 3;
                                    break;
                                }//ぎょ
                                default: {
                                    out = out + "?";
                                    word_len = 2;
                                    break;
                                }//-2
                            }
                            break;
                        }//ぎ+
                        case ("g"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "g";
                            word_len = 1;
                            break;
                        }//g
                    }
                    break;
                }//が行
                case ("h"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "は";
                            word_len = 2;
                            break;
                        }//は
                        case ("i"): {
                            out = out + "ひ";
                            word_len = 2;
                            break;
                        }//ひ
                        case ("u"): {
                            out = out + "ふ";
                            word_len = 2;
                            break;
                        }//ふ
                        case ("e"): {
                            out = out + "へ";
                            word_len = 2;
                            break;
                        }//へ
                        case ("o"): {
                            out = out + "ほ";
                            word_len = 2;
                            break;
                        }//ほ
                        case ("y"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "ひゃ";
                                    word_len = 3;
                                    break;
                                }//ひゃ
                                case ("u"): {
                                    out = out + "ひゅ";
                                    word_len = 3;
                                    break;
                                }//ひゅ
                                case ("o"): {
                                    out = out + "ひょ";
                                    word_len = 3;
                                    break;
                                }//ひょ
                                default: {
                                    out = out + "?";
                                    word_len = 2;
                                    break;
                                }//-2
                            }
                            break;
                        }//ひ+
                        case ("h"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "h";
                            word_len = 1;
                            break;
                        }//h
                    }
                    break;
                }//は行
                case ("j"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "じゃ";
                            word_len = 2;
                            break;
                        }//じゃ
                        case ("i"): {
                            out = out + "じ";
                            word_len = 2;
                            break;
                        }//じ
                        case ("u"): {
                            out = out + "じゅ";
                            word_len = 2;
                            break;
                        }//じゅ
                        case ("e"): {
                            out = out + "じぇ";
                            word_len = 2;
                            break;
                        }
                        case ("o"): {
                            out = out + "じょ";
                            word_len = 2;
                            break;
                        }//じょ
                        case ("y"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "じゃ";
                                    word_len = 3;
                                    break;
                                }//じゃ
                                case ("u"): {
                                    out = out + "じゅ";
                                    word_len = 3;
                                    break;
                                }//じゅ
                                case ("o"): {
                                    out = out + "じょ";
                                    word_len = 3;
                                    break;
                                }//じょ
                                default: {
                                    out = out + "?";
                                    word_len = 2;
                                    break;
                                }//-2
                            }
                            break;
                        }//じ+
                        case ("j"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "j";
                            word_len = 1;
                            break;
                        }//j
                    }
                    break;
                }//じ与ぢ?
                case ("k"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "か";
                            word_len = 2;
                            break;
                        }//か
                        case ("i"): {
                            out = out + "き";
                            word_len = 2;
                            break;
                        }//き
                        case ("u"): {
                            out = out + "く";
                            word_len = 2;
                            break;
                        }//く
                        case ("e"): {
                            out = out + "け";
                            word_len = 2;
                            break;
                        }//け
                        case ("o"): {
                            out = out + "こ";
                            word_len = 2;
                            break;
                        }//こ
                        case ("y"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "きゃ";
                                    word_len = 3;
                                    break;
                                }//きゃ
                                case ("u"): {
                                    out = out + "きゅ";
                                    word_len = 3;
                                    break;
                                }//きゅ
                                case ("o"): {
                                    out = out + "きょ";
                                    word_len = 3;
                                    break;
                                }//きょ
                                default: {
                                    out = out + "?";
                                    word_len = 2;
                                    break;
                                }//-2
                            }
                            break;
                        }//き+
                        case ("k"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "k";
                            word_len = 1;
                            break;
                        }//k
                    }
                    break;
                }//か行
                case ("l"): {
                    switch (now2) {
/*                        case ("a"): {
                            out = out + "?";
                            word_len = 2;
                            break;
                        }
                        case ("i"): {
                            out = out + "?";
                            word_len = 2;
                            break;
                        }
                        case ("u"): {
                            out = out + "?";
                            word_len = 2;
                            break;
                        }
                        case ("e"): {
                            out = out + "?";
                            word_len = 2;
                            break;
                        }
                        case ("o"): {
                            out = out + "?";
                            word_len = 2;
                            break;
                        }*/
                        default: {
                            out = out + "l";
                            word_len = 1;
                            break;
                        }//l
                    }
                    break;
                }
                case ("m"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "ま";
                            word_len = 2;
                            break;
                        }//ま
                        case ("i"): {
                            out = out + "み";
                            word_len = 2;
                            break;
                        }//み
                        case ("u"): {
                            out = out + "む";
                            word_len = 2;
                            break;
                        }//む
                        case ("e"): {
                            out = out + "め";
                            word_len = 2;
                            break;
                        }//め
                        case ("o"): {
                            out = out + "も";
                            word_len = 2;
                            break;
                        }//も
                        case ("y"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "みゃ";
                                    word_len = 3;
                                    break;
                                }//みゃ
                                case ("u"): {
                                    out = out + "みゅ";
                                    word_len = 3;
                                    break;
                                }//みゅ
                                case ("o"): {
                                    out = out + "みょ";
                                    word_len = 3;
                                    break;
                                }//みょ
                                default: {
                                    out = out + "?";
                                    word_len = 2;
                                    break;
                                }//-2
                            }
                            break;
                        }//み+
                        case ("m"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "m";
                            word_len = 1;
                            break;
                        }//m
                    }
                    break;
                }//ま行
                case ("n"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "な";
                            word_len = 2;
                            break;
                        }//な
                        case ("i"): {
                            out = out + "に";
                            word_len = 2;
                            break;
                        }//に
                        case ("u"): {
                            out = out + "ぬ";
                            word_len = 2;
                            break;
                        }//ぬ
                        case ("e"): {
                            out = out + "ね";
                            word_len = 2;
                            break;
                        }//ね
                        case ("o"): {
                            out = out + "の";
                            word_len = 2;
                            break;
                        }//の
                        case ("y"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "にゃ";
                                    word_len = 3;
                                    break;
                                }//にゃ
                                case ("u"): {
                                    out = out + "にゅ";
                                    word_len = 3;
                                    break;
                                }//にゅ
                                case ("o"): {
                                    out = out + "にょ";
                                    word_len = 3;
                                    break;
                                }//にょ
                                default: {
                                    out = out + "?";
                                    word_len = 2;
                                    break;
                                }//-2
                            }
                            break;
                        }//に+
                        case ("n"): {
                            out = out + "ん";
                            word_len = 2;
                            break;
                        }//ん
                        default: {
                            out = out + "ん";
                            word_len = 1;
                            break;
                        }//ん
                    }
                    break;
                }//な行，拨音nn
                case ("p"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "ぱ";
                            word_len = 2;
                            break;
                        }//ぱ
                        case ("i"): {
                            out = out + "ぴ";
                            word_len = 2;
                            break;
                        }//ぴ
                        case ("u"): {
                            out = out + "ぷ";
                            word_len = 2;
                            break;
                        }//ぷ
                        case ("e"): {
                            out = out + "ぺ";
                            word_len = 2;
                            break;
                        }//ぺ
                        case ("o"): {
                            out = out + "ぽ";
                            word_len = 2;
                            break;
                        }//ぽ
                        case ("y"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "ぴゃ";
                                    word_len = 3;
                                    break;
                                }//ぴゃ
                                case ("u"): {
                                    out = out + "ぴゅ";
                                    word_len = 3;
                                    break;
                                }//ぴゅ
                                case ("o"): {
                                    out = out + "ぴょ";
                                    word_len = 3;
                                    break;
                                }//ぴょ
                                default: {
                                    out = out + "?";
                                    word_len = 2;
                                    break;
                                }//-2
                            }
                            break;
                        }//ぴ+
                        case ("p"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "p";
                            word_len = 1;
                            break;
                        }//p
                    }
                    break;
                }//ぱ行
                case ("q"): {
                    switch (now2) {
/*                        case ("a"): {
                            out = out + "?";
                            word_len = 2;
                            break;
                        }
                        case ("i"): {
                            out = out + "?";
                            word_len = 2;
                            break;
                        }
                        case ("u"): {
                            out = out + "?";
                            word_len = 2;
                            break;
                        }
                        case ("e"): {
                            out = out + "?";
                            word_len = 2;
                            break;
                        }
                        case ("o"): {
                            out = out + "?";
                            word_len = 2;
                            break;
                        }*/
                        default: {
                            out = out + "q";
                            word_len = 1;
                            break;
                        }//q
                    }
                    break;
                }
                case ("r"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "ら";
                            word_len = 2;
                            break;
                        }//ら
                        case ("i"): {
                            out = out + "り";
                            word_len = 2;
                            break;
                        }//り
                        case ("u"): {
                            out = out + "る";
                            word_len = 2;
                            break;
                        }//る
                        case ("e"): {
                            out = out + "れ";
                            word_len = 2;
                            break;
                        }//れ
                        case ("o"): {
                            out = out + "ろ";
                            word_len = 2;
                            break;
                        }//ろ
                        case ("y"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "りゃ";
                                    word_len = 3;
                                    break;
                                }//りゃ
                                case ("u"): {
                                    out = out + "りゅ";
                                    word_len = 3;
                                    break;
                                }//りゅ
                                case ("o"): {
                                    out = out + "りょ";
                                    word_len = 3;
                                    break;
                                }//りょ
                                default: {
                                    out = out + "?";
                                    word_len = 2;
                                    break;
                                }//-2
                            }
                            break;
                        }//り+
                        case ("r"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "r";
                            word_len = 1;
                            break;
                        }//r
                    }
                    break;
                }//ら行
                case ("s"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "さ";
                            word_len = 2;
                            break;
                        }//さ
                        case ("i"): {
                            out = out + "し";
                            word_len = 2;
                            break;
                        }//し
                        case ("u"): {
                            out = out + "す";
                            word_len = 2;
                            break;
                        }//す
                        case ("e"): {
                            out = out + "せ";
                            word_len = 2;
                            break;
                        }//せ
                        case ("o"): {
                            out = out + "そ";
                            word_len = 2;
                            break;
                        }//そ
                        case ("y"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "しゃ";
                                    word_len = 3;
                                    break;
                                }//しゃ
                                case ("u"): {
                                    out = out + "しゅ";
                                    word_len = 3;
                                    break;
                                }//しゅ
                                case ("o"): {
                                    out = out + "しょ";
                                    word_len = 3;
                                    break;
                                }//しょ
                                default: {
                                    out = out + "?";
                                    word_len = 2;
                                    break;
                                }//-2
                            }
                            break;
                        }//し+
                        case ("s"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "s";
                            word_len = 1;
                            break;
                        }//s
                    }
                    break;
                }//さ行,shi待改
                case ("t"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "た";
                            word_len = 2;
                            break;
                        }//た
                        case ("i"): {
                            out = out + "ち";
                            word_len = 2;
                            break;
                        }//ち
                        case ("u"): {
                            out = out + "つ";
                            word_len = 2;
                            break;
                        }//つ
                        case ("e"): {
                            out = out + "て";
                            word_len = 2;
                            break;
                        }//て
                        case ("o"): {
                            out = out + "と";
                            word_len = 2;
                            break;
                        }//と
                        case ("s"): {
                            switch (now3) {
                                case ("u"): {
                                    out = out + "つ";
                                    word_len = 3;
                                    break;
                                }//つ
                                default: {
                                    out = out + "?";
                                    word_len = 2;
                                    break;
                                }//-2
                            }
                            break;
                        }
                        case ("t"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "t";
                            word_len = 1;
                            break;
                        }//t
                    }
                    break;
                }//た行，ti?
                case ("v"): {
                    switch (now2) {
/*                                case ("a"): {
                                    out = out + "?";
                                    word_len = 2;
                                    break;
                                }
                                case ("i"): {
                                    out = out + "?";
                                    word_len = 2;
                                    break;
                                }
                                case ("u"): {
                                    out = out + "?";
                                    word_len = 2;
                                    break;
                                }
                                case ("e"): {
                                    out = out + "?";
                                    word_len = 2;
                                    break;
                                }
                                case ("o"): {
                                    out = out + "?";
                                    word_len = 2;
                                    break;
                                }*/
                        default: {
                            out = out + "v";
                            word_len = 1;
                            break;
                        }//v
                    }
                    break;
                }
                case ("w"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "わ";
                            word_len = 2;
                            break;
                        }//わ
                        case ("i"): {
                            out = out + "ゐ";
                            word_len = 2;
                            break;
                        }//ゐ
                               case ("u"): {
                                    out = out + "う";
                                    word_len = 2;
                                    break;
                                }
                        case ("e"): {
                            out = out + "ゑ";
                            word_len = 2;
                            break;
                        }//ゑ
                        case ("o"): {
                            out = out + "を";
                            word_len = 2;
                            break;
                        }//を
                        case ("w"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "w";
                            word_len = 1;
                            break;
                        }//w
                    }
                    break;
                }//わ行，wiwe
                case ("x"): {
                    switch (now2) {
                        case ("a"): {
                                    out = out + "ぁ";
                                    word_len = 2;
                                    break;
                                }//ぁ
                                case ("i"): {
                                    out = out + "ぃ";
                                    word_len = 2;
                                    break;
                                }//ぃ
                                case ("u"): {
                                    out = out + "ぅ";
                                    word_len = 2;
                                    break;
                                }//ぅ
                                case ("e"): {
                                    out = out + "ぇ";
                                    word_len = 2;
                                    break;
                                }//ぇ
                                case ("o"): {
                                    out = out + "ぉ";
                                    word_len = 2;
                                    break;
                                }//ぉ
                        case ("y"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "ゃ";
                                    word_len = 3;
                                    break;
                                }//ゃ
                                case ("u"): {
                                    out = out + "ゅ";
                                    word_len = 3;
                                    break;
                                }//ゅ
                                case ("o"): {
                                    out = out + "ょ";
                                    word_len = 3;
                                    break;
                                }//ょ
                                default: {
                                    out = out + "xy";
                                    word_len = 2;
                                    break;
                                }//xy
                            }//ゃゅょ
                            break;
                        }//ゃゅょ
                        case ("t"):{
                            switch (now3) {
                                case ("s"): {
                                    out = out + "っ";
                                    if(now4.equals("u"))
                                        word_len = 4;
                                    else
                                        word_len = 3;
                                    break;
                                }//xts都可以认为是っ
                                default: {
                                    out = out + "xt";
                                    word_len = 2;
                                    break;
                                }//xt
                            }
                            break;
                        }
                        default: {
                            out = out + "x";
                            word_len = 1;
                            break;
                        }//x
                    }
                    break;
                }//ぁぃぅぇぉゃゅょっ
                case ("y"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "や";
                            word_len = 2;
                            break;
                        }//や
                               case ("i"): {
                                    out = out + "い";
                                    word_len = 2;
                                    break;
                                }
                        case ("u"): {
                            out = out + "ゆ";
                            word_len = 2;
                            break;
                        }//ゆ
                                case ("e"): {
                                    out = out + "いぇ";
                                    word_len = 2;
                                    break;
                                }
                        case ("o"): {
                            out = out + "よ";
                            word_len = 2;
                            break;
                        }//よ

                        case ("y"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "y";
                            word_len = 1;
                            break;
                        }//y
                    }
                    break;
                }//や行
                case ("z"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "ざ";
                            word_len = 2;
                            break;
                        }//ざ
                                case ("i"): {
                                    out = out + "じ";
                                    word_len = 2;
                                    break;
                                }
                        case ("u"): {
                            out = out + "ず";
                            word_len = 2;
                            break;
                        }//ず
                                case ("e"): {
                                    out = out + "ぜ";
                                    word_len = 2;
                                    break;
                                }
                                case ("o"): {
                                    out = out + "ぞ";
                                    word_len = 2;
                                    break;
                                }
                        case ("z"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "z";
                            word_len = 1;
                            break;
                        }//z
                    }
                    break;
                }//ざ行
                default: {
                    out = out + "?";
                    word_len = 1;
                    break;
                }//-1
            }//a→あ
        }//a→あ
        return out;
    }//a→あ
    public static String tennka2(String in) {
        int len_input=in.length();
        in=in+"   ";
        in=in.toLowerCase();
        int word_len=2;
        String now1,now2,now3,now4;
        String out ="";
        for(int i =0;i<len_input;i+=word_len) {
            now1 = in.substring(i, i + 1);
            now2 = in.substring(i + 1, i + 2);
            now3 = in.substring(i + 2, i + 3);
            now4 = in.substring(i + 3, i + 4);
            switch (now1) {
                case ("\n"): {
                    out = out + "\n";
                    word_len = 1;
                    break;
                }//换行
                case (" "): {
                    out = out + " ";
                    word_len = 1;
                    break;
                }//空白
                case ("-"): {
                    out = out + "-";
                    word_len = 1;
                    break;
                }//-
                case ("—"): {
                    out = out + "-";
                    word_len = 1;
                    break;
                }//-
                case ("_"): {
                    out = out + "-";
                    word_len = 1;
                    break;
                }//-
                case ("a"): {
                    out = out + "ア";
                    word_len = 1;
                    break;
                }//ア
                case ("i"): {
                    out = out + "イ";
                    word_len = 1;
                    break;
                }//イ
                case ("u"): {
                    out = out + "ウ";
                    word_len = 1;
                    break;
                }//ウ
                case ("e"): {
                    out = out + "エ";
                    word_len = 1;
                    break;
                }//エ
                case ("o"): {
                    out = out + "オ";
                    word_len = 1;
                    break;
                }//オ
                case ("b"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "バ";
                            word_len = 2;
                            break;
                        }//バ
                        case ("i"): {
                            out = out + "ビ";
                            word_len = 2;
                            break;
                        }//ビ
                        case ("u"): {
                            out = out + "ブ";
                            word_len = 2;
                            break;
                        }//ブ
                        case ("e"): {
                            out = out + "ベ";
                            word_len = 2;
                            break;
                        }//ベ
                        case ("o"): {
                            out = out + "ボ";
                            word_len = 2;
                            break;
                        }//ボ
                        case ("y"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "ビャ";
                                    word_len = 3;
                                    break;
                                }//ビャ
                                case ("u"): {
                                    out = out + "ビュ";
                                    word_len = 3;
                                    break;
                                }//ビュ
                                case ("o"): {
                                    out = out + "ビョ";
                                    word_len = 3;
                                    break;
                                }//ビョ
                                default: {
                                    out = out + "by";
                                    word_len = 2;
                                    break;
                                }//-2
                            }//ビ+
                            break;
                        }
                        case ("b"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default:{
                            out = out + "b";
                            word_len = 1;
                            break;
                        }//b
                    }
                    break;
                }//バ行
                case ("c"): {
                    switch (now2) {
                       case ("a"): {
                            out = out + "カ";
                            word_len = 2;
                            break;
                        }
                        case ("i"): {
                            out = out + "シ";
                            word_len = 2;
                            break;
                        }//シ
                        case ("u"): {
                            out = out + "ク";
                            word_len = 2;
                            break;
                        }//
                        case ("e"): {
                            out = out + "セ";
                            word_len = 2;
                            break;
                        }//
                        case ("o"): {
                            out = out + "コ";
                            word_len = 2;
                            break;
                        }
                        case ("h"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "チャ";
                                    word_len = 3;
                                    break;
                                }//チャ
                                case ("i"): {
                                    out = out + "チ";
                                    word_len = 3;
                                    break;
                                }//チ
                                case ("u"): {
                                    out = out + "チュ";
                                    word_len = 3;
                                    break;
                                }//チュ
                                case ("e"): {
                                    out = out + "チェ";
                                    word_len = 3;
                                    break;
                                }//チェ
                                case ("o"): {
                                    out = out + "チョ";
                                    word_len = 3;
                                    break;
                                }//チョ


                                default: {
                                    out = out + "ch";
                                    word_len = 2;
                                    break;
                                }//-2
                            }
                            break;
                        }//チ+
                        case ("c"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "c";
                            word_len = 1;
                            break;
                        }//c
                    }
                    break;
                }
                case ("d"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "ダ";
                            word_len = 2;
                            break;
                        }//ダ
                        case ("i"): {
                            out = out + "ヂ";
                            word_len = 2;
                            break;
                        }//ヂ
                        case ("u"): {
                            out = out + "ヅ";
                            word_len = 2;
                            break;
                        }//ヅ
                        case ("e"): {
                            out = out + "デ";
                            word_len = 2;
                            break;
                        }//デ
                        case ("o"): {
                            out = out + "ド";
                            word_len = 2;
                            break;
                        }//ド
                        case ("h"): {
                            switch (now3) {
                                case ("i"): {
                                    out = out + "ディ";
                                    word_len = 3;
                                    break;
                                }//ディ
                                default: {
                                    out = out + "dh";
                                    word_len = 2;
                                    break;
                                }//dh
                            }
                            break;
                        }//ディ
                        case ("y"): {
                            switch (now3) {
                                case ("u"): {
                                    out = out + "デュ";
                                    word_len = 3;
                                    break;
                                }//デュ
                                default: {
                                    out = out + "dy";
                                    word_len = 2;
                                    break;
                                }//dy
                            }
                            break;
                        }//デュ
                        case ("d"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "d";
                            word_len = 1;
                            break;
                        }//d
                    }
                    break;
                }//ダ行
                case ("f"): {
                    switch (now2) {

                        case ("a"): {
                            out = out + "ファ";
                            word_len = 2;
                            break;
                        }//ファ
                        case ("i"): {
                            out = out + "フィ";
                            word_len = 2;
                            break;
                        }//フォ
                        case ("u"): {
                            out = out + "フュ";
                            word_len = 2;
                            break;
                        }//フュ
                        case ("e"): {
                            out = out + "フェ";
                            word_len = 2;
                            break;
                        }//フェ
                        case ("o"): {
                            out = out + "フォ";
                            word_len = 2;
                            break;
                        }//フォ
                        case ("y"): {
                            switch (now3) {
                                case ("u"): {
                                    out = out + "フュ";
                                    word_len = 3;
                                    break;
                                }//フュ
                                default: {
                                    out = out + "fy";
                                    word_len = 2;
                                    break;
                                }//fy
                            }
                            break;
                        }//フュ,fyu
                        default: {
                            out = out + "f";
                            word_len = 1;
                            break;
                        }//f
                    }
                    break;
                }//ファ
                case ("g"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "ガ";
                            word_len = 2;
                            break;
                        }//ガ
                        case ("i"): {
                            out = out + "ギ";
                            word_len = 2;
                            break;
                        }//ギ
                        case ("u"): {
                            out = out + "グ";
                            word_len = 2;
                            break;
                        }//グ
                        case ("e"): {
                            out = out + "ゲ";
                            word_len = 2;
                            break;
                        }//ゲ
                        case ("o"): {
                            out = out + "ゴ";
                            word_len = 2;
                            break;
                        }//ゴ
                        case ("y"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "ギャ";
                                    word_len = 3;
                                    break;
                                }//ギャ
                                case ("u"): {
                                    out = out + "ギュ";
                                    word_len = 3;
                                    break;
                                }//ギュ
                                case ("o"): {
                                    out = out + "ギョ";
                                    word_len = 3;
                                    break;
                                }//ギョ
                                default: {
                                    out = out + "gy";
                                    word_len = 2;
                                    break;
                                }//-2
                            }
                            break;
                        }//ギ+
                        case ("g"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "g";
                            word_len = 1;
                            break;
                        }//g
                    }
                    break;
                }//ガ行
                case ("h"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "ハ";
                            word_len = 2;
                            break;
                        }//ハ
                        case ("i"): {
                            out = out + "ヒ";
                            word_len = 2;
                            break;
                        }//ヒ
                        case ("u"): {
                            out = out + "フ";
                            word_len = 2;
                            break;
                        }//フ
                        case ("e"): {
                            out = out + "ヘ";
                            word_len = 2;
                            break;
                        }//ヘ
                        case ("o"): {
                            out = out + "ホ";
                            word_len = 2;
                            break;
                        }//ホ
                        case ("y"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "ヒャ";
                                    word_len = 3;
                                    break;
                                }//ヒャ
                                case ("u"): {
                                    out = out + "ヒュ";
                                    word_len = 3;
                                    break;
                                }//ヒュ
                                case ("o"): {
                                    out = out + "ヒョ";
                                    word_len = 3;
                                    break;
                                }//ヒョ
                                default: {
                                    out = out + "hy";
                                    word_len = 2;
                                    break;
                                }//-2
                            }
                            break;
                        }//ヒ+
                        case ("h"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "h";
                            word_len = 1;
                            break;
                        }//h
                    }
                    break;
                }//ハ行
                case ("j"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "ジャ";
                            word_len = 2;
                            break;
                        }//ジャ
                        case ("i"): {
                            out = out + "ジ";
                            word_len = 2;
                            break;
                        }//ジ
                        case ("u"): {
                            out = out + "ジュ";
                            word_len = 2;
                            break;
                        }//ジュ
                        case ("e"): {
                            out = out + "ジェ";
                            word_len = 2;
                            break;
                        }//ジェ
                        case ("o"): {
                            out = out + "ジョ";
                            word_len = 2;
                            break;
                        }//ジョ
                        case ("y"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "ジャ";
                                    word_len = 3;
                                    break;
                                }//ジャ
                                case ("u"): {
                                    out = out + "ジュ";
                                    word_len = 3;
                                    break;
                                }//ジュ
                                case ("o"): {
                                    out = out + "ジョ";
                                    word_len = 3;
                                    break;
                                }//ジョ
                                default: {
                                    out = out + "jy";
                                    word_len = 2;
                                    break;
                                }//-2
                            }
                            break;
                        }//ジ+
                        case ("j"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "j";
                            word_len = 1;
                            break;
                        }//j
                    }
                    break;
                }//ジ与ヂ?
                case ("k"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "カ";
                            word_len = 2;
                            break;
                        }//カ
                        case ("i"): {
                            out = out + "キ";
                            word_len = 2;
                            break;
                        }//キ
                        case ("u"): {
                            out = out + "ク";
                            word_len = 2;
                            break;
                        }//ク
                        case ("e"): {
                            out = out + "ケ";
                            word_len = 2;
                            break;
                        }//ケ
                        case ("o"): {
                            out = out + "コ";
                            word_len = 2;
                            break;
                        }//コ
                        case ("y"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "キャ";
                                    word_len = 3;
                                    break;
                                }//キャ
                                case ("u"): {
                                    out = out + "キュ";
                                    word_len = 3;
                                    break;
                                }//キュ
                                case ("o"): {
                                    out = out + "キョ";
                                    word_len = 3;
                                    break;
                                }//キョ
                                default: {
                                    out = out + "ky";
                                    word_len = 2;
                                    break;
                                }//-2
                            }
                            break;
                        }//キ+
                        case ("k"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "k";
                            word_len = 1;
                            break;
                        }//k
                    }
                    break;
                }//カ行
                case ("l"): {
                    switch (now2) {
/*                        case ("a"): {
                            out = out + "?";
                            word_len = 2;
                            break;
                        }//
                        case ("i"): {
                            out = out + "?";
                            word_len = 2;
                            break;
                        }//
                        case ("u"): {
                            out = out + "?";
                            word_len = 2;
                            break;
                        }//
                        case ("e"): {
                            out = out + "?";
                            word_len = 2;
                            break;
                        }//
                        case ("o"): {
                            out = out + "?";
                            word_len = 2;
                            break;
                        }*/
                        default: {
                            out = out + "l";
                            word_len = 1;
                            break;
                        }//l
                    }
                    break;
                }
                case ("m"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "マ";
                            word_len = 2;
                            break;
                        }//マ
                        case ("i"): {
                            out = out + "ミ";
                            word_len = 2;
                            break;
                        }//ミ
                        case ("u"): {
                            out = out + "ム";
                            word_len = 2;
                            break;
                        }//ム
                        case ("e"): {
                            out = out + "メ";
                            word_len = 2;
                            break;
                        }//メ
                        case ("o"): {
                            out = out + "モ";
                            word_len = 2;
                            break;
                        }//モ
                        case ("y"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "ミャ";
                                    word_len = 3;
                                    break;
                                }//ミャ
                                case ("u"): {
                                    out = out + "ミュ";
                                    word_len = 3;
                                    break;
                                }//ミュ
                                case ("o"): {
                                    out = out + "ミョ";
                                    word_len = 3;
                                    break;
                                }//ミョ
                                default: {
                                    out = out + "my";
                                    word_len = 2;
                                    break;
                                }//my
                            }
                            break;
                        }//ミ+
                        case ("m"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "m";
                            word_len = 1;
                            break;
                        }//m
                    }
                    break;
                }//マ行
                case ("n"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "ナ";
                            word_len = 2;
                            break;
                        }//ナ
                        case ("i"): {
                            out = out + "ニ";
                            word_len = 2;
                            break;
                        }//ニ
                        case ("u"): {
                            out = out + "ヌ";
                            word_len = 2;
                            break;
                        }//ヌ
                        case ("e"): {
                            out = out + "ネ";
                            word_len = 2;
                            break;
                        }//ネ
                        case ("o"): {
                            out = out + "ノ";
                            word_len = 2;
                            break;
                        }//ノ
                        case ("y"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "ニャ";
                                    word_len = 3;
                                    break;
                                }//ニャ
                                case ("u"): {
                                    out = out + "ニュ";
                                    word_len = 3;
                                    break;
                                }//ニュ
                                case ("o"): {
                                    out = out + "ニョ";
                                    word_len = 3;
                                    break;
                                }//ニョ
                                default: {
                                    out = out + "ny";
                                    word_len = 2;
                                    break;
                                }//ny
                            }
                            break;
                        }//ニ+
                        case ("n"): {
                            out = out + "ん";
                            word_len = 2;
                            break;
                        }//ん
                        default: {
                            out = out + "ん";
                            word_len = 1;
                            break;
                        }//ん
                    }
                    break;
                }//ナ行，拨音nn
                case ("p"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "パ";
                            word_len = 2;
                            break;
                        }//パ
                        case ("i"): {
                            out = out + "ピ";
                            word_len = 2;
                            break;
                        }//ピ
                        case ("u"): {
                            out = out + "プ";
                            word_len = 2;
                            break;
                        }//プ
                        case ("e"): {
                            out = out + "ペ";
                            word_len = 2;
                            break;
                        }//ペ
                        case ("o"): {
                            out = out + "ポ";
                            word_len = 2;
                            break;
                        }//ポ
                        case ("y"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "ピャ";
                                    word_len = 3;
                                    break;
                                }//ピャ
                                case ("u"): {
                                    out = out + "ピュ";
                                    word_len = 3;
                                    break;
                                }//ピュ
                                case ("o"): {
                                    out = out + "ピョ";
                                    word_len = 3;
                                    break;
                                }//ピョ
                                default: {
                                    out = out + "py";
                                    word_len = 2;
                                    break;
                                }//-2
                            }
                            break;
                        }//ピ+
                        case ("p"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "p";
                            word_len = 1;
                            break;
                        }//p
                    }
                    break;
                }//パ行
                case ("q"): {
                    switch (now2) {
/*                        case ("a"): {
                            out = out + "?";
                            word_len = 2;
                            break;
                        }//
                        case ("i"): {
                            out = out + "?";
                            word_len = 2;
                            break;
                        }//
                        case ("u"): {
                            out = out + "?";
                            word_len = 2;
                            break;
                        }//
                        case ("e"): {
                            out = out + "?";
                            word_len = 2;
                            break;
                        }//
                        case ("o"): {
                            out = out + "?";
                            word_len = 2;
                            break;
                        }*/
                        case ("w"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "クァ";
                                    word_len = 3;
                                    break;
                                }//クァ
                                case ("o"): {
                                    out = out + "クォ";
                                    word_len = 3;
                                    break;
                                }//クォ
                                default: {
                                    out = out + "qw";
                                    word_len = 2;
                                    break;
                                }//qw
                            }
                            break;
                        }//クァ、クォ
                        default: {
                            out = out + "q";
                            word_len = 1;
                            break;
                        }//q
                    }
                    break;
                }//ク+
                case ("r"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "ラ";
                            word_len = 2;
                            break;
                        }//ラ
                        case ("i"): {
                            out = out + "リ";
                            word_len = 2;
                            break;
                        }//リ
                        case ("u"): {
                            out = out + "ル";
                            word_len = 2;
                            break;
                        }//ル
                        case ("e"): {
                            out = out + "レ";
                            word_len = 2;
                            break;
                        }//レ
                        case ("o"): {
                            out = out + "ロ";
                            word_len = 2;
                            break;
                        }//ロ
                        case ("y"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "リャ";
                                    word_len = 3;
                                    break;
                                }//リャ
                                case ("u"): {
                                    out = out + "リュ";
                                    word_len = 3;
                                    break;
                                }//リュ
                                case ("o"): {
                                    out = out + "リョ";
                                    word_len = 3;
                                    break;
                                }//リョ
                                default: {
                                    out = out + "ry";
                                    word_len = 2;
                                    break;
                                }//ry
                            }
                            break;
                        }//リ+
                        case ("r"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "r";
                            word_len = 1;
                            break;
                        }//r
                    }
                    break;
                }//ラ行
                case ("s"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "サ";
                            word_len = 2;
                            break;
                        }//サ
                        case ("i"): {
                            out = out + "シ";
                            word_len = 2;
                            break;
                        }//シ
                        case ("u"): {
                            out = out + "ス";
                            word_len = 2;
                            break;
                        }//ス
                        case ("e"): {
                            out = out + "セ";
                            word_len = 2;
                            break;
                        }//セ
                        case ("o"): {
                            out = out + "ソ";
                            word_len = 2;
                            break;
                        }//ソ
                        case ("h"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "シャ";
                                    word_len = 3;
                                    break;
                                }//シャ
                                case ("i"): {
                                    out = out + "シ";
                                    word_len = 3;
                                    break;
                                }//シ
                                case ("u"): {
                                    out = out + "シュ";
                                    word_len = 3;
                                    break;
                                }//シュ
                                case ("e"): {
                                    out = out + "チェ";
                                    word_len = 3;
                                    break;
                                }//チェ
                                case ("o"): {
                                    out = out + "ショ";
                                    word_len = 3;
                                    break;
                                }//ショ
                                default: {
                                    out = out + "sh";
                                    word_len = 2;
                                    break;
                                }//-2
                            }
                            break;
                        }//チ+
                        case ("y"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "シャ";
                                    word_len = 3;
                                    break;
                                }//シャ
                                case ("u"): {
                                    out = out + "シュ";
                                    word_len = 3;
                                    break;
                                }//シュ
                                case ("o"): {
                                    out = out + "ショ";
                                    word_len = 3;
                                    break;
                                }//ショ
                                default: {
                                    out = out + "sy";
                                    word_len = 2;
                                    break;
                                }//sy
                            }
                            break;
                        }//シ+
                        case ("s"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "s";
                            word_len = 1;
                            break;
                        }//s
                    }
                    break;
                }//サ行,shi待改
                case ("t"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "タ";
                            word_len = 2;
                            break;
                        }//タ
                        case ("i"): {
                            out = out + "チ";
                            word_len = 2;
                            break;
                        }//チ
                        case ("u"): {
                            out = out + "トゥ";
                            word_len = 2;
                            break;
                        }//トゥ
                        case ("e"): {
                            out = out + "テ";
                            word_len = 2;
                            break;
                        }//テ
                        case ("o"): {
                            out = out + "ト";
                            word_len = 2;
                            break;
                        }//ト
                        case ("s"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "ツァ";
                                    word_len = 3;
                                    break;
                                }//ツァ
                                case ("e"): {
                                    out = out + "ツェ";
                                    word_len = 3;
                                    break;
                                }//ツェ
                                case ("u"): {
                                    out = out + "ツ";
                                    word_len = 3;
                                    break;
                                }//ツ
                                default: {
                                    out = out + "ts";
                                    word_len = 2;
                                    break;
                                }//-2
                            }
                            break;
                        }
                        case ("h"): {
                            switch (now3) {
                                case ("i"): {
                                    out = out + "ティ";
                                    word_len = 3;
                                    break;
                                }//ティ
                                default: {
                                    out = out + "th";
                                    word_len = 2;
                                    break;
                                }//th
                            }
                            break;
                        }//ティ，thi
                        case ("y"): {
                            switch (now3) {
                                case ("u"): {
                                    out = out + "テュ";
                                    word_len = 3;
                                    break;
                                }//クォ
                                default: {
                                    out = out + "ty";
                                    word_len = 2;
                                    break;
                                }//ty
                            }
                            break;
                        }//テュ，tyu
                        case ("t"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "t";
                            word_len = 1;
                            break;
                        }//t
                    }
                    break;
                }//タ行
                case ("v"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "ヴァ";
                            word_len = 2;
                            break;
                        }//ヴァ
                        case ("i"): {
                            out = out + "ヴィ";
                            word_len = 2;
                            break;
                        }//ヴィ
                        case ("u"): {
                            out = out + "ヴ";
                            word_len = 2;
                            break;
                        }//ヴ
                        case ("e"): {
                            out = out + "ウェ";
                            word_len = 2;
                            break;
                        }//ヴェ
                        case ("o"): {
                            out = out + "ヴォ";
                            word_len = 2;
                            break;
                        }//ヴォ
                        default: {
                            out = out + "v";
                            word_len = 1;
                            break;
                        }//v
                    }
                    break;
                }//ヴ+
                case ("w"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "ワ";
                            word_len = 2;
                            break;
                        }//ワ
                        case ("i"): {
                            out = out + "ウィ";
                            word_len = 2;
                            break;
                        }//ウィ
                                case ("u"): {
                                    out = out + "ウ";
                                    word_len = 2;
                                    break;
                                }
                        case ("e"): {
                            out = out + "ウェ";
                            word_len = 2;
                            break;
                        }//ウェ
                        case ("o"): {
                            out = out + "ウォ";
                            word_len = 2;
                            break;
                        }//ウォ
                        case ("w"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "w";
                            word_len = 1;
                            break;
                        }//w
                    }
                    break;
                }//ワ行，wiwe
                case ("x"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "ァ";
                            word_len = 2;
                            break;
                        }//ァ
                        case ("i"): {
                            out = out + "ィ";
                            word_len = 2;
                            break;
                        }//ィ
                        case ("u"): {
                            out = out + "ゥ";
                            word_len = 2;
                            break;
                        }//ゥ
                        case ("e"): {
                            out = out + "ェ";
                            word_len = 2;
                            break;
                        }//ェ
                        case ("o"): {
                            out = out + "ォ";
                            word_len = 2;
                            break;
                        }//ォ
                        case ("t"):{
                            switch (now3) {
                                case ("s"): {
                                    out = out + "ッ";
                                    if(now4.equals("u"))
                                        word_len = 4;
                                    else
                                        word_len = 3;
                                    break;
                                }//xts*都可以认为是xtsuッ
                                default: {
                                    out = out + "xt";
                                    word_len = 2;
                                    break;
                                }//xt
                            }
                            break;
                        }
                        case ("y"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "ャ";
                                    word_len = 3;
                                    break;
                                }//ャ
                                case ("u"): {
                                    out = out + "ュ";
                                    word_len = 3;
                                    break;
                                }//ュ
                                case ("o"): {
                                    out = out + "ョ";
                                    word_len = 3;
                                    break;
                                }//ョ
                                default: {
                                    out = out + "xy";
                                    word_len = 2;
                                    break;
                                }//xy
                            }//ャゅょ
                            break;
                        }//ャゅょ
                        default: {
                            out = out + "x";
                            word_len = 1;
                            break;
                        }//x
                    }
                    break;
                }//ァィゥェォャュョッ
                case ("y"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "ヤ";
                            word_len = 2;
                            break;
                        }//ヤ
                                case ("i"): {
                                    out = out + "イ";
                                    word_len = 2;
                                    break;
                                }
                        case ("u"): {
                            out = out + "ユ";
                            word_len = 2;
                            break;
                        }//ユ
                        case ("e"): {
                            out = out + "イェ";
                            word_len = 2;
                            break;
                        }//イェ
                        case ("o"): {
                            out = out + "ヨ";
                            word_len = 2;
                            break;
                        }//ヨ
                        case ("y"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "y";
                            word_len = 1;
                            break;
                        }//y
                    }
                    break;
                }//ヤ行
                case ("z"): {
                    switch (now2) {
                        case ("a"): {
                            out = out + "ザ";
                            word_len = 2;
                            break;
                        }//ザ
                        case ("i"): {
                            out = out + "ジ";
                            word_len = 2;
                            break;
                        }//ジ
                        case ("u"): {
                            out = out + "ズ";
                            word_len = 2;
                            break;
                        }//ズ
                        case ("e"): {
                            out = out + "ゼ";
                            word_len = 2;
                            break;
                        }//ゼ
                        case ("o"): {
                            out = out + "ゾ";
                            word_len = 2;
                            break;
                        }//ゾ
                        case ("h"): {
                            switch (now3) {
                                case ("a"): {
                                    out = out + "ヂャ";
                                    word_len = 3;
                                    break;
                                }//ヂャ
                                default: {
                                    out = out + "zh";
                                    word_len = 2;
                                    break;
                                }//zh
                            }
                            break;
                        }//ヂャ，zha
                        case ("z"): {
                            out = out + "っ";
                            word_len = 1;
                            break;
                        }//っ
                        default: {
                            out = out + "z";
                            word_len = 1;
                            break;
                        }//z
                    }
                    break;
                }//ザ行
                default: {
                    out = out + "?";
                    word_len = 1;
                    break;
                }//-1
            }
        }////a→ア转换逻辑
        return out;
    }//a→あ
    public void onClick(View v){
        word_len=2;
        out ="";
        TextView tvin =(TextView)findViewById(R.id.editText1);
        TextView tvout =(TextView)findViewById(R.id.editText2);
        TextView lenin = (TextView)findViewById(R.id.textView);
        TextView lenout = (TextView)findViewById(R.id.textView2);

        String in = tvin.getText().toString();

        int len_input=in.length();
        lenin.setText("输入长度："+len_input+"");

        out=tennka1(in);
        tvout.setText(out);
        lenout.setText("输出长度：" + out.length() + "");
    }//a→あ
    public void onClick2(View v){
        TextView tvin =(TextView)findViewById(R.id.editText1);
        TextView illu = (TextView)findViewById(R.id.textView3);
        tvin.setText("aaaiauaeao\n" +
                "babibubebo\n" +
                "cacicuceco\n" +
                "dadidudedo\n" +
                "eaeieueeeo\n" +
                "fafifufefo\n" +
                "gagigugego\n\n" +
                "hahihuheho\n" +
                "iaiiiuieio\n" +
                "jajijujejo\n" +
                "kakikukeko\n" +
                "lalilulelo\n" +
                "mamimumemo\n" +
                "naninuneno\n\n" +
                "oaoiouoeoo\n" +
                "papipupepo\n" +
                "qaqiquqeqo\n" +
                "rarirurero\n" +
                "sasisuseso\n" +
                "tatituteto\n\n" +
                "uauiuuueuo\n" +
                "vavivuvevo\n" +
                "wawiwuwewo\n" +
                "xaxixuxexo\n" +
                "yayiyuyeyo\n" +
                "zazizuzezo");
        illu.setText("例一，输入26个字母及aiueo\n如babibubebo，共260字（25个回车）,并转换");
        onClick(v);
    }//单音例	int a=97;   for(int i=0 ; i<26;i++){printf("%ca%ci%cu%ce%co\n",a+i,a+i,a+i,a+i,a+i);}
    public void onClick3(View v){
        TextView tvin =(TextView)findViewById(R.id.editText1);
        TextView illu = (TextView)findViewById(R.id.textView3);
        tvin.setText("byabyubyo\n" +
                "gyagyugyo\n" +
                "hyahyuhyo\n" +
                "jyajyujyo\n" +
                "kyakyukyo\n" +
                "myamyumyo\n" +
                "nyanyunyo\n" +
                "pyapyupyo\n" +
                "ryaryuryo\n" +
                "syasyusyo");
        illu.setText("例二，组合输入bghjkmnprs及yayuyo\n如byabyubyo，共10*9字（9个回车）,并转换");
        onClick(v);
    }//拗音例
    public void onClick4(View v){
        TextView tvout =(TextView)findViewById(R.id.editText2);
        ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        cm.setText(tvout.getText());
        Toast.makeText(this, "复制成功", Toast.LENGTH_SHORT).show();
    }//结果复制
    public void onClick5(View v){
        TextView tvin =(TextView)findViewById(R.id.editText1);
        ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        tvin.setText(cm.getText());
    }//粘贴进来
    public void onClick6(View v){
        TextView tvin =(TextView)findViewById(R.id.editText1);
        tvin.setText("");
    }//上面清空
    public void onClick7(View v){
        TextView tvout =(TextView)findViewById(R.id.editText2);
        tvout.setText("");
    }//下面清空
    public void onClick8(View v){
        word_len=1;
        out ="";
        TextView tvin =(TextView)findViewById(R.id.editText1);
        TextView tvout =(TextView)findViewById(R.id.editText2);
        TextView lenin = (TextView)findViewById(R.id.textView);
        TextView lenout = (TextView)findViewById(R.id.textView2);
        String in = tvin.getText().toString();
        int len_input=in.length();
        lenin.setText("输入长度："+len_input+"");
        out=tennka2(in);
        tvout.setText(out);
        lenout.setText("输出长度：" + out.length() + "");
    }//a→ア
}

