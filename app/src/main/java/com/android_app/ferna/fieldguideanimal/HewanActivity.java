package com.android_app.ferna.fieldguideanimal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Fernalia on 09/05/2016.
 */
public class HewanActivity extends AppCompatActivity {
    TextView txt_kelas;
    ImageView img_deskripsi;
    TextView txt_deskripsi;
    String deskipsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hewan);
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.hide();

        txt_kelas      = (TextView) findViewById(R.id.txt_kelas);
        img_deskripsi  = (ImageView) findViewById(R.id.img_deskripsi);
        txt_deskripsi  = (TextView) findViewById(R.id.txt_deskipsi);

        Intent i = getIntent();
        String kelas = i.getStringExtra("kelas");

        txt_kelas.setText(kelas);

        switch (kelas){
            case "Calcarea":
                img_deskripsi.setImageResource(R.drawable.clathrina);
                deskipsi = "Rangka tubuh Calcarea bersifat kalkareus. Hal ini karena spikulanya mengandung kalsium karbonat (kapur). Sebagian spikulanya berbentuk monaxon dan triaxon sehingga tampak seperti duri-duri kecil. Anggota kelas ini banyak tersebar di laut dangkal di seluruh dunia. Contoh Scypha sp., Cerantia sp., Sycon sp., Leucon sp., dan Clathrina sp.";
                break;
            case "Hexactinellida":
                img_deskripsi.setImageResource(R.drawable.hexactinellida);
                deskipsi = "Spikula pada kelas ini mengandung banyak benang silikat atau kersik (SiO2). Sementara itu, spikulanya berbentuk triaxon dengan enam cabang. Bentuk hewan-hewan pada kelas ini menyerupai gelas, silinder, atau corong. Contoh Euplectella aspergilium, Pheronema, dan Hyalonema sp.";
                break;
            case "Demospongiae":
                img_deskripsi.setImageResource(R.drawable.demospongia);
                deskipsi = "Hewan anggota kelas ini bertulang lunak karena tidak mempunyai rangka. Apabila ada yang memiliki rangka, rangkanya tersusun dari serabut-serabut spongin dengan spikula dari zat silikat. Bentuk spikulanya ada yang monaxon atau tetraxon. Contoh Euspongia sp., Callyspongia sp., Clionia sp., Phyllospongia sp., dan Spongia sp.";
                break;
            case "Hydrozoa":
                img_deskripsi.setImageResource(R.drawable.hydrozoa);
                deskipsi = "Hydrozoa merupakan kelompok coelenterata yang hidupnya di air laut maupun air tawar yang agak dangkal. Kata Hydozoa berasalah dari bahasa yunani, yaitu “hydro” yang artinya air, dan “zoa” yang artinya hewan. Anggotanya dapat hidup soliter (menyendiri) dan dapat juga hidup berkoloni. Umumnya yang hidup soliter bersifat polip (menetap pada satu tempat), dan yang hidup soliter dapat bersifat polip maupun medusa. Umumnya berukuran 0,5 – 6cm.";
                break;
            case "Scyphozoa":
                img_deskripsi.setImageResource(R.drawable.scyphozoa);
                deskipsi = "Scyphozoa merupakan kelompok coelenterata yang memiliki bentuk seperti mangkuk. Kata Scyphozoa berasal dari bahasa yunani yaitu “Scyphos” yang artinya mangkuk, dan “Zoa” yang berarti hewan. Scyphozoa lebih dominan bersifat medusa (hidup bebas) selama siklus hidupnya. Ukuran tubuhnya sekitar 2 – 40 cm. Apabila hewan polip dari kelompok ini bereproduksi secara aseksual, maka ia akan menghasilkan keturunan yang bersifat medusa. Hewan yang paling dikenal dari kelompok ini adalah Ubur-Ubur.";
                break;
            case "Anthozoa":
                img_deskripsi.setImageResource(R.drawable.anthozoa);
                deskipsi = "Anthozoa merupakan kelompok coelenterata yang memiliki tentakel beraneka warna seperti bunga. Kata Anthozoa berasal dari bahasa yunani, yaitu “antho” yang artinya bunga dan “zoa” yang artinya hewan. Anthozoa tidak memiliki bentuk medusa, ia hanya ditemukan dalam bentuk polip (hidup menetap pada satu tempat). Hewan ini biasanya hidup di laut dangkal secara berkoloni atau soliter (menyendiri). Contoh hewan kelas ini adalah hewan karang.";
                break;
            case "Turbellaria":
                img_deskripsi.setImageResource(R.drawable.turbellaria);
                deskipsi = "Hampir semua Turbellaria hidup bebas di alam. Sebagian besar hidup di dasar laut, pasir, lumpur, atau di bawah batu karang. Ada pula yang hidup bersimbiosis dengan ganggang, serta bersimbiosis komensalisme di rongga mantel Mollusca dan di insang Crustaceae. Beberapa jenis Turbellaria hidup parasit di dalam usus Mollusca dan rongga tubuh Echinodermata. Planaria atau Dugesia banyak hidup di kolam dan perairan air tawar yang belum terpolusi. Planaria hidup sebagai karnivor dengan memakan hewan-hewan yang berukuran lebih kecil atau hewan yang sudah mati. Salah satu jenis Turbellaria, Pseudophaenocora dapat hidup di perairan dengan kadar oksigen yang rendah. Pseudophaenocora banyak ditemukan di daerah beriklim tropis.";
                break;
            case "Trematoda":
                img_deskripsi.setImageResource(R.drawable.trematoda);
                deskipsi = "Trematoda disebut juga flukes. Mereka memiliki tubuh berbentuk lonjong hingga panjang yang dilapisi kutikula. Cacing dewasa berukuran 0,2 mm – 6 cm. Trematoda hidup endoparasit pada ikan, amfibi, reptilia, burung, mamalia, termasuk juga manusia. Namun ada pula yang ektoparasit. Pada daur hidupnya, cacing ini memiliki inang utama sebagai tempat hidup saat dewasa dan inang perantara sebagai tempat hidup saat stadium larva. Trematoda memiliki satu atau dua alat pengisap untuk menempel pada tubuh inang. Cacing ini memakan serpihan sel, lendir, dan darah inang. Contohnya cacing hati pada hewan ternak herbivor (Fasciola hepatica), cacing hati pada manusia (Clonorchis sinensis), dan blood flukes (Schistosoma japonicum, Schistosoma mansoni).";
                break;
            case "Cestoda":
                img_deskripsi.setImageResource(R.drawable.cestoda);
                deskipsi = "Cacing pita hidup parasit di usus vertebrata, misalnya manusia, sapi, anjing, babi, ayam, dan ikan. Tubuh cacing pita ditutupi oleh kutikula, tidak memiliki mulut dan alat pencernaan, serta tidak memiliki alat indra. Tubuh cacing dewasa terdiri atas kepala (skoleks), leher pendek (strobilus), dan proglotid. Skoleks dilengkapi alat pengisap (sucker) dan alat kait (rostellum) untuk melekat pada organ tubuh inang. Leher merupakan daerah pertunasan, dengan cara strobilasi menghasilkan strobilus berupa serangkaian proglotid dengan jumlah mencapai 1.000 buah. Proglotid yang paling dekat dengan leher merupakan proglotid termuda. Semakin jauh dengan leher, proglotid semakin berukuran besar dan dewasa. Setiap proglotid memiliki alat kelamin jantan maupun betina. Pembuahan dapat terjadi dalam satu proglotid, serta antar proglotid dari individu yang sama maupun yang berbeda. Telur yang sudah dibuahi akan memenuhi uterus yang bercabang cabang, sedangkan organ lainnya berdegenerasi. Proglotid yang mengandung telur akan terlepas bersama tinja.\n" +
                        "\n" +
                        "Daur hidup cacing pita membutuhkan satu atau dua inang perantara. Contohnya Taenia solium yang hidup parasit pada manusia dan hewan karnivor, dengan inang perantara babi. Dibothriocephalus latus memiliki inang utama manusia dan hewan karnivor, sedangkan inang perantaranya ikan. Taenia saginata merupakan parasit di usus manusia dengan inang perantara sapi. Skoleksnya tidak memiliki alat kait sehingga mudah diberantas. Echinococcus granulosus parasit di usus anjing dan Choanotaenia infundibulum parasit di usus ayam.";
                break;
            case "Adenophorea":
                img_deskripsi.setImageResource(R.drawable.adenophorea);
                deskipsi = "Anggota kelas dari Adhenophorea tidak mempunyai phasmid (organ kemosreseptor) sehingga disebut dengan Aphasmida. Banyak dari anggota Adenophorea yang hidup bebas, tetapi menjadi parasit di berbagai hewan. Contohnya Trichuris ovis sebagai parasit di domba.\n" +
                        "\n" +
                        "Cacing Trichinella spiralis menjadi parasit di usus karnivor dan manusia. Cacing yang menyebabkan penyakit trikinosis. Setelah cacing dewasa kawin, cacing jantan mati, sedangkan cacing betina menghasilkan larva. Larva memasuki sel-sel mukosa dinding usus kemudian mengikuti peredaran darah hingga ke otot lurik. Dalam otot lurik, larva membentuk sista. Manusia mengalami infeksi cacing jika cacing dimakan yang kurang matang dan mengandung sista. Penyakit trikinosis ditandai dengan rasa mual yang hebat dan terkadang menimbulkan kematian ketika larva menembus otot jantung. ";
                break;
            case "Secernentea":
                img_deskripsi.setImageResource(R.drawable.secernentea);
                deskipsi = "Secernentea disebut dengan Phasmida, karena terdapat anggota spesiesnya mempunyai phasmid. Banyak anggota kelas hidup dalam tubuh vertebrata, serangga dan tumbuhan. Contoh Spesiesnya adalah  Ascaris Lumbricoides (Cacing Pita). Ascaris lumbricoides adalah parasit usus halus manusia yang menyebabkan penyakit askariasis. Infeksi cacing perut menyebabkan penderita mengalami kekurangan gizi. Tubuh pada bagian anterior cacing mempunya mulut yang dengan dikelilingi tiga bibir dan gigi-gigi kecil.";
                break;
            case "PolyChaeta":
                img_deskripsi.setImageResource(R.drawable.polychaeta);
                deskipsi = "PolyChaeta merupakan kata yang berasal dari Bahasa Yunani yang terdiri dari 2 kata yaitu Poli yang berarti banyak, dan Chaeta berarti rambut. Sehingga PolyChaeta adalah kelas dengan rambut paling banyak di filum Annelida. PolyChaeta memiliki bagian tubuh yang terdiri dari kepala, mata, dan sensor palpus. Sedangkan hidup PolyChaeta hidup di air. PolyChaeta mempunyai tubuh bersegmen dengan struktur mirip daging yang bentuknya mirip dayung, hal ini disebut Parapodia (tunggal =parapodium). Berfungsi sebagai alat gerak. Sebagian besar dari PolyChaeta, memiliki Parapodia berfungsi sebagai insang karena terdapat pembuluh darah halus. Di setiap parapodium terdapat rambut halus yang sifatnya kaku yang biasanya disebut seta, rambut dilapisi kutikula sehingga licin. Umumnya ukuran tubuh PolyChaeta adalah 5-10 cm. Contoh Jenis PolyChaeta adalah: Eunice viridis (Cacing Palolo), sebagai bahan makanan (mengandung protein tinggi); Lysidice oele (Cacing Wawo), sebagai bahan makanan (mengandung protein tinggi); Nereis domerlili, Nereis Virens, Neanthes Virens (cacing air laut); Arenicola sp,";
                break;
            case "OligoChaeta":
                img_deskripsi.setImageResource(R.drawable.oligochaeta);
                deskipsi = "OligoChaeta berasal dari bahasa Yunani dari kata Oligo yang berarti sedikit, dan Chaeta yang berarti rambut. Kelas OligoChaeta merupakan kelas filum Annelida yang mempunya sedikit rambut. Banyak anggota dari OligoChaeta yang hidup di dalam tanah atau tempat lembab, tetapi ada juga yang hidup di air. Karena mempunyai sedikit rambut seta dan tidak mempunyai parapodia, sehingga kepalanya kecil, tidak memiliki alat peraba, dan tidak memiliki bintik mata. Pada lapisan kulit terdapat bagian saraf dengan fungsi untuk menerima rangsangan.\n" +
                        "\n" +
                        "OligoChaeta bersifat hermaprodit/monoceus dengan perkembangbiakan secara generatif dengan perkawinan, dan secara vegetatif dengan regenerasi. Terdapat Kitellum (Selzadel) yang berfungsi sebagai alat reproduksi. Pada ruas 9-11 terdapat receptaculum seminis yang berfungsi sebagai penampung sel-sel spermatozoa.";
                break;
            case "Hirudenia":
                img_deskripsi.setImageResource(R.drawable.hirudenia);
                deskipsi = "Hirudenia merupakan kelas filum Annelida yang tidak memiliki seta (rambut) dan tidak memiliki parapodium di tubuhnya. Tubuh Hirudinea yang pipih dengan ujung depan serta di bagian belakang sedikit runcing. Di segmen awal dan akhir terdapat alat penghisap yang berfungsi dalam bergerak dan menempel. Gabungan dari alat penghisap dan kontraksi serta relaksasi otot adalah mekanisme pergerakan dari Hirudinea. Kebanyakan dari Hirudinea merupakan ekstoparasit yang sering didapati di permukaan luar inangnya. Ukuran Hirudinea beragam dari 1-30 cm.\n" +
                        "\n" +
                        "Hirudinea hidup pada inangnya untuk menghisap darah dengan cara menempel. Sebagian mereka membuat luka pada permukaan tubuh inang sehingga dapat menghisap darahnya, sedangkan sebagian lain mensekresikan suatu enzim yang dapat melubangi kulit, dan jika itu terjadi maka waktunya mensekresikan zat anti pembeku darah, kebanyakan tidak terasa saat kelas ini menempel pada inangnya karena ia menghasilkan suatu zat anastesi yang dapat menghilangkan rasa sakit. Jenis ini dikenal dengan sebutan lintah.";
                break;
            case "Polyplacophora":
                img_deskripsi.setImageResource(R.drawable.polychaeta);
                deskipsi = "Polyplacophora dikenal dengan nama chiton. Tubuh berukuran panjang 3 mm – 40 cm, berbentuk lonjong, pipih dorsoventral, berwarna gelap, memiliki 8 keping cangkang pipih yang tersusun seperti genting. Polyplacophora tidak memiliki mata dan tentakel, namun memiliki radula yang besar, kaki lebar, dan datar, serta 6 – 88 pasang insang. Alat ekskresi berupa sepasang nefridium yang besar.\n" +
                        "\n" +
                        "Alat indra berupa organ subradula aesthetes yang dapat dijulurkan untuk mendeteksi adanya makanan. Alat reproduksi bersifat gonokoris dan pembuahan terjadi di dalam tubuh atau di luar tubuh induk. Telur disimpan di dalam rongga mantel. Telur menetas menjadi larva trokofor yang berenang bebas, kemudian turun ke substrat dan mengalami metamorfosis menjadi anak chiton. Terdapat sekitar 800 spesies chiton yang teridentifikasi, antara lain Chiton sp., Chaetopleura, dan Lepidopleurus.";
                break;
            case "Scapopoda":
                img_deskripsi.setImageResource(R.drawable.scaphopoda);
                deskipsi = "Scaphopoda disebut juga siput taring karena memiliki bentuk cangkang yang mirip gading gajah atau taring, berwarna putih atau kekuningan. Cangkang terbuka pada kedua ujungnya. Siput taring hidup membenamkan diri pada pasir atau lumpur di laut. Ukuran tubuh biasanya 3 – 6 cm. Ada pula Scaphopoda yang berukuran sekitar 4 mm, misalnya Cadulus mayori.\n" +
                        "\n" +
                        "Pada kepala terdapat mulut dan kaptakula yang berbentuk filamen untuk menangkap makanan. Scaphopoda memiliki rahang dan radula pada rongga mulutnya, namun tidak memiliki mata maupun tentakel. Sistem saraf ganglion tidak berpusat. Scaphopoda tidak memiliki insang, oleh karena itu pertukaran udara terjadi pada permukaan mantel, Sistem peredaran darah berupa sistem sinus darah karena Scaphopoda tidak memiliki jantung. Alat ekskresi, berupa sepasang nefridium.\n" +
                        "\n" +
                        "Reproduksi Scaphopoda terjadi secara generatif dan gonokoris. Pembuahan terjadi secara eksternal, menghasilkan larva trokofor yang berenang bebas, yang kemudian menjadi larva veliger dan bermetamorfosis hingga menjadi anak Scaphopoda. Terdapat sekitar 350 spesies Scaphopoda, antara lain Dentalium dan Cadulus mayori.";
                break;
            case "Gastropoda":
                img_deskripsi.setImageResource(R.drawable.gastropoda);
                deskipsi = "Gastropoda (Latin, gaster = perut, podos = kaki) adalah Mollusca yang berjalan dengan menggunakan perutnya, dan dikenal sebagai siput atau keong. Gastropoda hidup bebas di berbagai habitat (darat, perairan tawar dan laut) sebagai karnivor atau herbivor. Gastropoda herbivor memakan ganggang, rumput laut, tumbuhan air yang lunak atau yang membusuk. Gastropoda karnivor memakan cacing, ikan, atau kerang. Ada pula Gastropoda yang hidup endoparasit, misalnya Entoconcha yang hidup di dalam tubuh timun laut dan Stilifer yang hidup pada dinding tubuh bintang laut. Gastropoda yang hidup sebagai ektoparasit, misalnya Brachystoma yang mengisap darah kerang atau cacing Polychaeta. Pada umumnya Gastropoda memiliki cangkang berbentuk kerucut atau tabung yang melingkar seperti konde (gelung). Cangkang terdiri atas empat lapisan, yaitu periostrakum (lapisan terluar, berpigmen, mengandung zat tanduk conchiolin), prismatik (lapisan kalsium karbonat terluar, mengandung kalsit), lamela (lapisan kalsium karbonat tengah, mengandung aragonit), dan nakre (lapisan kalsium karbonat terdalam, berupa lembaran aragonit). ";
                break;
            case "Pelecypoda":
                img_deskripsi.setImageResource(R.drawable.pelecypoda);
                deskipsi = "Pelecypoda dikenal sebagai kerang, remis, tiram, kijing, atau scallop. Pelecypoda disebut juga Lamellibranchiata (Latin, lamella = lembaran, branchia = insang). Pelecypoda hidup bebas, komensalisme, atau parasit di laut pada daerah pasang surut dan di perairan air tawar.\n" +
                        "\n" +
                        "Pelecypoda tidak memiliki kepala. Tubuh Pelecypoda berbentuk pipih secara lateral dan ditutupi oleh sepasang cangkang. Puncak cangkang disebut umbo. Garis-garis melingkar di sekitar umbo menunjukan garis pertumbuhan cangkang. Tubuh Pelecypoda ada yang berukuran kecil 2 mm, ada pula yang berukuran besar hingga lebih dari 1 m, misalnya Tridacna (kerang raksasa).";
                break;
            case "Cephalopoda":
                img_deskripsi.setImageResource(R.drawable.cephalopoda);
                deskipsi = "Cephalopoda (Yunani, kephale = kepala, podos = kaki) adalah Mollusca yang kakinya berada di kepala, dan dikenal sebagai cumi-cumi dan gurita. Semua Cephalopoda hidup di laut. Ukuran tubuh bervariasi, dan beberapa sentimeter hingga cumi-cumi raksasa berukuran panjang 20 m dan diameter 4 m. Cephalopoda tidak memiliki cangkang luar, kecuali Nautilus. Cangkang dalam tersusun dari zat tanduk, bersifat ringan dan transparan, yang disebut pen.";
                break;
            case "Archoidea":
                img_deskripsi.setImageResource(R.drawable.echinodermata);
                deskipsi = "Kelas archoidea adalah hewan yang dengan bentuk bintang yang biasa disebut bintang laut. Astroida sering ditemukan di laut pantai. Astroidea merupakan spesies terbanyak dari kelas filum echinodermata yaitu terdapat 1.600 spesies. Archoidea mempunyai bagian tubuh oral (bagian tubuh dengan mulut) dan bagian aboral (bagian tubuh dengan anus). Kelas yang mempunyai sistem ambularaklakral terdiri atas pembuluh darah air (jaringan hidrolik) yang membentuk kaki/lengan, Bagian kaki/lengan memiliki fungsi sebagai alat gerak, untuk menempel, dan untuk menemukan makanan. Pada ujung kaki terdapat bintik mata yang mampu membedakan terang dan gelap. Bintang laut memiliki duri yang tumpul dan pendek. Disekelilingi duri terdapat duri kecil yang dinamakan pedicelaria yang berfungsi untuk menangkap makanan dan melindungi tubuh dari kotoran. Pada bagian dekat anus terdapat lubang air disebut dengan medreporit. Archoidea mempunyai saluran cincin yang berada di pusat tubuh, serta saluran radial yang merupakan cabang saluran cincin di bagian lengan. ";
                break;
            case "Echinoidea":
                img_deskripsi.setImageResource(R.drawable.echinodermata);
                deskipsi = "Echinoidea merupakan kelas echinodermata yang tubuhnya dipenuh mirip duri. Bulu Babi atau landak laut merupakan salah satu jenis dari kelas Echinoidea. Bentuk tubuh dari echinoidea adalah agak bulat dan tidak mempunyai lengan, tetapi terdapat duri yang jumlahnya banyak. Terdapat dri ang pendek dan panjang. Duri echinoidea memiliki bentuk zat kapur. Tubuh echinoidea mempunyai otot dengan fungi untuk memutar duri tersebut sehingga dapat bergerak. Mulut hewan ini mempunyai struktur yang mirip rahang membantu dalam memakan mangsa. ";
                break;
            case "Crinoidea":
                img_deskripsi.setImageResource(R.drawable.echinodermata);
                deskipsi = "Crinoidea mempunyai bentuk tubuh yang mirip dengan bunga atau tumbuhan. Crinoidea adalah anggota fillum echinodermata yang spesies paling sedikit yaitu terdapat 550 spesies. dan kelompok paling primitif dari filum echinodermata. Hewan yang hidup di pantai sampai kedalaman laut 3.500 meter dibawah permukaan laut. Tubuh yang tidak mempunyai duri, dan jika mempunyai tangkai disebut dengan lillia laut (jika bertangkai akan menempel pada dasar laut dengan sirri, yaitu bagian ujung tangkai memiliki zat tanduk), sedangkan yang tidak mempunyai tangkai disebut dengan bintang laut berbulu. Di bagian dasar tubuh (kaliks) jenis yang terdapat sisi oral (mulut) dan sisi anus sedangkan di bagian lengannya berjumlah banyak yang mengelilingi di bagian kaliks tersebut. Umumnya jumlah lengan Crinoidea adalah kelipatan lima dan mempunyai cabang yang disebut dengan pinula. Di sisi oral terdapat celah yang bersilia disebut dengan celah ambulakral. Celah tersebut berfungsi dalam menangkap makanan berupa cairan, zooplankton, atau partikel lainnya yang tersebar di laut. ";
                break;
            case "Ophiuroidea":
                img_deskripsi.setImageResource(R.drawable.echinodermata);
                deskipsi = "Kelas Ophiuroidea merupakan kelas berbentuk menyerupai bintang laut, tetapi memiliki lengan yang lebih panjang dan lebih kurus dan cakram pusat tubuh yang lebih jelas. Jika kaki digerakkan maka pergerakannya mirip dengan ular, sehingga Kelas Ophiuroidea disebut dengan Bintang Mengular. Kaki tabungnya ini tidak mempunyai penyedot dan bergerak dengan mencambukkan kakinya, sehingga kaki ini lebih mudah patah. Pada kaki atau lengan berfungsi menangkap mangsanya, kemudian memasukkan ke dalam laut. Sebagian jenis dari pemakan cacing, moluska, suspensi atau bangkai. Hewan ini tidak mempunyai anus dan umumnya hidup di sela bebatuan. ";
                break;
            case "Holothuroidea":
                img_deskripsi.setImageResource(R.drawable.echinodermata);
                deskipsi = "Holothuroidea merupakan hewan yang bentuk tubuh bulat memanjang dari permukaan oral ke permukaan aboral. Tubuhnya terlihat seperti bentuk buah timun sehingga sering disebut dengan timun laut. Tetapi konsistensi tubuhnya sedikit berbeda dengan kelas lain dan memiliki tubuh halus dan lunak serta tergolong memiliki bagian bagian tubuh yang berkelipatan lima dengan sistem ambulakral. Mentimun laut mempunyai tentakel di bagian oral yang berjumlah 10-30 buah. Tubuhnya terdapat kaki ambulakral denan fungsi bergerak dan bernapas. Pergerakan dilakukan dengan kontraksi otot ditubuhnya. Jenis hewan ini adalah hermafrodit (2 alat kelamin dalam satu tubuh), namun ada juga yang genokhoris (1 kelamin 1 individu). Pembuahan (fertilisasi) di air laut kemudian berkembang menjadi larva aurekularia. Makannya adalah plankton atau zat organik dalam laut. Ia melindungi diri dari mangsanya dengan memuntahkan organ dalam tubuhnya, sehingga mangsanya akan memakan organ itu, selanjutnya mentimun laut membentuk kembali organ yang dimuntahkan tadi. ";
                break;
            case "Crustacea":
                img_deskripsi.setImageResource(R.drawable.crustacea);
                deskipsi = "Ciri-ciri:\n" +
                        "a. Memiliki dua pasang antena.\n" +
                        "b. Kepala menyatu dengan dada (sefalotoraks)\n" +
                        "c. Tubuh terdiri dari Cephalothorax dan abdomen.\n" +
                        "d. Memiliki eksoskeleton dari zat tanduk/kitin.\n" +
                        "e. Dapat mengalamai pelepasan kulit dari tubuhnya\n" +
                        "f. Tidak memiliki pembuluh darah kapiler.\n" +
                        "g Sebagian respirasinya menggunakan insang.\n" +
                        "h. Pertukaran udara terjadi secara difusi.\n" +
                        "Contoh: Penaeus (udang windu), Cambarus virilis (udang air tawar), Portunus s-exdentalus (kepiting), dan Neptunus pelagicus (rajungan).";
                break;
            case "Myriapoda":
                img_deskripsi.setImageResource(R.drawable.myriapoda);
                deskipsi = "Ciri-ciri:\n" +
                        "a. Tubuh terdiri atas kepala, toraks, dan abdomen.\n" +
                        "b. Pada kepala terdapat sepasang mata, sepasang alat peraba besar, dan peraba kecil yang beruas-ruas.\n" +
                        "c. Tiap ruas pada tubuhnya terdapat sepasang atau dua pasang kaki.\n" +
                        "d. Sistem respirasinya menggunakan trakea.\n" +
                        "e. Tubuh berbentuk silindris, memanjang, terdiri dari cephalon (ruas-ruas kepala).\n"+
                        "Diklasifikasikan lagi menjadi dua, yaitu Chilopoda (Scolopendra subspinipes (lipan)) dan Diplopoda (Julus teristris (luwing)), Myriapoda memiliki peran dalam penguraian sampah organik.";
                break;
            case "Arachnoidea":
                img_deskripsi.setImageResource(R.drawable.arachnoidea);
                deskipsi = "Ciri-ciri:\n" +
                        "a. Tubuh terdiri dari Andomen dan sefalotoraks.\n" +
                        "b. Memiliki enam pasan anggota gerak.\n" +
                        "c. Hidup di darat maupun di dalam air.\n" +
                        "d. Jumlah matanya bervariasi\n" +
                        "e. Bernafas dengan paru-paru buku atau trakea atau dengan keduanya.\n"+
                        " Arachnoidea diklasifikasikan menjadi 3, yaitu Scorpionida (Kalajengking), Arachnida (laba-laba), dan Acaringa (caplak, tungau). ";
                break;
            case "Insecta":
                img_deskripsi.setImageResource(R.drawable.insecta);
                deskipsi = "Ciri-ciri:\n" +
                        "1. Tubuh tersusun atas kepala, dada, dan perut.\n" +
                        "2. Mulut bertipe penggigit, penghisap dan penelan.\n" +
                        "3. Memiliki 3 pasang kaki.\n" +
                        "4. Sebagian besar hidup di darat.";
                break;
            case "Hemichordata":
                img_deskripsi.setImageResource(R.drawable.hemichordata);
                deskipsi = "Hemichordata, merupakan chordata yang memiliki bentuk tubuh menyerupai cacing dan memiliki fertilisasi secara eksternal.";
                break;
            case "Urochordata":
                img_deskripsi.setImageResource(R.drawable.urochordata);
                deskipsi = "Urochordata, merupakan hewan yang biasanya menjadi parasit di laut yang luas dan lepas.";
                break;
            case "Cephalochordata":
                img_deskripsi.setImageResource(R.drawable.cephalopoda);
                deskipsi = "Cephalochordata, merupakan hewan yang memiliki bentuk mirip ikan namun ukuran tubuhnya lebih kecil.";
                break;
            case "Vertebrata":
                img_deskripsi.setImageResource(R.drawable.vertebrata);
                deskipsi = "Vertebrata, merupakan hewan yang hidup di air tawar dan juga di darat dan memiliki ciri ruas pada tulang belakang.";
                break;
        }

        txt_deskripsi.setText(deskipsi);
    }
}
