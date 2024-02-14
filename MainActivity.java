package com.mko.jp6;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;


public class MainActivity extends Activity {
    String out ="";
    int word_len=1;
    TextView tvin,tvout,lenin,lenout,illu;
    public static HashMap<String, String> case1case2Map = new HashMap<String, String>();
    public static HashMap<String, String> case1case2Map2 = new HashMap<String, String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //初始化哈希表
        for (int i = 0; i < case1case2.length; i++) {
            case1case2Map.put(case1case2[i][0], case1case2[i][1]);
        }
        for (int i = 0; i < case1case2_2.length; i++) {
            case1case2Map2.put(case1case2_2[i][0], case1case2_2[i][1]);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvin =(TextView)findViewById(R.id.editText1);
        tvout =(TextView)findViewById(R.id.editText2);
        lenin = (TextView)findViewById(R.id.textView);
        lenout = (TextView)findViewById(R.id.textView2);
        illu = (TextView)findViewById(R.id.textView3);

    }
    public static String tennka1(String in,HashMap<String, String> map1) {
        //对in的每个字符：
        //尝试加四位匹配，匹配成功，输出匹配到的value
        //匹配失败则减一位继续匹配（最小可减至1位）。直到匹配成功。
        //匹配成功则：输出匹配到的value，i加上匹配到的key的长度
        //如果1位也匹配失败，则将该字符输出为原字符
        String out = "";
        int i = 0;
        while (i < in.length() - 3) {
            String key = in.substring(i, i + 3);
            String value = map1.get(key);
            if (value == null) {
                key = in.substring(i, i + 2);
                value = map1.get(key);
                if (value == null) {
                    if (in.substring(i, i + 1).equals(in.substring(i + 1, i + 2)) && in.charAt(i) > 97 && in.charAt(i) < 122 && in.charAt(i) != 'a' && in.charAt(i) != 'i' && in.charAt(i) != 'u' && in.charAt(i) != 'e' && in.charAt(i) != 'o') {
                        value = map1.get("xtu");
                        //如果是nn，get到的是作为单音的n，所以要判断一下
                        if(in.charAt(i) == 'n'){
                            value = map1.get("n");
                        }
                        i--;
                    }else{
                        key = in.substring(i, i + 1);
                        value = map1.get(key);
                        if (value == null) {
                            value = key;
                        }
                    }

                }
            }
            out += value;
            i += key.length();
        }
        return out;
    }
    //初始化一个二维数组，将以上tenka1函数中case1case2的双音节的字符串对应的字符，放入二维数组中
    public static String[][] case1case2 = {
            {"ba", "ば"}, {"bi", "び"}, {"bu", "ぶ"}, {"be", "べ"}, {"bo", "ぼ"},
            {"bya", "びゃ"}, {"byu", "びゅ"}, {"byo", "びょ"},            {"ca", "か"}, {"ci", "し"}, {"cu", "く"}, {"ce", "せ"}, {"co", "こ"},            {"cha", "ちゃ"}, {"chu", "ちゅ"}, {"cho", "ちょ"},            {"da", "だ"}, {"di", "ぢ"}, {"du", "づ"}, {"de", "で"}, {"do", "ど"},
            {"dya", "ぢゃ"}, {"dyu", "ぢゅ"}, {"dyo", "ぢょ"},            {"fa", "ふぁ"}, {"fi", "ふぃ"}, {"fu", "ふ"}, {"fe", "ふぇ"}, {"fo", "ふぉ"},            {"ga", "が"}, {"gi", "ぎ"}, {"gu", "ぐ"}, {"ge", "げ"}, {"go", "ご"},            {"gya", "ぎゃ"}, {"gyu", "ぎゅ"}, {"gyo", "ぎょ"},
            {"ha", "は"}, {"hi", "ひ"}, {"hu", "ふ"}, {"he", "へ"}, {"ho", "ほ"},            {"hya", "ひゃ"}, {"hyu", "ひゅ"}, {"hyo", "ひょ"},            {"ja", "じゃ"}, {"ji", "じ"}, {"ju", "じゅ"}, {"je", "じぇ"}, {"jo", "じょ"},            {"jya", "じゃ"}, {"jyu", "じゅ"}, {"jyo", "じょ"},
            {"ka", "か"}, {"ki", "き"}, {"ku", "く"}, {"ke", "け"}, {"ko", "こ"},            {"kya", "きゃ"}, {"kyu", "きゅ"}, {"kyo", "きょ"},            {"la", "ぁ"}, {"li", "ぃ"}, {"lu", "ぅ"}, {"le", "ぇ"}, {"lo", "ぉ"},            {"lwa", "ゎ"},
            {"ma", "ま"}, {"mi", "み"}, {"mu", "む"}, {"me", "め"}, {"mo", "も"},            {"mya", "みゃ"}, {"myu", "みゅ"}, {"myo", "みょ"},            {"na", "な"}, {"ni", "に"}, {"nu", "ぬ"}, {"ne", "ね"}, {"no", "の"},            {"nya", "にゃ"}, {"nyu", "にゅ"}, {"nyo", "にょ"},
            {"pa", "ぱ"}, {"pi", "ぴ"}, {"pu", "ぷ"}, {"pe", "ぺ"}, {"po", "ぽ"},            {"pya", "ぴゃ"}, {"pyu", "ぴゅ"}, {"pyo", "ぴょ"},            {"qa", "くぁ"}, {"qi", "くぃ"}, {"qu", "く"}, {"qe", "くぇ"}, {"qo", "くぉ"},            {"ra", "ら"}, {"ri", "り"}, {"ru", "る"}, {"re", "れ"}, {"ro", "ろ"},
            {"rya", "りゃ"}, {"ryu", "りゅ"}, {"ryo", "りょ"},            {"sa", "さ"}, {"si", "し"}, {"su", "す"}, {"se", "せ"}, {"so", "そ"},            {"sha", "しゃ"}, {"shu", "しゅ"}, {"sho", "しょ"},            {"ta", "た"}, {"ti", "ち"}, {"tu", "つ"}, {"te", "て"}, {"to", "と"},
            //sya、syu、syo
            {"sya", "しゃ"}, {"syu", "しゅ"}, {"syo", "しょ"},

            {"tsu", "つ"},            {"va", "ゔぁ"}, {"vi", "ゔぃ"}, {"vu", "ゔ"}, {"ve", "ゔぇ"}, {"vo", "ゔぉ"},            {"wa", "わ"}, {"wi", "ゐ"}, {"wu", "う"}, {"we", "ゑ"}, {"wo", "を"},            {"xa", "ぁ"}, {"xi", "ぃ"}, {"xu", "ぅ"}, {"xe", "ぇ"}, {"xo", "ぉ"},
            {"xtu", "っ"},            {"ya", "や"}, {"yi", "い"}, {"yu", "ゆ"}, {"ye", "いぇ"}, {"yo", "よ"},            {"za", "ざ"}, {"zi", "じ"}, {"zu", "ず"}, {"ze", "ぜ"}, {"zo", "ぞ"},            {"zya", "じゃ"}, {"zyu", "じゅ"}, {"zyo", "じょ"},
            {"-", "ー"}, {" ", " "}, {"\n", "\n"},           {"a", "あ"}, {"i", "い"}, {"u", "う"}, {"e", "え"}, {"o", "お"},
            {"n", "ん"}

    };

    //初始化一个二维数组，将以下tenka2函数中case1case2的双音节的字符串对应的字符，放入二维数组中
    public static String[][] case1case2_2 = {
            {"ba", "バ"}, {"bi", "ビ"}, {"bu", "ブ"}, {"be", "ベ"}, {"bo", "ボ"},            {"bya", "ビャ"}, {"byu", "ビュ"}, {"byo", "ビョ"},            {"ca", "カ"}, {"ci", "シ"}, {"cu", "ク"}, {"ce", "セ"}, {"co", "コ"},            {"cha", "チャ"}, {"chu", "チュ"}, {"cho", "チョ"},
            {"da", "ダ"}, {"di", "ヂ"}, {"du", "ヅ"}, {"de", "デ"}, {"do", "ド"},            {"dya", "ヂャ"}, {"dyu", "ヂュ"}, {"dyo", "ヂョ"},            {"fa", "ファ"}, {"fi", "フィ"}, {"fu", "フ"}, {"fe", "フェ"}, {"fo", "フォ"},            {"ga", "ガ"}, {"gi", "ギ"}, {"gu", "グ"}, {"ge", "ゲ"}, {"go", "ゴ"},
            {"gya", "ギャ"}, {"gyu", "ギュ"}, {"gyo", "ギョ"},            {"ha", "ハ"}, {"hi", "ヒ"}, {"hu", "フ"}, {"he", "ヘ"}, {"ho", "ホ"},            {"hya", "ヒャ"}, {"hyu", "ヒュ"}, {"hyo", "ヒョ"},            {"ja", "ジャ"}, {"ji", "ジ"}, {"ju", "ジュ"}, {"je", "ジェ"}, {"jo", "ジョ"},
            {"jya", "ジャ"}, {"jyu", "ジュ"}, {"jyo", "ジョ"},            {"ka", "カ"}, {"ki", "キ"}, {"ku", "ク"}, {"ke", "ケ"}, {"ko", "コ"},            {"kya", "キャ"}, {"kyu", "キュ"}, {"kyo", "キョ"},            {"la", "ァ"}, {"li", "ィ"}, {"lu", "ゥ"}, {"le", "ェ"}, {"lo", "ォ"},
            {"lwa", "ヮ"},            {"ma", "マ"}, {"mi", "ミ"}, {"mu", "ム"}, {"me", "メ"}, {"mo", "モ"},           {"mya", "ミャ"}, {"myu", "ミュ"}, {"myo", "ミョ"},            {"na", "ナ"}, {"ni", "ニ"}, {"nu", "ヌ"}, {"ne", "ネ"}, {"no", "ノ"},
            {"nya", "ニャ"}, {"nyu", "ニュ"}, {"nyo", "ニョ"},            {"pa", "パ"}, {"pi", "ピ"}, {"pu", "プ"}, {"pe", "ペ"}, {"po", "ポ"},            {"pya", "ピャ"}, {"pyu", "ピュ"}, {"pyo", "ピョ"},            {"qa", "クァ"}, {"qi", "クィ"}, {"qu", "ク"}, {"qe", "クェ"}, {"qo", "クォ"},
            {"ra", "ラ"}, {"ri", "リ"}, {"ru", "ル"}, {"re", "レ"}, {"ro", "ロ"},            {"rya", "リャ"}, {"ryu", "リュ"}, {"ryo", "リョ"},            {"sa", "サ"}, {"si", "シ"}, {"shi", "シ"}, {"su", "ス"}, {"se", "セ"}, {"so", "ソ"},            {"sha", "シャ"}, {"shu", "シュ"}, {"sho", "ショ"},
            //sya、syu、syo
            {"sya", "シャ"}, {"syu", "シュ"}, {"syo", "ショ"},
            {"ta", "タ"}, {"ti", "チ"}, {"tu", "ツ"}, {"te", "テ"}, {"to", "ト"},            {"tsu", "ツ"},            {"va", "ヴァ"}, {"vi", "ヴィ"}, {"vu", "ヴ"}, {"ve", "ヴェ"}, {"vo", "ヴォ"},            {"wa", "ワ"}, {"wi", "ヰ"}, {"wu", "ウ"}, {"we", "ヱ"}, {"wo", "ヲ"},
            {"xa", "ァ"}, {"xi", "ィ"}, {"xu", "ゥ"}, {"xe", "ェ"}, {"xo", "ォ"},            {"xtu", "ッ"},            {"ya", "ヤ"}, {"yi", "イ"}, {"yu", "ユ"}, {"ye", "イェ"}, {"yo", "ヨ"},            {"za", "ザ"}, {"zi", "ジ"}, {"zu", "ズ"}, {"ze", "ゼ"}, {"zo", "ゾ"},
            {"zya", "ジャ"}, {"zyu", "ジュ"}, {"zyo", "ジョ"},            {"-", "ー"}, {" ", " "}, {"\n", "\n"},            {"a", "ア"}, {"i", "イ"}, {"u", "ウ"}, {"e", "エ"}, {"o", "オ"},            {"n", "ン"},
    };


    public void onClick(View v){
        word_len=2;
        out ="";
        //防溢出
        String in = tvin.getText().toString() + "...";

        int len_input=in.length() - 3;
        lenin.setText("输入长度："+len_input+"");

        out=tennka1(in,case1case2Map);
        tvout.setText(out);
        lenout.setText("输出长度：" + out.length() + "");
    }//a→あ
    public void onClick2(View v){
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
        ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        cm.setText(tvout.getText());
        Toast.makeText(this, "复制成功", Toast.LENGTH_SHORT).show();
    }//结果复制
    public void onClick5(View v){
        ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        tvin.setText(cm.getText());
    }//粘贴进来
    public void onClick6(View v){
        tvin.setText("");
    }//上面清空
    public void onClick7(View v){
        tvout.setText("");
    }//下面清空
    public void onClick8(View v){
        word_len=1;
        out ="";
        String in = tvin.getText().toString() + "...";
        int len_input=in.length() -3 ;
        lenin.setText("输入长度："+len_input+"");
        out=tennka1(in,case1case2Map2);
        tvout.setText(out);
        lenout.setText("输出长度：" + out.length() + "");
    }//a→ア
    public void onClick9(View v){
        tvin.setText("aiueo\n" +
                "kakikukeko\n" +
                "sasisuseso\n" +
                "tatitsuteto\n" +
                "naninuneno\n" +
                "hahihuheho\n" +
                "mamimumemo\n" +
                "yayuyo\n" +
                "rarirurero\n" +
                "wawo\n");
        illu.setText("例三，五十音");
        onClick(v);
    }//拗音例
}

