
package com.test.naimish.railapp.Utils;

import android.content.Context;

/**
 * Created by Vivek on 6/14/2018.
 */

public class StationListAndCode {

    public StationListAndCode(Context c){}
    public String[] getStationCode() {
        return null;
    }

    public String[] getStationName() {
        return null;
    }

    private static String getStationListJson() {
        return "";
    }
}
//        return "{" +
//                "\"ABU ROAD\": \"ABR\"," +
//
//
//                "\"ACHHNERA\":\"AH\"," +
//
//                "\"ADONI\":\"AD\"," +
//
//                "\"ADRA\":\"ADRA\"," +
//
//                "\"AGRA FORT\":\"AF\"," +
//
//                "\"AGRA CANTT\":\"AGC\"," +
//
//                "\"AHMADNAGAR\":\"ANG\"," +
//
//                "\"AHMEDABAD\":\"ADI\"," +
//
//                "\"AJMER\":\"AII\"," +
//
//                "\"AKOLA\":\"AK\"," +
//
//                "\"ALIGARH\":\"ALJN\"," +
//
//
//                "\"ALIPURDUAR Jn\":\"APDJ\"," +
//
//                "\"ALLAHABAD\":\"ALD\"," +
//
//                "\"ALAPPUZHA\":\"ALLP\"," +
//
//
//                "\"ALNAWAR Jn\":\"LWR\"," +
//
//                "\"ALWAR\":\"AWR\"," +
//
//                "\"ALUVA\":\"AWY\"," +
//
//                "\"AMALNER\":\"AN\"," +
//
//                "\"AMBALA CANTT\":\"UMB\"," +
//
//                "\"AMLA\":\"AMLA\"," +
//
//                "\"AMRITSAR\":\"ASR\"," +
//
//
//                "\"ANAKAPALLE\":\"AKP\"," +
//
//                "\"ANAND\":\"ANND\"," +
//
//                "\"ANAND NAGAR\":\"ANDN\"," +
//
//                "\"ANANTAPUR\":\"ATP\"," +
//
//                "\"ANGUL\":\"ANGL\"," +
//
//                "\"ANNAVARAM\":\"ANV\"," +
//
//                "\"ANUPPUR\":\"APR\"," +
//
//                "\"ARA\":\"ARA\"," +
//
//                "\"ARAKKONAM\":\"AJJ\"," +
//
//                "\"ARSIKERE\":\"ASK\"," +
//
//                "\"ASANSOL\":\"ASN\"," +
//
//                "\"AUNRIHAR\":\"ARJ\"," +
//
//                "\"AURANGABAD\":\"AWB\"," +
//
//                "\"AYODHYA\":\"AY\"," +
//
//                "\"AZAMGARH\":\"AMH\"," +
//
//                "\"AZIMGANJ Jn\":\"AZ\"," +
//
//                "\"BADARPUR\":\"BPB\"," +
//
//                "\"BADNERA Jn.\":\"BD\"," +
//
//                "\"BAGAHA\":\"BUG\"," +
//
//                "\"BAGALKOT\":\"BGK\"," +
//
//                "\"BAGHPAT ROAD\":\"BPM\"," +
//
//                "\"BAIDYANATHDHAM\":\"BDME\"," +
//
//                "\"BAKTHIYARPUR\":\"BKP\"," +
//
//                "\"BALAGHAT Jn.\":\"BTC\"," +
//
//                "\"BALASORE\":\"BLS\"," +
//
//                "\"BALHARSHAH\":\"BPQ\"," +
//
//                "\"BALLIA\":\"BUI\"," +
//
//                "\"BANARHAT\":\"BNQ\"," +
//
//                "\"BANDA Jn.\":\"BNDA\"," +
//
//                "\"BANDEL Jn.\":\"BDC\"," +
//
//                "\"BANDIKUI Jn.\":\"BKI\"," +
//
//                "\"BANDRA TERMINUS\":\"BDTS\"," +
//
//                "\"BANGALORE CITY\":\"SBC\"," +
//
//                "\"BANGALORE CANTT.\":\"BNC\"," +
//
//                "\"BANGARAPET\":\"BWT\"," +
//
//                "\"BANKURA\":\"BQK\"," +
//
//                "\"BANMANKHI\":\"BNKI\"," +
//
//                "\"BAPATLA\":\"BPP\"," +
//
//                "\"BARABANKI Jn.\":\"BBK\"," +
//
//                "\"BARAUNI Jn.\":\"BJU\"," +
//
//                "\"BARAUT\":\"BTU\"," +
//
//                "\"BARABIL\" :\"BBL\"," +
//                "\"BARDDHAMAN Jn.\" :\"BWN\"," +
//
//                "\"BAREILLY\" :\"BE\"," +
//
//                "\"BARGARH ROAD\" :\"BRGA\"," +
//
//                "\"BARHNI\":\"BNY\"," +
//
//                "\"BARKAKANA\" :\"BRKA\"," +
//
//                "\"BARMER\":\"BME\"," +
//
//                "\"BAROG\":\"BOF\"," +
//
//                "\"BARSOI\":\"BOE\"," +
//
//                "\"BARWADIH\":\"BRWD\"," +
//
//                "\"BASTI\":\"BST\"," +
//
//                "\"BATHINDA Jn.\":\"BTI\"," +
//
//                "\"BAYANA\":\"BXN\"," +
//
//                "\"BEAS\":\"BEAS\"," +
//
//                "\"BELAPUR\":\"BAP\"," +
//
//                "\"BELGAUM\":\"BGM\"," +
//
//                "\"BELLARY Jn.\":\"BAY\"," +
//
//                "\"BETTIAH\":\"BTH\"," +
//                "\"BETUL\":\"BZU\"," +
//                "\"BHADOHI\":\"BOY\"," +
//                "\"BHADRAKH\":\"BHC\"," +
//
//                "\"BHAGALPUR\":\"BGP\"," +
//
//                "\"BHARATPUR\":\"BTE\"," +
//
//                "\"BHARUCH\":\"BH\"," +
//
//                "\"BHATAPARA\":\"BYT\"," +
//
//                "\"BHATKAL\":\"BTJL\"," +
//
//                "\"BHATNI\":\"BTT\"," +
//
//                "\"BHAVNAGAR (T)\":\"BVC\"," +
//
//                "\"BHILWARA\":\"BHL\"," +
//
//                "\"BHIMAVARAM Jn.\":\"BVRM\"," +
//
//                "\"BHIMAVARAM TOWN\":\"BVRT\"," +
//
//                "\"BHIND\":\"BIX\", " +
//
//                "\"BHIWANI\":\"BNW\", " +
//
//                "\"BHOJIPURA\":\"BPR\", " +
//
//                "\"BHOPAL\":\"BPL\", " +
//
//                "\"BHUBANESWAR\":\"BBS\", " +
//
//                "\"BHUJ\":\"BHUJ\", " +
//
//                "\"BHUSAVAL\":\"BSL\", " +
//
//                "\"BIJAPUR\":\"BJP\", " +
//
//                "\"BIJNOR\":\"BJO\", " +
//
//                "\"BIKANER\":\"BKN\", " +
//
//                "\"BILASPUR Jn.\":\"BSP\", " +
//
//                "\"BINA\":\"BINA\", " +
//
//                "\"BINNAGURI\":\"BNV\", " +
//
//                "\"BIRUR\":\"RRB\", " +
//
//                "\"BITRAGUNTA\":\"BTTR\", " +
//
//                "\"BOBBILI\":\"VBL\", " +
//
//                "\"BOKARO STEEL CITY\":\"BKSC\", " +
//                "\"BOLPURSHANTINIKETAN\":\"BHP\", " +
//
//                "\"BORIVALI\":\"BVI\", " +
//
//                "\"BOTAD\":\"BTD\", " +
//                "\"BRAHMAPURI\":\"BMP\", " +
//
//                "\"BUDAUN\":\"BEM\", " +
//
//                "\"BURHANPUR\":\"BAU\", " +
//
//                "\"BURHWAL\":\"BUW\", " +
//
//                "\"BUXAR\":\"BXR\", " +
//
//                "\"CANACONA\":\"CNO\", " +
//
//                "\"CHAKIA\":\"CAA\", " +
//
//                "\"CHAKKI BANK\":\"CHKB\", " +
//
//                "\"CHAKRADHARPUR\":\"CKP\", " +
//
//                "\"CHALISGAON\":\"CSN\", " +
//
//                "\"CHALSA\":\"CLD\", " +
//
//                "\"CHAMPA\":\"CPH\", " +
//
//                "\"CHANDAUSI\":\"CH\", " +
//
//                "\"CHANDIGARH\":\"CDG\", " +
//
//                "\"CHANDIL\":\"CNI\", " +
//
//                "\"CHANDRAPUR\":\"CD\", " +
//
//                "\"CHANDRAPURA\":\"CRP\", " +
//
//                "\"CHAPARMUKH\":\"CPK\", " +
//
//                "\"CHATRAPATI SAHU\":\"CSMT\", " +
//
//                "\"MAHARAJ\":\"(T)\", " +
//
//                "\"CHENGALPATTU Jn.\":\"CGL\", " +
//
//                "\"CHENGANNUR\":\"CNGR\", " +
//
//                "\"CHENNAI CENTRAL\":\"MAS\", " +
//
//                "\"CHENNAI EGMORE\":\"MS\", " +
//
//                "\"CHHAPRA\":\"CPR\", " +
//
//                "\"CHIDAMBARAM\":\"CDM\", " +
//
//                "\"CHIKJAJUR\":\"JRU\", " +
//
//                "\"CHIPLUN\":\"CHI\", " +
//
//                "\"CHIRALA\":\"CLX\", " +
//
//                "\"CHITRAKOOTDHAM KARVI\":\"CKTD\", " +
//
//                "\"CHITTARANJAN\":\"CRJ\", " +
//
//                "\"CHITTAURGARH\":\"COR\", " +
//
//                "\"CHITTOOR\":\"CTO\", " +
//
//                "\"CHOPAN\":\"CPU\", " +
//
//                "\"CHUNAR\":\"CAR\", " +
//
//                "\"CHURU\":\"CUR\", " +
//
//                "\"COIMBATORE Jn.\":\"CBE\", " +
//
//                "\"COONOOR\":\"ONR\", " +
//
//                "\"CUDDALORE PORT\":\"CUPJ\", " +
//
//                "\"CUDDAPAH\":\"HX\", " +
//
//                "\"CUTTACK\":\"CTC\", " +
//
//                "\"DADAR\":\"DR\", " +
//
//                "\"DAHANU ROAD\":\"DRD\", " +
//
//                "\"DAHOD\":\"DHD\", " +
//                "\"DALGAON\":\"DLO\", " +
//
//                "\"DALTONGANJ\":\"DTO\", " +
//
//                "\"DAMOH\":\"DMO\", " +
//
//                "\"DANAPUR\":\"DNR\", " +
//
//                "\"DARBHANGA\":\"DBG\", " +
//
//                "\"DAUND\":\"DD\", " +
//
//                "\"DAVANGERE\":\"DVG\", " +
//
//                "\"DEHRADUN\":\"DDN\", " +
//
//                "\"DEHRI-ON-SONE\":\"DOS\", " +
//
//                "\"DELHI\":\"DLI\", " +
//
//                "\"NEW DELHI\":\"NDLS\", " +
//
//                "\"DELHI CANTT.\":\"DEC\", " +
//
//                "\"DELHI SARAI ROHILLA\":\"DEE\", " +
//
//                "\"DELHI SHAHDARA\":\"DSA\", " +
//
//                "\"DEORIASADAR\":\"DEOS\", " +
//
//                "\"DEVLALI\":\"DVL\", " +
//
//                "\"DHAMANGAON\":\"DMN\", " +
//
//                "\"DHANBAD\":\"DHN\", " +
//
//                "\"DHARMABAD\":\"DAB\", " +
//
//                "\"DHARMAPURI\":\"DPJ\", " +
//
//                "\"DHARMAVARAM\":\"DMM\", " +
//
//                "\"DHARWAD\":\"DWR\", " +
//
//                "\"DHASA\":\"DAS\", " +
//
//                "\"DHAULPUR\":\"DHO\", " +
//
//                "\"DHOLA\":\"DLJ\", " +
//
//                "\"DHONE\":\"DNC\", " +
//
//                "\"DHRANGADHRA\":\"DHG\", " +
//
//                "\"DHURI\":\"DUI\", " +
//
//                "\"DIBRUGARH TOWN\":\"DBRT\", " +
//
//                "\"DILDARNAGAR\":\"DLN\", " +
//
//                "\"DIMAPUR\":\"DMV\", " +
//                "\"DINDIGUL Jn.\":\"DG\", " +
//                "\"DONGARGARH\":\"DGG\", " +
//                "\"DORNAKAL\":\"DKJ\", " +
//                "\"DUNGARPUR\":\"DNRP\", " +
//                "\"DURG\":\"DURG\", " +
//                "\"DURGAPUR\":\"DGR\", " +
//                "\"DWARKA\":\"DWK\", " +
//
//                "\"ELURU\":\"EE\", " +
//                "\"ERNAKULAM Jn.\":\"ERS\", " +
//                "\"ERNAKULAM TOWN\":\"ERN\", " +
//                "\"ERODE\":\"ED\", " +
//                "\"ETAWAH\":\"ETW\", " +
//                "\"FAIZABAD\":\"FD\", " +
//                "\"FARIDABAD\":\"FDB\", " +
//                "\"FARRUKHABAD\":\"FKD\", " +
//                "\"FATHEABAD CHAND\":\"FTD\", " +
//                "\"FATEHPUR\":\"FTP\", " +
//                "\"FATUHA\":\"FUT\", " +
//                "\"FAZILKA\":\"FKA\", " +
//                "\"FIROZABAD\":\"FZD\", " +
//                "\"FIROZPUR CITY\":\"FZP\", " +
//                "\"FIROZPUR CANTT.\":\"FZR\", " +
//                "\"FORBESGANJ\":\"FBG\", " +
//                "\"FURKATING\":\"FKG\", " +
//                "\"GADAG\":\"GDG\", " +
//                "\"GAJRAULA\":\"GJL\", " +
//                "\"GANDHIDHAM\":\"GIM\", " +
//                "\"GANDHINAGAR\":\"GADJ\", " +
//                "\"GANGAPUR CITY\":\"GGC\", " +
//                "\"GARWA ROAD\":\"GHD\", " +
//
//                "\"GAYA\":\"GAYA\", " +
//
//                "\"GHATSILA\":\"GTS\", " +
//
//                "\"GHAZIABAD\":\"GZB\", " +
//
//                "\"GOALPARA TOWN\":\"GLPT\", " +
//                "\"GODHRA\":\"GDA\", " +
//                "\"GOLA GOKARANNATH\":\"GK\", " +
//                "\"GOMOH\":\"GMO\", " +
//                "\"GONDA\":\"GD\", " +
//                "\"GONDIA\":\"G\", " +
//                "\"GOOTY\":\"GY\", " +
//                "\"GORAKHPUR\":\"GKP\", " +
//                "\"GOSSAINGAON HAT\":\"GOGH\", " +
//                "\"GUDIVADA\":\"GDV\", " +
//                "\"GUDUR\":\"GDR\", " +
//                "\"GULBARGA\":\"GR\", " +
//                "\"GUNA\":\"GUNA\", " +
//                "\"GUNTAKAL\":\"GTL\", " +
//                "\"GUNTUR\":\"GNT\", " +
//                "\"GURUVAYUR\":\"GUV\", " +
//                "\"GUWAHATI\":\"GHY\", " +
//                "\"GWALIOR\":\"GWL\", " +
//                "\"GYANPUR ROAD\":\"GYN\", " +
//                "\"HABIBGANJ\":\"HBJ\", " +
//                "\"HAJIPUR\":\"HJP\", " +
//
//                "\"HALDIA\":\"HLZ\", " +
//                "\"HALDIBARI\":\"HDB\", " +
//                "\"HAMILTONGANJ\":\"HOJ\", " +
//                "\"HANUMANGARH\":\"HMH\", " +
//                "\"HAPA\":\"HAPA\", " +
//                "\"HAPUR\":\"HPU\", " +
//                "\"HARDA\":\"HD\", " +
//                "\"HARIDWAR\":\"HW\", " +
//                "\"HARIHAR\":\"HRR\", " +
//                "\"HARPALPUR\":\"HPP\", " +
//                "\"HASIMARA\":\"HSA\", " +
//                "\"HATIA\":\"HTE\", " +
//
//                "\"HAZRAT NIZAMUDDIN\":\"NZM\", " +
//                "\"HILSA\"\"HIL\", " +
//                "\"HIMMAT NAGAR\":\"HMT\", " +
//                "\"HINDUPUR\":\"HUP\", " +
//                "\"HINGOLI\":\"HNL\", " +
//                "\"HISAR\":\"HSR\", " +
//                "\"HOSHANGABAD\":\"HBD\", " +
//                "\"HOSPET\":\"HPT\", " +
//
//                "\"HOSUR\":\"HSRA\", " +
//                "\"HOWBADH\":\"HBG\", " +
//                "\"HOWRAH\":\"HWH\", " +
//                "\"HUBLI\":\"UBL\", " +
//                "\"HYDERABAD\":\"HYB\", " +
//                "\"IGATPURI\":\"IGP\", " +
//                "\"INDARA\":\"IAA\", " +
//                "\"INDORE\":\"INDB\", " +
//                "\"ISLAMPUR\":\"IPR\", " +
//                "\"ITARSI\":\"ET\", " +
//                "\"JABALPUR\":\"JBP\", " +
//                "\"JAIPUR\":\"JP\", " +
//
//                "\"JAISALMER\":\"JSM\", " +
//
//                "\"JAJPUR KEONJHAR ROAD\":\"JJKR\", " +
//
//                "\"JAKHAL\":\"JHL\", " +
//
//                "\"JALAMB\":\"JM\", " +
//
//                "\"JALANDHAR CANTT.\":\"JRC\", " +
//
//                "\"JALANDHAR CITY\":\"JUC\", " +
//
//                "\"JALGAON\":\"JL\", " +
//
//                "\"JALNA\":\"J\", " +
//
//                "\"JALPAIGURI\":\"JPG\", " +
//
//                "\"JAMALPUR\":\"JMP\", " +
//
//                "\"JAMMU TAWI\":\"JAT\", " +
//
//                "\"JAMNAGAR\":\"JAM\", " +
//
//                "\"JANGHAI\":\"JNH\", " +
//
//                "\"JASIDIH\":\"JSME\", " +
//
//                "\"JAUNPUR Jn.\":\"JNU\", " +
//
//                "\"JAYNAGAR\":\"JYG\", " +
//                "\"JETALSAR\":\"JLR\", " +
//
//                "\"JHAJHA\":\"JAJ\", " +
//
//                "\"JHANSI\":\"JHS\", " +
//
//                "\"JHARGRAM\":\"JGM\", " +
//
//                "\"JHARSUGUDA\":\"JSG\", " +
//
//                "\"JIND\":\"JIND\", " +
//
//                "\"JODHPUR\":\"JU\", " +
//
//                "\"JOGBANI\":\"JBN\", " +
//
//                "\"JOLARPETTAI\":\"JTJ\", " +
//
//                "\"JORHAT\":\"JT\", " +
//
//                "\"JUNAGARH Jn.\":\"JND\", " +
//
//                "\"KACHEGUDA\":\"KCG\", " +
//
//                "\"KAKINADA PORT\":\"COA\", " +
//
//                "\"KALCHINI\":\"KCF\", " +
//
//                "\"KALKA\":\"KLK\", " +
//
//                "\"KALOL\":\"KLL\", " +
//
//                "\"KALYAN\":\"KYN\", " +
//
//                "\"KAMAKHYA\":\"KYQ\", " +
//
//                "\"KANCHIPURAM\":\"CJ\", " +
//
//                "\"KANDHLA\":\"KQL\", " +
//
//                "\"KANKANADI\":\"KNKD\", " +
//
//                "\"KANNIYAKUMARI\":\"CAPE\", " +
//
//                "\"KANNUR\":\"CAN\", " +
//
//                "\"KANPUR CENTRAL\":\"CNB\", " +
//
//                "\"KANPUR ANWARGANJ\":\"CPA\", " +
//
//                "\"KAPTANGANJ\":\"CPJ\", " +
//
//                "\"KARAIKKUDI JN.\":\"KKDI\", " +
//
//                "\"KARNAL\":\"KUN\", " +
//
//                "\"KARUR\":\"KRR\", " +
//
//                "\"KARWAR\":\"KAWR\", " +
//
//                "\"KASARGOD\":\"KGQ\", " +
//
//                "\"KASGANJ\":\"KSJ\", " +
//
//                "\"KATHGODAM\":\"KGM\", " +
//                "\"KATIHAR\":\"KIR\", " +
//                "\"KATNI\":\"KTE\", " +
//                "\"KATPADI\":\"KPD\", " +
//                "\"KATWA\":\"KWAE\", " +
//                "\"KAZIPET\":\"KZJ\", " +
//                "\"KHAGARIA\":\"KGG\", " +
//                "\"KHALILABAD\":\"KLD\", " +
//                "\"KHAMMAM\":\"KMT\", " +
//                "\"KHANDWA\":\"KNW\", " +
//                "\"KHARAGPUR\":\"KGP\", " +
//                "\"KHEKRA\":\"KEX\", " +
//                "\"KHURDA ROAD\":\"KUR\", " +
//                "\"KISHANGANJ\":\"KNE\", " +
//                "\"KISHANGARH\":\"KSG\", " +
//                "\"KIUL\":\"KIUL\", " +
//                "\"KOCHUVELI\":\"KCVL\", " +
//                "\"KODAIKANAL ROAD\":\"KQN\", " +
//                "\"KOPERGAON\":\"KPG\", " +
//                "\"KORAPUT\":\"KRPU\", " +
//                "\"KORBA\":\"KRBA\", " +
//                "\"KOTA\":\"KOTA\", " +
//                "\"KOTDWARA\":\"KTW\", " +
//                "\"KOT KAPURA\":\"KKP\", " +
//                "\"KOTTAYAM\":\"KTYM\", " +
//                "\"KOZHIKKODE\":\"CLT\", " +
//                "\"KRISHNANAGAR CITY\":\"KNJ\", " +
//                "\"KRISHNARAJAPURAM\":\"KJM\", " +
//                "\"KUMBAKONAM\":\"KMU\", " +
//                "\"KUNDAPURA\":\"KUDA\", " +
//                "\"KURDUWADI\":\"KWV\", " +
//                "\"KURNOOL TOWN\":\"KRNT\", " +
//                "\"KURUKSHETRA\":\"KKDE\", " +
//                "\"LAKHIMPUR\":\"LMP\", " +
//                "\"LAKSAR\":\"LRJ\", " +
//                "\"LALGARH\":\"LGH\", " +
//                "\"LALGOLA\":\"LGL\", " +
//                "\"LALITPUR\":\"LAR\", " +
//                "\"LALKUAN JN.\":\"LKU\", " +
//                "\"LATUR\":\"LUR\", " +
//                "\"LEDO\":\"LEDO\", " +
//                "\"LOHARU\":\"LHU\", " +
//                "\"LOKMANYA TILAK (T)\":\"LTT\", " +
//                "\"LONAVLA\":\"LNL\", " +
//                "\"LONDA\":\"LD\", " +
//                "\"LOWER HALFLONG\":\"LFG\", " +
//                "\"LUCKNOW\":\"LJN/LKO\", " +
//                "\"LUDHIANA\":\"LDH\", " +
//                "\"LUMDING\":\"LMG\", " +
//                "\"LUNI\":\"LUNI\", " +
//                "\"MACHILIPATNAM\":\"MTM\", " +
//                "\"MADARIHAT\":\"MDT\", " +
//                "\"MADDUR\":\"MAD\", " +
//                "\"MADGAON (GOA)\":\"MAO\", " +
//                "\"MADHUBANI\":\"MBI\", " +
//                "\"MADHUPUR\":\"MDP\", " +
//                "\"MADURAI Jn.\":\"MDU\", " +
//                "\"MAHBUBNAGAR\":\"MBNR\", " +
//                "\"MAHESANA\":\"MSH\", " +
//                "\"MAHOBA\":\"MBA\", " +
//                "\"MAILANI\":\"MLN\", " +
//                "\"MAKSI\":\"MKC\", " +
//                "\"MALDA TOWN\":\"MLDT\", " +
//                "\"MANAMADURAI\":\"MNM\", " +
//                "\"MANDUADIH\":\"MUV\", " +
//                "\"MANGALORE\":\"MAQ\", " +
//                "\"MANIKPUR\":\"MKP\", " +
//                "\"MANKAPUR\":\"MUR\", " +
//                "\"MANMAD\":\"MMR\", " +
//                "\"MANSI\":\"MNE\", " +
//                "\"MARIANI\":\"MXN\", " +
//                "\"MARWAR Jn.\":\"MJ\", " +
//                "\"MATHURA\":\"MTJ\", " +
//                "\"MAU\":\"MAU\", " +
//                "\"MAYILADUTURAI Jn.\":\"MV\", " +
//                "\"MEERUT CITY\":\"MTC\", " +
//                "\"MERTA ROAD\":\"MTD\", " +
//                "\"METTUPALAIYAM\":\"MTP\", " +
//                "\"MHOW\":\"MHOW\", " +
//                "\"MIDNAPORE\":\"MDN\", " +
//                "\"MIRAJ\":\"MRJ\", " +
//                "\"MIRYALAGUDA\":\"MRGA\", " +
//                "\"MIRZAPUR\":\"MZP\", " +
//                "\"MOKAMA\":\"MKA\", " +
//                "\"MORADABAD\":\"MB\", " +
//                "\"MOTIHARI\":\"MKI\", " +
//                "\"MUDKHED\":\"MUE\", " +
//                "\"MUGHALSARAI\":\"MGS\", " +
//                "\"MUMBAI CENTRAL\":\"BCT\", " +
//                "\"MUMBAI CST\":\"CSTM\", " +
//                "\"MURI\":\"MURI\", " +
//                "\"MURKEONGSELEK\":\"MZS\", " +
//                "\"MURTAJAPUR\":\"MZR\", " +
//                "\"MUZAFFAR NAGAR\":\"MOZ\", " +
//                "\"MUZAFFARPUR\":\"MFP\", " +
//                "\"MYSORE\":\"MYS\", " +
//                "\"NADIAD\":\"ND\", " +
//                "\"NADIKUDE\":\"NDKD\", " +
//                "\"NAGARSOL\":\"NSL\", " +
//                "\"NAGBHIR\":\"NAB\", " +
//                "\"NAGDA\":\"NAD\", " +
//                "\"NAGERCOIL Jn.\":\"NCJ\", " +
//                "\"NAGORE\":\"NCR\", " +
//                "\"NAGPUR\":\"NGP\", " +
//                "\"NAINPUR\":\"NIR\", " +
//                "\"SAMBALPUR\":\"SBP\", " +
//                "\"SAMUKTALA ROAD\":\"AMTA\", " +
//                "\"SANGLI\":\"SLI\", " +
//                "\"SARNATH\":\"SRNT\", " +
//                "\"SATARA\":\"STR\", " +
//                "\"SATNA\":\"STA\", " +
//                "\"SATTENAPALLE\":\"SAP\", " +
//                "\"SAWAIMADHOPUR\":\"SWM\", " +
//                "\"SAWANTWADI ROAD\":\"SWV\", " +
//                "\"SEALDAH\":\"SDAH\", " +
//                "\"SECUNDERABAD\":\"SC\", " +
//                "\"SENGOTTAI\":\"SCT\", " +
//                "\"SEWAGRAM\":\"SEGM\", " +
//                "\"SHAHABAD\":\"SDB\", " +
//                "\"SHAHGANJ\":\"SHG\", " +
//                "\"SHAHJAHANPUR\":\"SXK\", " +
//                "\"SHAHPUR PATOREE\":\"SPP\", " +
//                "\"SHAKTINAGAR\":\"SKTN\", " +
//                "\"SHALIMAR\":\"SHM\", " +
//                "\"SHAMGARH\":\"SGZ\", " +
//                "\"SHAMLI\":\"SMQL\", " +
//                "\"SHIKOHABAD\":\"SKB\", " +
//                "\"SHIMLA\":\"SML\", " +
//                "\"SHIMOGA TOWN\":\"SMET\", " +
//                "\"SHIVPURI\":\"SVPI\", " +
//                "\"SHORANUR JN.\":\"SRR\", " +
//                "\"SHRI MAHABIRJI\":\"SMBJ\", " +
//                "\"SIHOR GUJARAT\":\"SOJN\", " +
//                "\"SIKAR\":\"SIKR\", " +
//                "\"SILCHAR\":\"SCL\", " +
//                "\"SILIGURI\":\"SGUJ\", " +
//                "\"SIMALUGURI\":\"SLGR\", " +
//                "\"SINGRAULI\":\"SGRL\", " +
//                "\"SIRPUR KAGAZNAGAR\":\"SKZR\", " +
//                "\"SIRSA\":\"SSA\", " +
//                "\"SISWA BAZAR\":\"SBZ\", " +
//
//                "\"SITAMARHI\":\"SMI\", " +
//
//                "\"SITAPUR CITY\":\"SPC\", " +
//                "\"SITAPUR CANTT.\":\"SCC\", " +
//                "\"SIURI\":\"SURI\", " +
//                "\"SIWAN\":\"SV\", " +
//                "\"SOJAT ROAD\":\"SOD\", " +
//                "\"SOLAN\":\"SOL\", " +
//                "\"SOLAPUR\":\"SUR\", " +
//                "\"SONPUR\":\"SEE\", " +
//                "\"SRIGANGA NAGAR\":\"SGNR\", " +
//                "\"SRIKAKULAM ROAD\":\"CHE\", " +
//                "\"SATYASAI\":\"SRI\", " +
//                "\"PRASHANTI NILAYAM\":\"SSPN\", " +
//                "\"SULTANPUR\":\"SLN\", " +
//                "\"SURAT\":\"ST\", " +
//                "\"SURATGARH\":\"SOG\", " +
//                "\"NAJIBABAD\":\"NBD\", " +
//                "\"NALANDA\":\"NLD\", " +
//                "\"NALGONDA\":\"NLDA\", " +
//                "\"NANDALUR\":\"NRE\", " +
//                "\"NANDED\":\"NED\", " +
//                "\"NANDGAON\":\"NGN\", " +
//                "\"NANDURBAR\":\"NDB\", " +
//                "\"NANDYAL\":\"NDL\", " +
//                "\"NANGAL DAM\":\"NLDM\", " +
//                "\"NARKATIAGANJ\":\"NKE\", " +
//                "\"NARASAPUR\":\"NS\", " +
//                "\"NARWANA\":\"NRW\"," +
//                "\"NASIK ROAD\":\"NK\", " +
//                "\"NAUGARH\":\"NUH\", " +
//                "\"NELLORE\":\"NLR\", " +
//                "\"NEW ALIPURDUAR\":\"NOQ\", " +
//                "\"NEW BONGAIGAON\":\"NBQ\", " +
//                "\"NEW COOCHBEHAR\":\"NCB\", " +
//                "\"NEW DELHI\":\"NDLS\", " +
//                "\"NEW FARAKKA\":\"NFK\", " +
//                "\"NEW JALPAIGURI\":\"NJP\", " +
//                "\"NEWMAL Jn.\":\"NMZ\", " +
//                "\"NEW TINSUKIA\":\"NTSK\", " +
//                "\"NIDADAVOLU\":\"NDD\", " +
//                "\"NIDUBROLU\":\"NDO\", " +
//                "\"NIMACH\":\"NMH\", " +
//                "\"NIZAMABAD\":\"NZB\", " +
//                "\"NOLI\":\"NOLI\", " +
//                "\"NORTH LAKHIMPUR\":\"NLP\", " +
//                "\"OKHA\":\"OKHA\", " +
//                "\"ONGOLE\":\"OGL\", " +
//                "\"ORAI\":\"ORAI\", " +
//                "\"PACHORA\":\"PC\", " +
//                "\"PALANI\":\"PLNI\", " +
//                "\"PALANPUR\":\"PNU\", " +
//                "\"PALASA\":\"PSA\", " +
//                "\"PALAKKAD\":\"PGT\", " +
//                "\"PALAKKAD TOWN\":\"PGTN\", " +
//                "\"PALIAKALAN\":\"PLK\", " +
//                "\"PANIPAT\":\"PNP\", " +
//                "\"PARASNATH\":\"PNME\", " +
//                "\"PANVEL\":\"PNVL\", " +
//                "\"PARBHANI\":\"PBN\", " +
//                "\"PATHANKOT\":\"PTK\", " +
//                "\"PATIALA\":\"PTA\", " +
//                "\"PATNA\":\"PNBE\", " +
//                "\"PATNA SAHIB\":\"PNC\", " +
//                "\"PHAPHAMAU\":\"PFM\", " +
//                "\"PHULERA\":\"FL\", " +
//                "\"PILIBHIT\":\"PBE\", " +
//                "\"PIPARIYA\":\"PPI\", " +
//                "\"PODANUR\":\"PTJ\", " +
//                "\"PORBANDAR\":\"PBR\", " +
//                "\"PRATAPGARH\":\"PBH\", " +
//                "\"PUDUCHERRY\":\"PDY\", " +
//                "\"PUDUKOTTAI\":\"PDKT\", " +
//                "\"PULGAON\":\"PLO\", " +
//                "\"PUNE Jn.\":\"PUNE, " +
//                "\"PURANPUR\":\"PP\", " +
//                "\"PURI\":\"PURI\", " +
//                "\"PURNIA\":\"PRNA\", " +
//                "\"PURNA\":\"PAU\", " +
//                "\"PURULIA\":\"PRR\", " +
//                "\"KOLLAM\":\"QLN\", " +
//                "\"RAICHUR\":\"RC\", " +
//                "\"RAE BARELI\":\"RBL\", " +
//                "\"RAIGARH\":\"RIG\", " +
//                "\"RAIPUR\":\"R\", " +
//                "\"RAJAHMUNDRY\":\"RJY\", " +
//                "\"RAJA-KA-SAHASPUR\":\"RJK\", " +
//                "\"RAJA-KI-MANDI\":\"RKM\", " +
//                "\"RAJENDRANAGAR\":\"RJQ\", " +
//                "\"RAJGIR\":\"RGD\", " +
//                "\"RAJKOT\":\"RJT\", " +
//                "\"RAJNANDGAON\":\"RJN\", " +
//                "\"RAJPURA\":\"RPJ\", " +
//                "\"RAMAGUNDAM\":\"RDM\", " +
//                "\"RAMANATHAPURAM\":\"RMD\", " +
//                "\"RAMESWARAM\":\"RMM\", " +
//                "\"RAMNAGAR\":\"RMR\", " +
//                "\"RAMPUR JN.\":\"RMU\", " +
//                "\"RAMPURHAT\":\"RPH\", " +
//                "\"RANAGHAT\":\"RHA\", " +
//                "\"RANCHI\":\"RNC\", " +
//                "\"RANGAPARA NORTH\":\"RPAN\", " +
//                "\"RANGIYA\":\"RNY\", " +
//                "\"RANINAGAR\":\"ROJ\", " +
//                "\"RATANGARH\":\"RTGH\", " +
//                "\"RATLAM\":\"RTM\", " +
//                "\"RATNAGIRI\":\"RN\", " +
//                "\"RAWATGANJ\":\"RJ\", " +
//                "\"RAXAUL\":\"RXL\", " +
//                "\"RAYAGADA\":\"RGDA\", " +
//                "\"RENIGUNTA\":\"RU\", " +
//                "\"REWA\":\"REWA\", " +
//                "\"REWARI\":\"RE\", " +
//                "\"RINGUS\":\"RGS\", " +
//                "\"ROHTAK\":\"ROK\", " +
//                "\"ROORKEE\":\"RK\", " +
//                "\"ROURKELA\":\"ROU\", " +
//                "\"SADULPUR\":\"SDLP\", " +
//                "\"SAGAR JAMBAGARU\":\"SRF\", " +
//                "\"SAGAULI\":\"SGL\", " +
//                "\"SAHARANPUR\":\"SRE\", " +
//                "\"SAHARSA\":\"SHC\", " +
//                "\"SAHIBGANJ\":\"SBG\", " +
//                "\"SALEM\":\"SA\", " +
//                "\"SALEMPUR\":\"SRU\", " +
//                "\"SAMAKHIYALI\":\"SIOB\", " +
//                "\"SAMALKOT\":\"SLO\", " +
//                "\"SAMASTIPUR\":\"SPJ\", " +
//                "\"SURATHKAL\":\"SL\", " +
//                "\"SURENDRA NAGAR\":\"SUNR\", " +
//                "\"TADEPALLIGUDEM\":\"TDD\", " +
//                "\"TALCHER\":\"TLHR\", " +
//                "\"TAMBARAM\":\"TBM\", " +
//                "\"TATANAGAR\":\"TATA\", " +
//                "\"THALASSERY\":\"TLY\", " +
//                "\"TENALI\":\"TEL\", " +
//                "\"TENKASI\":\"TSI\", " +
//                "\"TEZPUR\":\"TZTB\", " +
//                "\"THANJAVUR Jn.\":\"TJ\", " +
//                "\"THIRUVARUR.\":\"TVR\", " +
//                "\"TIRUCHCHIRAPPALLI Jn.\":\"TPJ\", " +
//                "\"TIRUNELVELI Jn.\":\"TEN\", " +
//                "\"TIRUPATI\":\"TPTY\", " +
//                "\"TIRUR\":\"TIR\", " +
//                "\"TITLAGARH\":\"TIG\", " +
//                "\"THRISUR\":\"TCR\", " +
//                "\"THIRUVANANTHAPURAM\":\"TVC\", " +
//                "\"TUMSAR ROAD\":\"TMR\", " +
//                "\"TUNDLA\":\"TDL\", " +
//                "\"TUNI\":\"TUNI\", " +
//                "\"TUTICORIN\":\"TN\", " +
//                "\"UDAIPUR CITY\":\"UDZ\", " +
//                "\"UDHAMPUR\":\"UHP\", " +
//                "\"UDHNA\":\"UDN\", " +
//                "\"UDUPI\":\"UD\", " +
//                "\"UJJAIN\":\"UJN\", " +
//                "\"UNA\":\"UNA\", " +
//                "\"UNCHAHAR\":\"UCR\", " +
//                "\"UNNAO\":\"ON\", " +
//                "\"VADAKARA\":\"BDJ\", " +
//                "\"VADODARA\":\"BRC\", " +
//                "\"VALSAD\":\"BL\", " +
//                "\"VANCHI MANIYACHCHI Jn.\":\"MEJ\", " +
//                "\"VISAKHAPATNAM\":\"VSKP\", " +
//                "\"VARANASI\":\"BSB\", " +
//                "\"VARKALA\":\"VAK\", " +
//                "\"VASAI ROAD\":\"BSR\", " +
//                "\"VASCO-DA-GAMA\":\"VSG\", " +
//                "\"VERAVAL\":\"VRL\", " +
//                "\"VIDISHA\":\"BHS\", " +
//                "\"VIJAYAWADA\":\"BZA\", " +
//                "\"VILLUPURAM Jn.\":\"VM\", " +
//                "\"VIRAMGAM\":\"VG\", " +
//                "\"VIRUDHUNAGAR\":\"VPT\", " +
//                "\"VIZIANAGARAM\":\"VZM\", " +
//                "\"VRIDDHACHALAM Jn.\":\"VRI\", " +
//                "\"WADI\":\"WADI\", " +
//                "\"WANKANER\":\"WKR\", " +
//                "\"WARANGAL\":\"WL\", " +
//                "\"WARDHA Jn.\":\"WR\", " +
//                "\"YESVANTPUR\":\"YPR\", " +
//                "\"ZAFARABAD\":\"ZBD\", " +
//                "\"Angar\":\"AAG\", " +
//                "\"Ankaikila\":\"AAK\", " +
//                "\"Amlai\":\"AAL\", " +
//                "\"Angadippuram\":\"AAM\", " +
//                "\"Adesar\":\"AAR\", " +
//                "\"Asranada\":\"AAS\", " +
//                "\"Aralvaymozhi\":\"AAY\", " +
//                "\"Ambur\":\"AB\", " +
//                "\"Abada\":\"ABB\", " +
//                "\"Ambli Road\":\"ABD\", " +
//                "\"Ambarifalakata\":\"ABFC\", " +
//                "\"Ambarnath\":\"ABH\", " +
//                "\"Ambaturai\":\"AB\", " +
//                "\"Ambikakalna\":\"ABKA\", " +
//                "\"Ambikapur\":\"ABKP\", " +
//                "\"Ambale\":\"ABLE\", " +
//                "\"Akbarpur\":\"ABP\", " +
//                "\"Abohar\":\"ABS\", " +
//                "\"Adgaonbuzurg\":\"ABZ\", " +
//                "\"Achalganj\":\"ACH\", " +
//                "\"Acharapakkam\":\"ACK\", " +
//                "\"Ancheli\":\"ACL\", " +
//                "\"Azimganj City\":\"ACLE\", " +
//                "\"Adhichchanur\":\"ACN\", " +
//                "\"Andevnagar\":\"ACND\", " +
//                "\"Adilabad\":\"ADB\", " +
//                "\"Adas Road\":\"ADD\", " +
//                "\"Adari Road\":\"ADE\", " +
//                "\"Andheri\":\"ADH\", " +
//                "\"Mandiadampur\":\"ADR\", " +
//                "\"Aduturai\":\"ADT\", " +
//                "\"Adhartal\":\"ADTL\", " +
//                "\"Adavali\":\"ADVI\", " +
//                "\"Amreli\":\"AE\", " +
//                "\"Aulenda\":\"AED\", " +
//                "\"Ateli\":\"AEL\", " +
//                "\"Amrelipara\":\"AEP\", " +
//                "\"Angamali\":\"AFK\", " +
//                "\"Asafpur\":\"AFR\", " +
//                "\"Raigir\":\"AG\", " +
//                "\"Agra City\":\"AGA\", " +
//                "\"Agas\":\"AGAS\", " +
//                "\"Ambagaon\":\"AGB\", " +
//                "\"Agasod\":\"AGD\", " +
//                "\"Amguri\":\"AGI\", " +
//                "\"Amgaon\":\"AGN\", " +
//                "\"Amargarh\":\"AGR\", " +
//                "\"Agartala\":\"AGTL\", " +
//                "\"Agorikhas\":\"AGY\", " +
//                "\"Amagura\":\"AGZ\", " +
//                "\"Abhaipur\":\"AHA\", " +
//                "\"Ahmadgarh\":\"AHH\", " +
//                "\"Ahalyapur\":\"AHLR\", " +
//                "\"Ahiran\":\"AHN\", " +
//                "\"Adarshnagar\":\"AHO\", " +
//                "\"Adipur\":\"AI\", " +
//                "\"Algawan\":\"AIG\", " +
//                "\"Alindra Road\":\"AIR\", " +
//                "\"Ait\":\"AIT\", " +
//                "\"Ajgain\":\"AJ\", " +
//                "\"Anjar\":\"AJE\", " +
//                "\"Ajhai\":\"AJH\", " +
//                "\"Anjhishahabad\":\"AJI\", " +
//                "\"Ajit\":\"AJIT\", " +
//                "\"Ajitwal\":\"AJL\", " +
//                "\"Ajnod\":\"AJN\", " +
//                "\"Ajni\":\"AJNI\", " +
//                "\"Ajjampur\":\"AJP\", " +
//                "\"Ajaibpur\":\"AJR\", " +
//                "\"Akodia\":\"AKD\", " +
//                "\"Akanapet\":\"AKE\", " +
//                "\"Akbarganj\":\"AKJ\", " +
//                "\"Akbarnagar\":\"AKN\", " +
//                "\"Akalkot Road\":\"AKOR\", " +
//                "\"Akot\":\"AKOT\", " +
//                "\"Akolner\":\"AKR\", " +
//                "\"Asaoti\":\"AST\", " +
//                "\"Akurdi\":\"AKRD\", " +
//                "\"Alamanda\":\"ALM\", " +
//                "\"Akaltara\":\"AKT\", " +
//                "\"Asarva Jn.\":\"ASV\", " +
//                "\"Angalakuduru\":\"AKU\", " +
//
//                "\"Alandi\":\"ALN\", " +
//                "\"Asnoti\":\"AT\", " +
//
//                "\"Ankleshwar Jn.\":\"AKV\", " +
//
//                "\"Ata\":\"ATA\", " +
//                "\"Alniya\":\"ALNI\", " +
//                "\"Alai\":\"ALAI\", " +
//                "\"Ambikarohina\":\"AMBR\", " +
//                "\"Alattambadi\":\"ATB\", " +
//
//                "\"Akividu\":\"AKVD\", " +
//                "\"Ammasandra\":\"AMSA\", " +
//                "\"Atarra\":\"ATE\", " +
//                "\"Ariyalur\":\"ALU\", " +
//                "\"Amin\":\"AMIN\", " +
//                "\"Amritapura\":\"AMC\", " +
//                "\"Antah\":\"ATH\", " +
//                "\"Ammapet\":\"AMT\", " +
//                "\"Attili\":\"AL\", " +
//                "\"Akividu\":\"AKVX\", " +
//                "\"Athmalgola\":\"ATL\", " +
//                "\"Amalsad\":\"AML\", " +
//                "\"Amanvadi\":\"AMW\", " +
//                "\"Akora\":\"AKW\", " +
//                "\"Aithal\":\"ATMO\", " +
//                "\"Ahmadpur Jn.\":\"AMP\", " +
//                "\"Amethi\":\"AME\", " +
//                "\"Amla Khurd\":\"AMX\", " +
//                "\"Arantangi\":\"ATQ\", " +
//
//                "\"Alwal\":\" ALW\", " +
//                "\"Ashokapuram\":\"AP\", " +
//                "\"Attar\":\"ATR\", " +
//                "\"Amli\":\"AMLI\", " +
//                "\"Ambalapuzha\":\"AMPA\", " +
//
//                "\"Atru\":\"ATRU\", " +
//                "\"Amarpura\":\"APA\", " +
//                "\"Akathumuri\":\"AMY\", " +
//                "\"Aliabada\":\"ALB\", " +
//                "\"Aler\":\"ALER\", " +
//                "\"Alipurduar\":\"APD\", " +
//
//                "\"Alamnagar\":\"AMG\", " +
//
//                "\"Arariya\":\"ARR\", " +
//                "\"Aslana\":\"ANA\", " +
//                "\"Anupgarh\":\"APH\", " +
//                "\"Ammuguda\":\"AMQ\", " +
//                "\"Arni Road\":\"ARV\", " +
//
//                "\"Ankorahakorha\":\"ANH\", " +
//                "\"Atirampattinam\":\"AMM\", " +
//                "\"Arvi\":\"ARVI\", " +
//                "\"Aruppukkottai\":\"APK\", " +
//
//                "\"Alakkudi\":\"ALK\", " +
//                "\"Ahraura Road\":\"ARW\", " +
//                "\"Anas\":\"ANAS\", " +
//                "\"Ajanti\":\"ANI\", " +
//
//                "\"Arjansar\":\"AS\", " +
//                "\"Appikatla\":\"APL\", " +
//                "\"Allahabad City\":\"ALY\", " +
//                "\"Amroha\":\"AMRO\", " +
//                "\"Asifabad\":\"ASAF\", " +
//
//                "\"Ambodala\":\"AMB\", " +
//                "\"Aditpara\":\"APQ\", " +
//                "\"Ambasamudram\":\"ASD\", " +
//                "\"Ankai\":\"ANK\", " +
//
//                "\"Ammanabrolu\":\"ANB\"," +
//                "\"Aishbagh Jn.\":\"ASH\"," +
//                "\"Ammanur\":\"AMNR\"," +
//                "\"Anaparti\":\"APT\"," +
//                "\"Arnetha\":\"ARE\"," +
//                "\"Ashoknagar\":\"ASKN\"," +
//                "\"Amravati\":\"AMI\"," +
//                "\"Ankola\":\"ANKL\"," +
//                "\"Amausi\":\"AMS\"," +
//                "\"Aslaoda\":\"ASL\"," +
//                "\"Arigada\":\"ARGD\"," +
//                "\"Apta\":\"APTA\"," +
//                "\"Andampaliam\":\"AND\"," +
//                "\"Aslu\":\"ASLU\"," +
//                "\"Arangmahanadi\":\"ANMD\"," +
//                "\"Arakku\":\"ARK\"," +
//                "\"Anjani\":\"ANO\"," +
//                "\"Asangaon\":\"ASO\"," +
//                "\"Ashapuragomat\":\"AQG\"," +
//                "\"Anandtandavpur\":\"ANP\"," +
//                "\"Arand\":\"ARN\"," +
//                "\"Anpara\":\"ANPR\"," +
//                "\"Anara\":\"ANR\"," +
//                "\"Arunachal\":\"ARCL\"," +
//                "\"Atrampur\":\"ARP\"," +
//                "\"Anandpursahib\":\"ANSB\"," +
//                "\"Antu\":\"ANTU\"," +
//                "\"Anand Vihar\":\"ANVR\"," +
//                "\"Arariya Court\":\"ARQ\"," +
//                "\"Amarda Road\":\"ARD\"," +
//                "\"Aonla\":\"AO\"," +
//                "\"Attabira\":\"ATS\"," +
//                "\"Atari\":\"ATT\"," +
//
//
//                "\"Atul\":\"ATUL\"," +
//
//
//                "\"Aluabari\":\"AUB\"," +
//
//
//                "\"Anugrahan\":\"AUBR\"," +
//
//
//                "\"Atrauli\":\"AUR\"," +
//
//
//                "\"Anupshahr\":\"AUS\"," +
//
//
//                "\"Auwa\":\"AUWA\"," +
//
//
//                "\"Avadi\":\"AVD\"," +
//
//
//                "\"Aravankadu\":\"AVK\"," +
//
//
//                "\"Amritvel\":\"AVL\"," +
//
//
//                "\"Aravalli\":\"AVLI\"," +
//
//
//                "\"Aravali Road\":\"AVRD\"," +
//
//
//                "\"Auvaneswsarem\":\"AVS\"," +
//
//
//                "\"Alawalpur\":\"AWL\"," +
//
//
//                "\"Aghwanpur\":\"AWP\"," +
//
//
//                "\"Aswani Halt\":\"AWS\"," +
//
//
//                "\"Alluru Road\":\"AXR\"," +
//
//
//                "\"Ayandur\":\"AYD\"," +
//
//
//                "\"Adiyakkamungalm\":\"AYM\"," +
//
//
//                "\"Aiyanapuram\":\"AYN\"," +
//
//
//                "\"Aryankavu\":\"AYV\"," +
//
//
//                "\"Ayyampet\":\"AZP\"," +
//
//
//                "\"Azamnagar Road\":\"AZR\"," +
//
//
//                "\"Bandra\":\"BA\"," +
//
//
//                "\"Babina\":\"BAB\"," +
//
//
//                "\"Bhader\":\"BADR\"," +
//
//
//                "\"Baliakheri\":\"BAE\"," +
//
//
//                "\"Bhagega\":\"BAGA\"," +
//
//
//                "\"Bhabhar\":\"BAH\"," +
//
//
//                "\"Bajana\":\"BAJN\"," +
//
//
//                "\"Banka\":\"BAKA\"," +
//
//
//                "\"Bakal\":\"BAKL\"," +
//
//
//                "\"Budalur\":\"BAL\"," +
//
//
//                "\"Bale\":\"BALE\"," +
//
//
//                "\"Baitalpur\":\"BALR\"," +
//
//
//                "\"Balugan\":\"BALU\"," +
//
//
//                "\"Berhampur\":\"BAM\"," +
//
//
//                "\"Birambad\":\"BAMA\"," +
//
//
//                "\"Bani\":\"BANI\"," +
//
//
//                "\"Bano\":\"BANO\"," +
//
//
//                "\"Banmor\":\"BAO\"," +
//
//
//                "\"Ganjbasoda\":\"BAQ\"," +
//
//
//                "\"Bar\":\"BAR\"," +
//
//
//                "\"Barh\":\"BARH\"," +
//
//
//                "\"Baral\":\"BARL\"," +
//
//
//                "\"Batala Jn\":\"BAT\"," +
//
//
//                "\"Baihatola\":\"BATL\"," +
//
//
//                "\"Baruva\":\"BAV\"," +
//
//
//                "\"Balwara\":\"BAWA\"," +
//
//
//                "\"Baran\":\"BAZ\"," +
//
//
//                "\"Bombay Go Cb\":\"GLOB\"," +
//
//
//                "\"Babrala\":\"BBA\"," +
//
//
//                "\"Bhadbhunja\":\"BBAI\"," +
//
//
//                "\"Babarpur\":\"BBDE\"," +
//
//
//                "\"Baruabamungaon\":\"BBGN\"," +
//
//
//                "\"Barabhum\":\"BBM\"," +
//
//
//                "\"Baribrahman\":\"BBMN\"," +
//
//
//                "\"Babugarh\":\"BBO\"," +
//
//
//                "\"Balabhadrapuram\":\"BBPM\"," +
//
//
//                "\"Bagbazar\":\"BBR\"," +
//
//
//                "\"Barbatpur\":\"BBTR\"," +
//
//
//                "\"Bhabua Road\":\"BBU\"," +
//
//
//                "\"Bodarwar\":\"BBW\"," +
//
//
//                "\"Bareilly City\":\"BC\"," +
//
//
//                "\"Bachwara Jn.\":\"BCA\"," +
//
//
//                "\"Bansdih Road\":\"BCD\"," +
//
//
//                "\"Berchha\":\"BCH\"," +
//
//
//                "\"Bacheli\":\"BCHL\"," +
//
//
//                "\"Balichak\":\"BCK\"," +
//
//
//                "\"Bombay Central (Local)\":\"BCL\"," +
//
//
//                "\"Bachhrawan\":\"BCN\"," +
//
//
//                "\"Bhachau\":\"BCO\"," +
//
//
//                "\"Bhachaubg\":\"BCOB\"," +
//
//
//                "\"Bichpuri\":\"BCP\"," +
//
//
//                "\"Barachak\":\"BCQ\"," +
//
//
//                "\"Barchi Road\":\"BCRD\"," +
//
//
//                "\"Bhuchchu\":\"BCU\"," +
//
//
//                "\"Varanasi City\":\"BCY\"," +
//
//
//                "\"Vrindavan\":\"BDB\"," +
//
//
//                "\"Bhadrachalam Road\":\"BDCR\"," +
//
//
//                "\"Badodar\":\"BDDR\"," +
//
//
//                "\"Bodeli\":\"BDE\"," +
//
//
//                "\"Bhedia\":\"BDH\"," +
//
//
//                "\"Badhada\":\"BDHA\"," +
//
//
//                "\"Badhal\":\"BDHL\"," +
//
//
//                "\"Bodhan\":\"BDHN\"," +
//
//
//                "\"Budhi\":\"BDHY\"," +
//
//
//                "\"Bhadli\":\"BDI\"," +
//
//
//                "\"Vindhyachal\":\"BDL\"," +
//
//
//                "\"Badami\":\"BDM\"," +
//
//
//                "\"Bhodwalmajri\":\"BDMJ\"," +
//
//
//                "\"Bhadan\":\"BDN\"," +
//
//
//                "\"Bodinayakkanur\":\"BDNK\"," +
//
//
//                "\"Bidanpur\":\"BDNP\"," +
//
//
//                "\"Byadarahalli\":\"BDRL\"," +
//
//
//                "\"Badnapur\":\"BDU\"," +
//
//
//                "\"Bhadravati\":\"BDVT\"," +
//
//
//                "\"Bandanwara\":\"BDW\"," +
//
//
//                "\"Badhwabara\":\"BDWA\"," +
//
//
//                "\"Bodwad\":\"BDWD\"," +
//
//
//                "\"Biradhwal\":\"BDWL\"," +
//
//
//                "\"Badearapur\":\"BDXX\"," +
//
//
//                "\"Buddireddippati\":\"BDY\"," +
//
//
//                "\"Badkulla\":\"BDZ\"," +
//
//
//                "\"Bihiya\":\"BEA\"," +
//
//
//                "\"Beldanga\":\"BEB\"," +
//
//
//                "\"Bhupdeopur\":\"BEF\"," +
//
//
//                "\"Behtagokul\":\"BEG\"," +
//
//
//                "\"Bagdihi\":\"BEH\"," +
//
//
//                "\"Beohari\":\"BEHR\"," +
//
//
//                "\"Biharsharif\":\"BEHS\"," +
//
//
//                "\"Bundki\":\"BEK\"," +
//
//
//                "\"Birohe\":\"BEO\"," +
//
//
//                "\"Bheerpur\":\"BEP\"," +
//
//
//                "\"Belur\":\"BEQ\"," +
//
//
//                "\"Beawar\":\"BER\"," +
//
//
//                "\"Bero\":\"BERO\"," +
//
//
//                "\"Bareth\":\"BET\"," +
//
//
//                "\"Betavad\":\"BEW\"," +
//
//
//                "\"Bcementnagar\":\"BEY\"," +
//
//
//                "\"Borhat\":\"BFD\"," +
//
//
//                "\"Bhorasbudrukh\":\"BFJ\"," +
//
//
//                "\"Bhalui\":\"BFM\"," +
//
//
//                "\"Bhabta\":\"BFT\"," +
//
//
//                "\"Bhesana\":\"BFY\"," +
//
//
//                "\"Bhongir\":\"BG\"," +
//
//
//                "\"Bagalia\":\"BGA\"," +
//
//
//                "\"Balagarh\":\"BGAE\"," +
//
//
//                "\"Bagbahra\":\"BGBR\"," +
//
//
//                "\"Bantarnathgarh\":\"BGG\"," +
//
//
//                "\"Baghauli\":\"BGH\"," +
//
//
//                "\"Borraguhallu\":\"BGHU\"," +
//
//
//                "\"Bhagat Ki Kothi\":\"BGKT\"," +
//
//
//                "\"Bagumra\":\"BGMR\"," +
//
//
//                "\"Borgaon\":\"BGN\"," +
//
//
//                "\"Bhagwanpura\":\"BGPR\"," +
//
//
//                "\"Bhongaon\":\"BGQ\"," +
//
//
//                "\"Baghnapara\":\"BGRA\"," +
//
//
//                "\"Begusarai\":\"BGS\"," +
//
//
//                "\"Bisugirsharif\":\"BGSF\"," +
//
//
//                "\"Bagratawa\":\"BGTA\"," +
//
//
//                "\"Bhagtanwala\":\"BGTN\"," +
//
//
//                "\"Bairagnia\":\"BGU\"," +
//
//
//                "\"Bhigwan\":\"BGVN\"," +
//
//
//                "\"Begdewadi\":\"BGW\"," +
//
//
//                "\"Bagewadi\":\"BGWD\"," +
//
//
//                "\"Bagrisajjanpur\":\"BGX\"," +
//
//
//                "\"Bahadurgarh\":\"BGZ\"," +
//
//
//                "\"Badli\":\"BHD\"," +
//
//
//                "\"Bhestan\":\"BHET\"," +
//
//
//                "\"Bhatonkigali\":\"BHG\"," +
//
//
//                "\"Baheri\":\"BHI\"," +
//
//
//                "\"Bheja\":\"BHJA\"," +
//
//
//                "\"Bhurkunda\":\"BHKD\"," +
//
//
//                "\"Behula\":\"BHLA\"," +
//
//
//                "\"Bhalki\":\"BHLK\"," +
//
//
//                "\"Bhulanpur\":\"BHLP\"," +
//
//
//                "\"Bhandaridah\":\"BHME\"," +
//
//
//                "\"Bhone\":\"BHNE\"," +
//
//
//                "\"Bhansi\":\"BHNS\"," +
//
//
//                "\"Bhattu\":\"BHT\"," +
//
//
//                "\"Bhatiya\":\"BHTA\"," +
//
//
//                "\"Bhanwartonk\":\"BHTK\"," +
//
//
//                "\"Bhatel\":\"BHTL\"," +
//
//
//                "\"Bhitoni\":\"BHTN\"," +
//
//
//                "\"Bhatparrani\":\"BHTR\"," +
//
//
//                "\"Bhandumotidau\":\"BHU\"," +
//
//
//                "\"Bhua\":\"BHUA\"," +
//
//
//                "\"Bhoma\":\"BHV\"," +
//
//
//                "\"Barharwa Jn.\":\"BHW\"," +
//
//
//                "\"Bechhiwara\":\"BHWA\"," +
//
//
//                "\"Bhayavadar\":\"BHY\"," +
//
//
//                "\"Bihara\":\"BHZ\"," +
//
//
//                "\"Bhilai\":\"BIA\"," +
//
//
//                "\"Bichia\":\"BIC\"," +
//
//
//                "\"Bidadi\":\"BID\"," +
//
//
//                "\"Bidar\":\"BIDR\"," +
//
//
//                "\"Belgahna\":\"BIG\"," +
//
//
//                "\"Bairagarh\":\"BIH\"," +
//
//
//                "\"Birnagar\":\"BIJ\"," +
//
//
//                "\"Bijoor\":\"BIJR\"," +
//
//
//                "\"Bildi\":\"BILD\"," +
//
//
//                "\"Bilkha\":\"BILK\"," +
//
//
//                "\"Bilimora Jn.\":\"BIM\"," +
//
//
//                "\"Bhimal\":\"BIML\"," +
//
//
//                "\"Bordi\":\"BIO\"," +
//
//
//                "\"Bahilpurwa\":\"BIP\"," +
//
//
//                "\"Bheempura\":\"BIPR\"," +
//
//
//                "\"Bansipaharpur\":\"BIQ\"," +
//
//
//                "\"Bir\":\"BIR\"," +
//
//
//                "\"Bhiwandi Road\":\"BIRD\"," +
//
//
//                "\"Bishengarh\":\"BISH\"," +
//
//
//                "\"Bidupur\":\"BIU\"," +
//
//
//                "\"Bisalwaskalan\":\"BIWK\"," +
//
//
//                "\"Bardoli\":\"BIY\"," +
//
//
//                "\"Bahjoi\":\"BJ\"," +
//
//
//                "\"Bijrotha\":\"BJA\"," +
//
//
//                "\"Barejadi\":\"BJD\"," +
//
//
//                "\"Bhojudih Jn.\":\"BJE\"," +
//
//
//                "\"Bijni\":\"BJF\"," +
//
//
//                "\"Bijauli\":\"BJI\"," +
//
//
//                "\"Bijora\":\"BJK\"," +
//
//
//                "\"Bhagavathipuram\":\"BJM\"," +
//
//
//                "\"Barajamda\":\"BJMD\"," +
//
//
//                "\"Baijnath Mandir Halt\":\"BJMR\"," +
//
//
//                "\"Bejnal\":\"BJN\"," +
//
//
//                "\"Bijainagar\":\"BJNR\"," +
//
//
//                "\"Baijnath Paprola\":\"BJPL\"," +
//
//
//                "\"Baghora\":\"BJQ\"," +
//
//
//                "\"Bijuri\":\"BJRI\"," +
//
//
//                "\"Bajva\":\"BJW\"," +
//
//
//                "\"Bakra Road\":\"BK\"," +
//
//
//                "\"Barkhera\":\"BKA\"," +
//
//
//                "\"Bhikamkor\":\"BKC\"," +
//
//
//                "\"Bhankoda\":\"BKD\"," +
//
//
//                "\"Bankhedi\":\"BKH\"," +
//
//
//                "\"Bakhri\":\"BKHR\"," +
//
//
//                "\"Barkur\":\"BKJ\"," +
//
//
//                "\"Bonakalu\":\"BKL\"," +
//
//
//                "\"Bakudi\":\"BKLE\"," +
//
//
//                "\"Bhaktinagar\":\"BKNG\"," +
//
//
//                "\"Bindki Road\":\"BKO\"," +
//
//
//                "\"Bhaluka Road\":\"BKRD\"," +
//
//
//                "\"Bokarothermal\":\"BKRO\"," +
//
//
//                "\"Baikunth\":\"BKTH\"," +
//
//
//                "\"Bhiknur\":\"BKU\"," +
//
//
//                "\"Barlai\":\"BLAX\"," +
//
//
//                "\"Bolda\":\"BLC\"," +
//
//
//                "\"Bhilad\":\"BLD\"," +
//
//
//                "\"Bhildi\":\"BLDI\"," +
//
//
//                "\"Balaudatakun\":\"BLDK\"," +
//
//
//                "\"Bilharghat\":\"BLG\"," +
//
//
//                "\"Balangir\":\"BLGR\"," +
//
//
//                "\"Balurghat\":\"BLGT\"," +
//
//
//                "\"Belakoba\":\"BLK\"," +
//
//
//                "\"Bantanahal\":\"BLL\"," +
//
//
//                "\"Balli\":\"BLLI\"," +
//
//
//                "\"Balamu Jn.\":\"BLM\"," +
//
//
//                "\"Bhalumaska\":\"BLMK\"," +
//
//
//                "\"Bhalukmara\":\"BLMR\"," +
//
//
//                "\"Bolinnadoaba\":\"BLND\"," +
//
//
//                "\"Bhalwani\":\"BLNI\"," +
//
//
//                "\"Bhulon\":\"BLO\"," +
//
//
//                "\"Bilaspur Road\":\"BLOR\"," +
//
//
//                "\"Balrampur\":\"BLP\"," +
//
//
//                "\"Badulipar\":\"BLPR\"," +
//
//
//                "\"Bilpur\":\"BLPU\"," +
//
//
//                "\"Bala Road\":\"BLRD\"," +
//
//
//                "\"Belsiri\":\"BLRE\"," +
//
//
//                "\"Bolsa\":\"BLSA\"," +
//
//
//                "\"Balsamand\":\"BLSD\"," +
//
//
//                "\"Belsonda\":\"BLSN\"," +
//
//
//                "\"Balotra Jn.\":\"BLT\"," +
//
//
//                "\"Belthara Road\":\"BLTR\"," +
//
//
//                "\"Bilhaur\":\"BLU\"," +
//
//
//                "\"Balawali\":\"BLW\"," +
//
//
//                "\"Balawala\":\"BLWL\"," +
//
//
//                "\"Bolai\":\"BLX\"," +
//
//
//                "\"Bally\":\"BLY\"," +
//
//
//                "\"Budhlada\":\"BLZ\"," +
//
//
//                "\"Bamra\":\"BMB\"," +
//
//
//                "\"Bhimalgondi\":\"BMC\"," +
//
//
//                "\"Bissamcuttack\":\"BMCK\"," +
//
//
//                "\"Bhimadolu\":\"BMD\"," +
//
//
//                "\"Basmat\":\"BMF\"," +
//
//
//                "\"Bhimgara\":\"BMGA\"," +
//
//
//                "\"Brahmanagudem\":\"BMGM\"," +
//
//
//                "\"Betamcherla\":\"BMH\"," +
//
//
//                "\"Bamanheri\":\"BMHR\"," +
//
//
//                "\"Bamnia\":\"BMI\"," +
//
//
//                "\"Birangkhera\":\"BMK\"," +
//
//
//                "\"Bhimkhoj\":\"BMKJ\"," +
//
//
//                "\"Bamla\":\"BMLL\"," +
//
//
//                "\"Bhimana\":\"BMN\"," +
//
//
//                "\"Bolarum\":\"BMO\"," +
//
//
//                "\"Brahmanpalli\":\"BMPL\"," +
//
//
//                "\"Badampahar\":\"BMPR\"," +
//
//
//                "\"Bhimarlai\":\"BMQ\"," +
//
//
//                "\"Bikrampur\":\"BMR\"," +
//
//
//                "\"Bamsin\":\"BMSN\"," +
//
//
//                "\"Bhimasar\":\"BMSR\"," +
//
//
//                "\"Begampet\":\"BMT\"," +
//
//
//                "\"Bamhrauli\":\"BMU\"," +
//
//
//                "\"Bamhani\":\"BMW\"," +
//
//
//                "\"Bibinagar\":\"BN\"," +
//
//
//                "\"Binaur\":\"BNAR\"," +
//
//
//                "\"Bangalore East\":\"BNCE\"," +
//
//
//                "\"Bondamunda\":\"BNDM\"," +
//
//
//                "\"Bohani\":\"BNE\"," +
//
//
//                "\"Barnagar\":\"BNG\"," +
//
//
//                "\"Bongaigaon\":\"BNGN\"," +
//
//
//                "\"Bhimnath\":\"BNH\"," +
//
//
//                "\"Bellenahalli\":\"BNHL\"," +
//
//
//                "\"Budni\":\"BNI\"," +
//
//
//                "\"Bevinahalu\":\"BNL\"," +
//
//
//                "\"Bansthaliniwai\":\"BNLW\"," +
//
//
//                "\"Baragaon\":\"BNM\"," +
//
//
//                "\"Barnala\":\"BNN\"," +
//
//
//                "\"Banar\":\"BNO\"," +
//
//
//                "\"Bhanapur\":\"BNP\"," +
//
//
//                "\"Banpimpla\":\"BNPP\"," +
//
//
//                "\"Bhagwanpur\":\"BNR\"," +
//
//
//                "\"Banas\":\"BNS\"," +
//
//
//                "\"Banbasa\":\"BNSA\"," +
//
//
//                "\"Bharthana\":\"BNT\"," +
//
//
//                "\"Bantawala\":\"BNTL\"," +
//
//
//                "\"Bandakpur\":\"BNU\"," +
//
//
//                "\"Bhanvad\":\"BNUD\"," +
//
//
//                "\"Bhaunra\":\"BNVD\"," +
//
//
//                "\"Bhiwani City\":\"BNWC\"," +
//
//
//                "\"Bidhannagar\":\"BNXR\"," +
//
//
//                "\"Badshahnagar\":\"BNZ\"," +
//
//
//                "\"Bobas\":\"BOBS\"," +
//
//
//                "\"Bangrod\":\"BOD\"," +
//
//
//                "\"Bhairongarh\":\"BOG\"," +
//
//
//                "\"Bainchi\":\"BOI\"," +
//
//
//                "\"Bhojo\":\"BOJ\"," +
//
//
//                "\"Bhoke\":\"BOKE\"," +
//
//
//                "\"Bhonra\":\"BON\"," +
//
//
//                "\"Boinda\":\"BONA\"," +
//
//
//                "\"Boisar\":\"BOR\"," +
//
//
//                "\"Baghdogra\":\"BORA\"," +
//
//
//                "\"Baorithikria\":\"BOTI\"," +
//
//
//                "\"Bhatgaon\":\"BOV\"," +
//
//
//                "\"Borawar\":\"BOW\"," +
//
//
//                "\"Bolarumbazar\":\"BOZ\"," +
//
//
//                "\"Barrackpore\":\"BP\"," +
//
//
//                "\"Belampalli\":\"BPA\"," +
//
//
//                "\"Berhamporecrt\":\"BPC\"," +
//
//
//                "\"Bahadurpur\":\"BPD\"," +
//
//
//                "\"Banapura\":\"BPF\"," +
//
//
//                "\"Belpahar\":\"BPH\"," +
//
//
//                "\"Bhilaipwrhs\":\"BPHB\"," +
//
//
//                "\"Bhugaon\":\"BPK\"," +
//
//
//                "\"Bhopalka\":\"BPKA\"," +
//
//
//                "\"Baripada\":\"BPO\"," +
//
//
//                "\"Barpeta Road\":\"BPRD\"," +
//
//
//                "\"Bhogpursirwal\":\"BPRS\"," +
//
//
//                "\"Banpas\":\"BPS\"," +
//
//
//                "\"Badampudi\":\"BPY\"," +
//
//
//                "\"Bazpur\":\"BPZ\"," +
//
//
//                "\"Bharathapuzha\":\"BPZA\"," +
//
//
//                "\"Bankura\":\"BQA\"," +
//
//
//                "\"Bhagwangola\":\"BQG\"," +
//
//
//                "\"Bommidi\":\"BQI\"," +
//
//
//                "\"Barelipur\":\"BQM\"," +
//
//
//                "\"Bagrinagar\":\"BQN\"," +
//
//
//                "\"Bighapur\":\"BQP\"," +
//
//
//                "\"Bakhleta\":\"BQQ\"," +
//
//
//                "\"Bhilainagar\":\"BQR\"," +
//
//
//                "\"Bhattiprolu\":\"BQU\"," +
//
//
//                "\"Bandhbareta\":\"BR\"," +
//
//
//                "\"Birsola\":\"BRA\"," +
//
//
//                "\"Barang\":\"BRAG\"," +
//
//
//                "\"Boribial\":\"BRB\"," +
//
//
//                "\"Bhandara Road\":\"BRD\"," +
//
//
//                "\"Bardhana Halt\":\"BRDH\"," +
//
//
//                "\"Bharwari\":\"BRE\"," +
//
//
//                "\"Bargarh\":\"BRG\"," +
//
//
//                "\"Baraigram Jn.\":\"BRGM\"," +
//
//
//                "\"Bheraghat\":\"BRGT\"," +
//
//
//                "\"Bargawan\":\"BRGW\"," +
//
//
//                "\"Baikunthpur Road\":\"BRH\"," +
//
//
//                "\"Brajrajnagar\":\"BRJN\"," +
//
//
//                "\"Bahraich\":\"BRK\"," +
//
//
//                "\"Braylachaurasi\":\"BRLA\"," +
//
//
//                "\"Biroliya\":\"BRLY\"," +
//
//
//                "\"Barabambo\":\"BRM\"," +
//
//
//                "\"Biramdih\":\"BRMD\"," +
//
//
//                "\"Bermo\":\"BRMO\"," +
//
//
//                "\"Birmitrapur\":\"BRMP\"," +
//
//
//                "\"Baramati\":\"BRMT\"," +
//
//
//                "\"Barhan\":\"BRN\"," +
//
//
//                "\"Boridand\":\"BRND\"," +
//
//
//                "\"Barpali\":\"BRPL\"," +
//
//
//                "\"Birapatti\":\"BRPT\"," +
//
//
//                "\"Barakar\":\"BRR\"," +
//
//
//                "\"Biyavrarajgarh\":\"BRRG\"," +
//
//
//                "\"Birsinghpur\":\"BRS\"," +
//
//
//                "\"Bhortex\":\"BRTK\"," +
//
//
//                "\"Bhairoganj\":\"BRU\"," +
//
//
//                "\"Borvihir\":\"BRVR\"," +
//
//
//                "\"Bareilly\":\"BRY\"," +
//
//
//                "\"Barhiya\":\"BRYA\"," +
//
//
//                "\"Bareta\":\"BRZ\"," +
//
//
//                "\"Banshbaria\":\"BSAE\"," +
//
//
//                "\"Banshlaibridge\":\"BSBR\"," +
//
//
//                "\"Bulandshahr\":\"BSC\"," +
//
//
//                "\"Baniyasandadh\":\"BSDA\"," +
//
//
//                "\"Bharsendi\":\"BSDL\"," +
//
//
//                "\"Bhusandpur\":\"BSDP\"," +
//
//
//                "\"Badshahpur\":\"BSE\"," +
//
//
//                "\"Basugaon\":\"BSGN\"," +
//
//
//                "\"Bhupalsagar\":\"BSJ\"," +
//
//
//                "\"Basikiratpur\":\"BSKR\"," +
//
//
//                "\"Bataspur\":\"BSLE\"," +
//
//
//                "\"Banasandra\":\"BSN\"," +
//
//
//                "\"Biaspind\":\"BSPD\"," +
//
//
//                "\"Bassipathanam\":\"BSPN\"," +
//
//
//                "\"Bishrampur\":\"BSPR\"," +
//
//
//                "\"Barsitakli\":\"BSQ\"," +
//
//
//                "\"Bansipur\":\"BSQP\"," +
//
//
//                "\"Besroli\":\"BSRL\"," +
//
//
//                "\"Bagevadi Road\":\"BSRX\"," +
//
//
//                "\"Bhemswadi\":\"BSWD\"," +
//
//
//                "\"Basar\":\"BSX\"," +
//
//
//                "\"Barsathi\":\"BSY\"," +
//
//
//                "\"Bharwasumerpur\":\"BSZ\"," +
//
//
//                "\"Barasat\":\"BT\"," +
//
//
//                "\"Bihta\":\"BTA\"," +
//
//
//                "\"Basharatganj\":\"BTG\"," +
//
//
//                "\"Bishnathganj\":\"BTJ\"," +
//
//
//                "\"Bankata\":\"BTK\"," +
//
//
//                "\"Bharatkund\":\"BTKD\"," +
//
//
//                "\"Bhatkal\":\"BTKL\"," +
//
//
//                "\"Bharatkup\":\"BTKP\"," +
//
//
//                "\"Bortalao\":\"BTL\"," +
//
//
//                "\"Bhitaura\":\"BTO\"," +
//
//
//                "\"Babatpur\":\"BTP\"," +
//
//
//                "\"Bethampurdi\":\"BTPD\"," +
//
//
//                "\"Bhatpur\":\"BTPR\"," +
//
//
//                "\"Butari\":\"BTR\"," +
//
//
//                "\"Banthra\":\"BTRA\"," +
//
//
//                "\"Basta\":\"BTS\"," +
//
//
//                "\"Baitarani Road\":\"BTV\"," +
//
//
//                "\"Barsi Town\":\"BTW\"," +
//
//
//                "\"Belatal\":\"BTX\"," +
//
//
//                "\"Bethuadahari\":\"BTY\"," +
//
//
//                "\"Baswa\":\"BU\"," +
//
//
//                "\"Baradwar\":\"BUA\"," +
//
//
//                "\"Bissau\":\"BUB\"," +
//
//
//                "\"Bhutakiabhimsa\":\"BUBR\"," +
//
//
//                "\"Badlapur\":\"BUD\"," +
//
//
//                "\"Bundi\":\"BUDI\"," +
//
//
//                "\"Badmal\":\"BUDM\"," +
//
//
//                "\"Burhar\":\"BUH\"," +
//
//
//                "\"Bhalulata\":\"BUL\"," +
//
//
//                "\"Bommasamudram\":\"BUM\"," +
//
//
//                "\"Bariarpur\":\"BUP\"," +
//
//
//                "\"Babupeth\":\"BUPH\"," +
//
//
//                "\"Bargi\":\"BUQ\"," +
//
//
//                "\"Burnpur\":\"BURN\"," +
//
//
//                "\"Badausa\":\"BUS\"," +
//
//
//                "\"Baytu\":\"BUT\"," +
//
//
//                "\"Bhandak\":\"BUX\"," +
//
//
//                "\"Babhnan\":\"BV\"," +
//
//
//                "\"Bauria Jn.\":\"BVA\"," +
//
//
//                "\"Bhadbhadaghat\":\"BVB\"," +
//
//
//                "\"Ballabgarh\":\"BVH\"," +
//
//
//                "\"Bikkavolu\":\"BVL\"," +
//
//
//                "\"Bayyavaram\":\"BVM\"," +
//
//
//                "\"Biswan\":\"BVN\"," +
//
//
//                "\"Bhavaninagar\":\"BVNR\"," +
//
//
//                "\"Bhavanagarpara\":\"BVP\"," +
//
//
//                "\"Bhilavdi\":\"BVQ\"," +
//
//
//                "\"Bhimavaram Town\":\"BVRX\"," +
//
//
//                "\"Bhivpuri Road\":\"BVS\"," +
//
//
//                "\"Balipara\":\"BVU\"," +
//
//
//                "\"Bedetti\":\"BVV\"," +
//
//
//                "\"Bhinwaliya\":\"BWA\"," +
//
//
//                "\"Bagwali\":\"BWB\"," +
//
//
//                "\"Banwali\":\"BWC\"," +
//
//
//                "\"Belvandi\":\"BWD\"," +
//
//
//                "\"Butewala\":\"BWF\"," +
//
//
//                "\"Bhadaura\":\"BWH\"," +
//
//
//                "\"Bilwai\":\"BWI\"," +
//
//
//                "\"Bawanikhera\":\"BWK\"," +
//
//
//                "\"Bawal\":\"BWL\"," +
//
//
//                "\"Bhawanimandi\":\"BWM\"," +
//
//
//                "\"Bhawanipurkaln\":\"BWP\"," +
//
//
//                "\"Barwasagar\":\"BWR\"," +
//
//
//                "\"Bharatwada\":\"BWRA\"," +
//
//
//                "\"Badwasi\":\"BWS\"," +
//
//
//                "\"Barwaha\":\"BWW\"," +
//
//
//                "\"Bangarapet\":\"BWY\"," +
//
//
//                "\"Balod\":\"BXA\"," +
//
//
//                "\"Barsuan\":\"BXF\"," +
//
//
//                "\"Bokajan\":\"BXJ\"," +
//
//
//                "\"Billi\":\"BXLL\"," +
//
//
//                "\"Belrayan\":\"BXM\"," +
//
//
//                "\"Barpathar\":\"BXP\"," +
//
//
//                "\"Brundamal\":\"BXQ\"," +
//
//
//                "\"Bordhal\":\"BXY\"," +
//
//
//                "\"Byculla\":\"BY\"," +
//
//
//                "\"Bellary Cant.\":\"BYC\"," +
//
//
//                "\"Byadgi\":\"BYD\"," +
//
//
//                "\"Baryaram\":\"BYHA\"," +
//
//
//                "\"Belha\":\"BYL\"," +
//
//
//                "\"Banahi\":\"BYN\"," +
//
//
//                "\"Byndoor\":\"BYNR\"," +
//
//
//                "\"Baijnathpur\":\"BYP\"," +
//
//
//                "\"Baiyyappanahali\":\"BYPL\"," +
//
//
//                "\"Bhayandar\":\"BYR\"," +
//
//
//                "\"Byree\":\"BYY\"," +
//
//
//                "\"Bazidajatan\":\"BZJT\"," +
//
//
//                "\"Bhaini Khurd\":\"BZK\"," +
//
//
//                "\"Bazarsau\":\"BZLE\"," +
//
//
//                "\"Bhimsen\":\"BZM\"," +
//
//
//                "\"Bagnan\":\"BZN\"," +
//
//
//                "\"Barsola\":\"BZO\"," +
//
//
//                "\"Bisra\":\"BZR\"," +
//
//
//                "\"Basai\":\"BZY\"," +
//
//
//                "\"Chandafort\":\"CAF\"," +
//
//
//                "\"Chhabragugor\":\"CAG\"," +
//
//
//                "\"Chanpatia\":\"CAI\"," +
//
//
//                "\"Chakrajmal\":\"CAJ\"," +
//
//
//                "\"Chamua\":\"CAMU\"," +
//
//
//                "\"Chatrapur\":\"CAP\"," +
//
//
//                "\"Chhansara\":\"CASA\"," +
//
//
//                "\"Coimbatore\":\"CBEE\"," +
//
//
//                "\"Coimbatorenrth\":\"CBF\"," +
//
//
//                "\"Charbhuja Road\":\"CBG\"," +
//
//
//                "\"Chaube\":\"CBH\"," +
//
//
//                "\"Clutterbuckganj\":\"CBJ\"," +
//
//
//                "\"Chachaurabngj\":\"CBK\"," +
//
//
//                "\"Cumbum\":\"CBM\"," +
//
//
//                "\"Chitbaragaon\":\"CBN\"," +
//
//
//                "\"Chikballapur\":\"CBP\"," +
//
//
//                "\"Chaibasa\":\"CBSA\"," +
//
//
//                "\"Charbatia\":\"CBT\"," +
//
//
//                "\"Cbabusamudram\":\"CBU\"," +
//
//
//                "\"Khambhat\":\"CBY\"," +
//
//
//                "\"Chaurichaura\":\"CC\"," +
//
//
//                "\"Chigicherla\":\"CCA\"," +
//
//
//                "\"Churchgate\":\"CCG\"," +
//
//
//                "\"Chinchvad\":\"CCH\"," +
//
//
//                "\"Chinnekuntapali\":\"CCI\"," +
//
//
//                "\"Kakinada Town\":\"CCT\"," +
//
//
//                "\"Chuda\":\"CDA\"," +
//
//
//                "\"Chandanchauki\":\"CDC\"," +
//
//
//                "\"Chandrakona Road\":\"CDGR\"," +
//
//
//                "\"Chakdaha\":\"CDH\"," +
//
//
//                "\"Chodiala\":\"CDL\"," +
//
//
//                "\"Chandlodiya\":\"CDLD\"," +
//
//
//                "\"Chandaulimjhwr\":\"CDMR\"," +
//
//
//                "\"Chandpara\":\"CDP\"," +
//
//
//                "\"Chadotar\":\"CDQ\"," +
//
//
//                "\"Chhandrauli\":\"CDRL\"," +
//
//
//                "\"Chandisar\":\"CDS\"," +
//
//
//                "\"Chandresal\":\"CDSL\"," +
//
//
//                "\"Chharodi\":\"CE\"," +
//
//
//                "\"Chebrol\":\"CEL\"," +
//
//
//                "\"Chiheru\":\"CEU\"," +
//
//
//                "\"Charghatpipari\":\"CGE\"," +
//
//
//                "\"Cholang\":\"CGH\"," +
//
//
//                "\"Chandragiri\":\"CGI\"," +
//
//
//                "\"Chirgaon\":\"CGN\"," +
//
//
//                "\"Chhidgaon\":\"CGO\"," +
//
//
//                "\"Chandannagar\":\"CGR\"," +
//
//
//                "\"Changanacheri\":\"CGY\"," +
//
//
//                "\"Chawapall\":\"CHA\"," +
//
//
//                "\"Chabua\":\"CHB\"," +
//
//
//                "\"Chaurebazar\":\"CHBR\"," +
//
//
//                "\"Chakarbhatha\":\"CHBT\"," +
//
//
//                "\"Chacher\":\"CHCR\"," +
//
//
//                "\"Chandia Road\":\"CHD\"," +
//
//
//                "\"Chaukhandi\":\"CHH\"," +
//
//
//                "\"Chirai\":\"CHII\"," +
//
//
//                "\"Chata\":\"CHJ\"," +
//
//
//                "\"Challakere\":\"CHKE\"," +
//
//
//                "\"Chola\":\"CHL\"," +
//
//
//                "\"Chavalkhede\":\"CHLK\"," +
//
//
//                "\"Chalthan\":\"CHM\"," +
//
//
//                "\"Chhina\":\"CHN\"," +
//
//
//                "\"Channani\":\"CHNN\"," +
//
//
//                "\"Chhapi\":\"CHP\"," +
//
//
//                "\"Chharra\":\"CHRA\"," +
//
//
//                "\"Chirmiri\":\"CHRM\"," +
//
//
//                "\"Chaneti\":\"CHTI\"," +
//
//
//                "\"Cochinhrbrtms\":\"CHTS\"," +
//
//
//                "\"Cochin\":\"CHTX\"," +
//
//
//                "\"Charvattur\":\"CHV\"," +
//
//
//                "\"Chhaprakacheri\":\"CI\"," +
//
//
//                "\"Chilbila Jn.\":\"CIL\"," +
//
//
//                "\"Chitali\":\"CIT\"," +
//
//
//                "\"Chajli\":\"CJL\"," +
//
//
//                "\"Chinnaganjam\":\"CJM\"," +
//
//
//                "\"Chhatna\":\"CJN\"," +
//
//
//                "\"Chamaraj\":\"CJR\"," +
//
//
//                "\"Charamulakusum\":\"CJS\"," +
//
//
//                "\"Chajawa\":\"CJW\"," +
//
//
//                "\"Chauthkabrwra\":\"CKB\"," +
//
//
//                "\"Charkhidadri\":\"CKD\"," +
//
//
//                "\"Chakdayala\":\"CKDL\"," +
//
//
//                "\"Chokisorath\":\"CKE\"," +
//
//
//                "\"Chalakudi\":\"CKI\"," +
//
//
//                "\"Chakarpur\":\"CKK\"," +
//
//
//                "\"Chikni Road\":\"CKNI\"," +
//
//
//                "\"Chakrod\":\"CKOD\"," +
//
//
//                "\"Chikodi Road\":\"CKR\"," +
//
//
//                "\"Chaksu\":\"CKS\"," +
//
//
//                "\"Chakulia\":\"CKU\"," +
//
//
//                "\"Chakur\":\"CKX\"," +
//
//
//                "\"Kurla Jn.\":\"CLA\"," +
//
//
//                "\"Lokmanyatilakt\":\"CLAT\"," +
//
//
//                "\"Chalala\":\"CLC\"," +
//
//
//                "\"Chandlodiya\":\"CLDY\"," +
//
//
//                "\"Chhulha\":\"CLF\"," +
//
//
//                "\"Kahalgaon\":\"CLG\"," +
//
//
//                "\"Chalgeri\":\"CLI\"," +
//
//
//                "\"Colonelganj\":\"CLJ\"," +
//
//
//                "\"Chilka\":\"CLKA\"," +
//
//
//                "\"Kollidam\":\"CLN\"," +
//
//
//                "\"Chilo\":\"CLO\"," +
//
//
//                "\"Castlerock\":\"CLR\"," +
//
//
//                "\"Chilakalapudi\":\"CLU\"," +
//
//
//                "\"Chiluvur\":\"CLVR\"," +
//
//
//                "\"Cinnamara\":\"CMA\"," +
//
//
//                "\"Chemancheri\":\"CMC\"," +
//
//
//                "\"Chimidipalli\":\"CMDP\"," +
//
//
//                "\"Chamarajapuram\":\"CMJ\"," +
//
//
//                "\"Chamarajanagar\":\"CMNR\"," +
//
//
//                "\"Chaumahla\":\"CMU\"," +
//
//
//                "\"Chimapahad\":\"CMW\"," +
//
//
//                "\"Chamagram\":\"CMX\"," +
//
//
//                "\"Chintamani\":\"CMY\"," +
//
//
//                "\"Chalama\":\"CMZ\"," +
//
//
//                "\"Chanderiya\":\"CNA\"," +
//
//
//                "\"Chinchli\":\"CNC\"," +
//
//
//                "\"Chandur\":\"CND\"," +
//
//
//                "\"Chandimandir\":\"CNDM\"," +
//
//
//                "\"Chandranathpur\":\"CNE\"," +
//
//
//                "\"Chianki\":\"CNF\"," +
//
//
//                "\"Chaunrah\":\"CNH\"," +
//
//
//                "\"Chandok\":\"CNK\"," +
//
//
//                "\"Chandawal\":\"CNL\"," +
//
//
//                "\"Chainpur\":\"CNPR\"," +
//
//
//                "\"Chandar\":\"CNR\"," +
//
//
//                "\"Chuchura\":\"CNS\"," +
//
//
//                "\"Contai Road\":\"CNT\"," +
//
//
//                "\"Kolanalli\":\"CNY\"," +
//
//
//                "\"Kakinada Port\":\"COAX\"," +
//
//
//                "\"Coochbehar\":\"COB\"," +
//
//
//                "\"Chhotagudha\":\"COD\"," +
//
//
//                "\"Chitrod\":\"COE\"," +
//
//
//                "\"Chomunsamod\":\"COM\"," +
//
//
//                "\"Chhotiodai\":\"COO\"," +
//
//
//                "\"Cuddalore Jn.\":\"COT\"," +
//
//
//                "\"Kanpurbgelbk\":\"CPB\"," +
//
//
//                "\"Chinchpada\":\"CPD\"," +
//
//
//                "\"Chhipadohar\":\"CPDR\"," +
//
//
//                "\"Chandiposi\":\"CPE\"," +
//
//
//                "\"Chakarlapalli\":\"CPL\"," +
//
//
//                "\"Chinpal\":\"CPLE\"," +
//
//
//                "\"Champanerrd Jn.\":\"CPN\"," +
//
//
//                "\"Chipurupalle\":\"CPP\"," +
//
//
//                "\"Chandsiau\":\"CPS\"," +
//
//
//                "\"Channapatna\":\"CPT\"," +
//
//
//                "\"Charkhari Road\":\"CRC\"," +
//
//
//                "\"Chaurakheri\":\"CRKR\"," +
//
//
//                "\"Choral\":\"CRL\"," +
//
//
//                "\"Charegaon\":\"CRN\"," +
//
//
//                "\"Chautara\":\"CROA\"," +
//
//
//                "\"Karagola Road\":\"CRR\"," +
//
//
//                "\"Charaud\":\"CRW\"," +
//
//
//                "\"Chirawa\":\"CRWA\"," +
//
//
//                "\"Chirayinkil\":\"CRY\"," +
//
//
//                "\"Chausa\":\"CSA\"," +
//
//
//                "\"Channasandra\":\"CSDR\"," +
//
//
//                "\"Chosla\":\"CSL\"," +
//
//
//                "\"Cansaulim\":\"CSM\"," +
//
//
//                "\"Cossimbazar\":\"CSZ\"," +
//
//
//                "\"Chittapur\":\"CT\"," +
//
//
//                "\"Chitradurg\":\"CTA\"," +
//
//
//                "\"Chhitauni\":\"CTE\"," +
//
//
//                "\"Chitgidda\":\"CTF\"," +
//
//
//                "\"Chikalthan\":\"CTH\"," +
//
//
//                "\"Chitahra\":\"CTHR\"," +
//
//
//                "\"Chotikhatu\":\"CTKT\"," +
//
//
//                "\"Chital\":\"CTL\"," +
//
//
//                "\"Chettinad\":\"CTND\"," +
//
//
//                "\"Chetar\":\"CTQ\"," +
//
//
//                "\"Chatra\":\"CTR\"," +
//
//
//                "\"Chitrawad\":\"CTRD\"," +
//
//
//                "\"Chattriput\":\"CTS\"," +
//
//
//                "\"Chitrasani\":\"CTT\"," +
//
//
//                "\"Chintaparti\":\"CTY\"," +
//
//
//                "\"Chityala\":\"CTYL\"," +
//
//
//                "\"Chagallu\":\"CU\"," +
//
//
//                "\"Tiruppappuliyur\":\"CUD\"," +
//
//
//                "\"Churk\":\"CUK\"," +
//
//
//                "\"Chuli\":\"CUL\"," +
//
//
//                "\"Chaura\":\"CUX\"," +
//
//
//                "\"Cavalrybarrcks\":\"CVB\"," +
//
//
//                "\"Chavaj\":\"CVJ\"," +
//
//
//                "\"Kovilpatti\":\"CVP\"," +
//
//
//                "\"Chorvad Road\":\"CVR\"," +
//
//
//                "\"Chainwa\":\"CW\"," +
//
//
//                "\"Chhindwara Jn.\":\"CWA\"," +
//
//
//                "\"Chondi\":\"CWI\"," +
//
//
//                "\"Cheriyanad\":\"CYN\"," +
//
//
//                "\"Charni Rd\":\"CYR\"," +
//
//
//                "\"Datia\":\"DAA\"," +
//
//
//                "\"Dhaban\":\"DABN\"," +
//
//
//                "\"Devargudda\":\"DAD\"," +
//
//
//                "\"Duroji\":\"DAJ\"," +
//
//
//                "\"Dakhineswar\":\"DAKE\"," +
//
//
//                "\"Daliganj\":\"DAL\"," +
//
//
//                "\"Dhamora\":\"DAM\"," +
//
//
//                "\"Dhaneta\":\"DAN\"," +
//
//
//                "\"Daghora\":\"DAO\"," +
//
//
//                "\"Dagmagpur\":\"DAP\"," +
//
//
//                "\"Dapodi\":\"DAPD\"," +
//
//
//                "\"Danwar\":\"DAR\"," +
//
//
//                "\"Dara\":\"DARA\"," +
//
//
//                "\"Dhari Jn.\":\"DARI\"," +
//
//
//                "\"Dagru\":\"DAU\"," +
//
//
//                "\"Devalgaonauchr\":\"DAV\"," +
//
//
//                "\"Dhanuvachapuram\":\"DAVM\"," +
//
//
//                "\"Delhi azadpur\":\"DAZ\"," +
//
//
//                "\"Dabhoi Jn.\":\"DB\"," +
//
//
//                "\"Dabra\":\"DBA\"," +
//
//
//                "\"Dhubri\":\"DBB\"," +
//
//
//                "\"Deoband\":\"DBD\"," +
//
//
//                "\"Devbalodachrda\":\"DBEC\"," +
//
//
//                "\"Dobhbahali\":\"DBHL\"," +
//
//
//                "\"Dablirathan\":\"DBI\"," +
//
//
//                "\"Dabka\":\"DBKA\"," +
//
//
//                "\"Dodbele\":\"DBL\"," +
//
//
//                "\"Dabla\":\"DBLA\"," +
//
//
//                "\"Dabolim\":\"DBM\"," +
//
//
//                "\"Dabhoda\":\"DBO\"," +
//
//
//                "\"Debipur\":\"DBP\"," +
//
//
//                "\"Dabhaura\":\"DBR\"," +
//
//
//                "\"Dodballapur\":\"DBU\"," +
//
//
//                "\"Dabilpur\":\"DBV\"," +
//
//
//                "\"Dubia\":\"DBW\"," +
//
//
//                "\"Digboi\":\"DBY\"," +
//
//
//                "\"Dhandhuka\":\"DCK\"," +
//
//
//                "\"Damalcheruvu\":\"DCU\"," +
//
//
//                "\"Duraundha Jn.\":\"DDA\"," +
//
//
//                "\"Dumdum Cant.\":\"DDC\"," +
//
//
//                "\"Dundi\":\"DDCE\"," +
//
//
//                "\"Dondaicha\":\"DDE\"," +
//
//
//                "\"Dumdum\":\"DDJ\"," +
//
//
//                "\"Dhindsa\":\"DDK\"," +
//
//
//                "\"Dhandarikalan\":\"DDL\"," +
//
//
//                "\"Damdim\":\"DDM\"," +
//
//
//                "\"Daudpur\":\"DDP\"," +
//
//
//                "\"Dadar\":\"DDR\"," +
//
//
//                "\"Dudhsagar\":\"DDS\"," +
//
//
//                "\"Dudwa\":\"DDW\"," +
//
//
//                "\"Dudwindi\":\"DDY\"," +
//
//
//                "\"Delhi Cantt\":\"DEC\"," +
//
//
//                "\"Debagram\":\"DEB\"," +
//
//
//                "\"Dandeli\":\"DED\"," +
//
//
//                "\"Delang\":\"DEG\"," +
//
//
//                "\"Dehu Road\":\"DEHR\"," +
//
//
//                "\"Denduluru\":\"DEL\"," +
//
//
//                "\"Deorakot\":\"DELO\"," +
//
//
//                "\"Demu\":\"DEMU\"," +
//
//
//                "\"Diyodar\":\"DEOR\"," +
//
//
//                "\"Depalsar\":\"DEP\"," +
//
//
//                "\"Dadri\":\"DER\"," +
//
//
//                "\"Desari\":\"DES\"," +
//
//
//                "\"Devarayi\":\"DEV\"," +
//
//
//                "\"Dewalgaon\":\"DEW\"," +
//
//
//                "\"Deogan Road\":\"DFR\"," +
//
//
//                "\"Dighwara\":\"DGA\"," +
//
//
//                "\"Durgadagate\":\"DGDG\"," +
//
//
//                "\"Digha Flag Station\":\"DGHA\"," +
//
//
//                "\"Dungri\":\"DGI\"," +
//
//
//                "\"Dungar Jn.\":\"DGJ\"," +
//
//
//                "\"Dhulianganga\":\"DGLE\"," +
//
//
//                "\"Dongargaon\":\"DGN\"," +
//
//
//                "\"Dhenglippgoan\":\"DGPP\"," +
//
//
//                "\"Dugdol\":\"DGQ\"," +
//
//
//                "\"Dagori\":\"DGS\"," +
//
//
//                "\"Dhulghat\":\"DGT\"," +
//
//
//                "\"Digaru\":\"DGU\"," +
//
//
//                "\"Dheena\":\"DHA\"," +
//
//
//                "\"Dhule\":\"DHI\"," +
//
//
//                "\"Dhinoj\":\"DHJ\"," +
//
//
//                "\"Dhodakhedi\":\"DHKR\"," +
//
//
//                "\"Dadhalinam\":\"DHM\"," +
//
//
//                "\"Dholamazra\":\"DHMZ\"," +
//
//
//                "\"Dhinda\":\"DHND\"," +
//
//
//                "\"Dhanala\":\"DHNL\"," +
//
//
//                "\"Dichpalli\":\"DHP\"," +
//
//
//                "\"Dappar\":\"DHPR\"," +
//
//
//                "\"Dharnaoda\":\"DHR\"," +
//
//
//                "\"Dhirganj\":\"DHRJ\"," +
//
//
//                "\"Dhirera\":\"DHRR\"," +
//
//
//                "\"Dhavalas\":\"DHS\"," +
//
//
//                "\"Dhubulia\":\"DHU\"," +
//
//
//                "\"Dhanawalawada\":\"DHVR\"," +
//
//
//                "\"Dhariwal\":\"DHW\"," +
//
//
//                "\"Dombivili\":\"DI\"," +
//
//
//                "\"Didwana\":\"DIA\"," +
//
//
//                "\"Dibai\":\"DIB\"," +
//
//
//                "\"Dahisar\":\"DIC\"," +
//
//
//                "\"Duggirala\":\"DIG\"," +
//
//
//                "\"Dharuadihi\":\"DIH\"," +
//
//
//                "\"Dilawarnagar\":\"DIL\"," +
//
//
//                "\"Ding\":\"DING\"," +
//
//
//                "\"Divinenagar\":\"DINR\"," +
//
//
//                "\"Dipa\":\"DIPA\"," +
//
//
//                "\"Dinagaon\":\"DIQ\"," +
//
//
//                "\"Dhanapurorissa\":\"DIR\"," +
//
//
//                "\"Disa\":\"DISA\"," +
//
//
//                "\"Dohrighat\":\"DIT\"," +
//
//
//                "\"Diva\":\"DIVA\"," +
//
//
//                "\"Dhilwan\":\"DIW\"," +
//
//
//                "\"Darjeeling\":\"DJ\"," +
//
//
//                "\"Duliajan\":\"DJG\"," +
//
//
//                "\"Dhoraji\":\"DJI\"," +
//
//
//                "\"Daijar\":\"DJJ\"," +
//
//
//                "\"Dolajikakhera\":\"DJKR\"," +
//
//
//                "\"Dakor\":\"DK\"," +
//
//
//                "\"Dankuni\":\"DKAE\"," +
//
//
//                "\"Daharkabalaji\":\"DKBJ\"," +
//
//
//                "\"Donakonda\":\"DKD\"," +
//
//
//                "\"Dankaur\":\"DKDE\"," +
//
//
//                "\"Dhekiajili Road\":\"DKJR\"," +
//
//
//                "\"Doikallu\":\"DKLU\"," +
//
//
//                "\"Dakaniyatalav\":\"DKNT\"," +
//
//
//                "\"Devakottai Road\":\"DKO\"," +
//
//
//                "\"Dekapam\":\"DKPM\"," +
//
//
//                "\"Darekasa\":\"DKS\"," +
//
//
//                "\"Dhulkot\":\"DKT\"," +
//
//
//                "\"Dhanakwada\":\"DKW\"," +
//
//
//                "\"Dokwa\":\"DKWA\"," +
//
//
//                "\"Dudhwakhara\":\"DKX\"," +
//
//
//                "\"Delhi Kishanganj\":\"DKZ\"," +
//
//
//                "\"Daladi\":\"DL\"," +
//
//
//                "\"Daulatabad\":\"DLB\"," +
//
//
//                "\"Dalmera\":\"DLC\"," +
//
//
//                "\"Dalauda\":\"DLD\"," +
//
//
//                "\"Dhalgaon\":\"DLGN\"," +
//
//
//                "\"Dalkolha\":\"DLK\"," +
//
//
//                "\"Dhelana\":\"DLNA\"," +
//
//
//                "\"Dalpatpur\":\"DLP\"," +
//
//
//                "\"Dayalpur\":\"DLPR\"," +
//
//
//                "\"Dalelnagar\":\"DLQ\"," +
//
//
//                "\"Dullahapur\":\"DLR\"," +
//
//
//                "\"Dilwa\":\"DLW\"," +
//
//
//                "\"Dimow\":\"DM\"," +
//
//
//                "\"Damodar Jn.\":\"DMA\"," +
//
//
//                "\"Dumribihar\":\"DMBR\"," +
//
//
//                "\"Dhemaji\":\"DMC\"," +
//
//
//                "\"Damnagar\":\"DME\"," +
//
//
//                "\"Domingarh\":\"DMG\"," +
//
//
//                "\"Daurammadhpura\":\"DMH\"," +
//
//
//                "\"Dilmili\":\"DMK\"," +
//
//
//                "\"Dumurdaha\":\"DMLE\"," +
//
//
//                "\"Dharmpurhmchl\":\"DMP\"," +
//
//
//                "\"Dharampur\":\"DMPR\"," +
//
//
//                "\"Dharmanagar\":\"DMR\"," +
//
//
//                "\"Diguvametta\":\"DMT\"," +
//
//
//                "\"Dalmau Jn.\":\"DMW\"," +
//
//
//                "\"Dhanari\":\"DN\"," +
//
//
//                "\"Degana Jn.\":\"DNA\"," +
//
//
//                "\"Dandupur\":\"DND\"," +
//
//
//                "\"Dhondi\":\"DNDI\"," +
//
//
//                "\"Dhamni\":\"DNE\"," +
//
//
//                "\"Danea\":\"DNEA\"," +
//
//
//                "\"Dhindhorahkmkd\":\"DNHK\"," +
//
//
//                "\"Dhanakya\":\"DNK\"," +
//
//
//                "\"Dhenkanal\":\"DNKL\"," +
//
//
//                "\"Dhanoli\":\"DNL\"," +
//
//
//                "\"Dhanmandal\":\"DNM\"," +
//
//
//                "\"Dinanagar\":\"DNN\"," +
//
//
//                "\"Dhandhera\":\"DNRA\"," +
//
//
//                "\"Dhanauri\":\"DNRE\"," +
//
//
//                "\"Dantan\":\"DNT\"," +
//
//
//                "\"Donkinavalasa\":\"DNV\"," +
//
//
//                "\"Dangarwa\":\"DNW\"," +
//
//
//                "\"Dhanori\":\"DNZ\"," +
//
//
//                "\"Dausa\":\"DO\"," +
//
//
//                "\"Doraha\":\"DOA\"," +
//
//
//                "\"Dundlodmkdgrh\":\"DOB\"," +
//
//
//                "\"Dhodhar\":\"DOD\"," +
//
//
//                "\"Deori\":\"DOE\"," +
//
//
//                "\"Donigal\":\"DOG\"," +
//
//
//                "\"Dhodramohar\":\"DOH\"," +
//
//
//                "\"Devgarhmadriya\":\"DOHM\"," +
//
//
//                "\"Dholka\":\"DOK\"," +
//
//
//                "\"Dholi\":\"DOL\"," +
//
//
//                "\"Dundara\":\"DOR\"," +
//
//
//                "\"Daurai\":\"DOZ\"," +
//
//
//                "\"Durgapura\":\"DPA\"," +
//
//
//                "\"Darliput\":\"DPC\"," +
//
//
//                "\"Dosapadu\":\"DPD\"," +
//
//
//                "\"Dabpal\":\"DPF\"," +
//
//
//                "\"Dadhapara\":\"DPH\"," +
//
//
//                "\"Danauliphlwria\":\"DPL\"," +
//
//
//                "\"Diplana\":\"DPLN\"," +
//
//
//                "\"Dhirpur\":\"DPP\"," +
//
//
//                "\"Dhampur\":\"DPR\"," +
//
//
//                "\"Diphu\":\"DPU\"," +
//
//
//                "\"Dadpur\":\"DPX\"," +
//
//
//                "\"Devpura\":\"DPZ\"," +
//
//
//                "\"Dhupguri\":\"DQG\"," +
//
//
//                "\"Dhalaibil\":\"DQL\"," +
//
//
//                "\"Dhanera\":\"DQN\"," +
//
//
//                "\"Debari\":\"DRB\"," +
//
//
//                "\"Daraganj\":\"DRGJ\"," +
//
//
//                "\"Dharhara\":\"DRH\"," +
//
//
//                "\"Derol\":\"DRL\"," +
//
//
//                "\"Daurala\":\"DRLA\"," +
//
//
//                "\"Daryaogonj\":\"DRO\"," +
//
//
//                "\"Dhareshwar\":\"DRS\"," +
//
//
//                "\"Dhurwasin\":\"DRSN\"," +
//
//
//                "\"Dasharathpur\":\"DRTP\"," +
//
//
//                "\"Kadur\":\"DRU\"," +
//
//
//                "\"Dharewada\":\"DRW\"," +
//
//
//                "\"Derowanp.h.\":\"DRWN\"," +
//
//
//                "\"Dallirajhara\":\"DRZ\"," +
//
//
//                "\"Dasna\":\"DS\"," +
//
//
//                "\"Sadarbazar\":\"DSB\"," +
//
//
//                "\"Dosvada\":\"DSD\"," +
//
//
//                "\"Delhi Safdarjng\":\"DSJ\"," +
//
//
//                "\"Duskheda\":\"DSK\"," +
//
//
//                "\"Deswal\":\"DSL\"," +
//
//
//                "\"Deshalpar\":\"DSLP\"," +
//
//
//                "\"Darasuram\":\"DSM\"," +
//
//
//                "\"Dausni\":\"DSNI\"," +
//
//
//                "\"Deshnok\":\"DSO\"," +
//
//
//                "\"Dalsinghsarai\":\"DSS\"," +
//
//
//                "\"Dhatrigram\":\"DTAE\"," +
//
//
//                "\"Ditokcherra\":\"DTC\"," +
//
//
//                "\"Detroj\":\"DTJ\"," +
//
//
//                "\"Darritola\":\"DTL\"," +
//
//
//                "\"Dhamtari\":\"DTR\"," +
//
//
//                "\"Dhutra\":\"DTV\"," +
//
//
//                "\"Dhaura\":\"DUA\"," +
//
//
//                "\"Dabtara\":\"DUB\"," +
//
//
//                "\"Dubaha\":\"DUBH\"," +
//
//
//                "\"Dudhani\":\"DUD\"," +
//
//
//                "\"Dubrajpur\":\"DUJ\"," +
//
//
//                "\"Duganpur\":\"DUN\"," +
//
//
//                "\"Desur\":\"DUR\"," +
//
//
//                "\"Dumraon\":\"DURE\"," +
//
//
//                "\"Dulrasar\":\"DUS\"," +
//
//
//                "\"Dusi\":\"DUSI\"," +
//
//
//                "\"Dumduma Town\":\"DUT\"," +
//
//
//                "\"Delvada\":\"DVA\"," +
//
//
//                "\"Duvvada\":\"DVD\"," +
//
//
//                "\"Devgam\":\"DVGM\"," +
//
//
//                "\"Doravartchtram\":\"DVR\"," +
//
//
//                "\"Devaliya\":\"DVY\"," +
//
//
//                "\"Dailwara\":\"DWA\"," +
//
//
//                "\"Dhekvad\":\"DWD\"," +
//
//
//                "\"Dewanganj\":\"DWG\"," +
//
//
//                "\"Dingwahi\":\"DWI\"," +
//
//
//                "\"Dwarkaganj\":\"DWJ\"," +
//
//
//                "\"Diwana\":\"DWNA\"," +
//
//
//                "\"Doiwala\":\"DWO\"," +
//
//
//                "\"Dwarapudi\":\"DWP\"," +
//
//
//                "\"Diwankhavati\":\"DWV\"," +
//
//
//                "\"Dewas\":\"DWX\"," +
//
//
//                "\"Dantewara\":\"DWZ\"," +
//
//
//                "\"Digod\":\"DXD\"," +
//
//
//                "\"Dharangaon\":\"DXG\"," +
//
//
//                "\"Duhai\":\"DXH\"," +
//
//
//                "\"Dhanakherli\":\"DXK\"," +
//
//
//                "\"Duddhinagar\":\"DXN\"," +
//
//
//                "\"Digsar\":\"DXR\"," +
//
//
//                "\"Dumariya\":\"DY\"," +
//
//
//                "\"Daryabad\":\"DYD\"," +
//
//
//                "\"Dudhia Khurd\":\"DYK\"," +
//
//
//                "\"Daryapur\":\"DYP\"," +
//
//
//                "\"Dasuya\":\"DZA\"," +
//
//
//                "\"Dahinazainabad\":\"DZB\"," +
//
//
//                "\"Durgachak Town\":\"DZKT\"," +
//
//
//                "\"Edduladoddi\":\"EDD\"," +
//
//
//                "\"Edamann\":\"EDN\"," +
//
//
//                "\"Ekchari\":\"EKC\"," +
//
//
//                "\"Ekambarakuppam\":\"EKM\"," +
//
//
//                "\"Ezhukone\":\"EKN\"," +
//
//
//                "\"Elamanur\":\"EL\"," +
//
//
//                "\"Elimala\":\"ELM\"," +
//
//
//                "\"Achalpur\":\"ELP\"," +
//
//
//                "\"Ekma\":\"EM\"," +
//
//
//                "\"Isand\":\"EN\"," +
//
//
//                "\"Ellenabad\":\"ENB\"," +
//
//
//                "\"Elphinston Road\":\"EPR\"," +
//
//
//                "\"Erich Road\":\"ERC\"," +
//
//
//                "\"Eraniel\":\"ERL\"," +
//
//
//                "\"Etah\":\"ETAH\"," +
//
//
//                "\"Ettumanur\":\"ETM\"," +
//
//
//                "\"Etmadpur\":\"ETUE\"," +
//
//
//                "\"Edavai\":\"EVA\"," +
//
//
//                "\"Falna\":\"FA\"," +
//
//
//                "\"Fatehnagar\":\"FAN\"," +
//
//
//                "\"Farrukhabad\":\"FBD\"," +
//
//
//                "\"Faridkot\":\"FDK\"," +
//
//
//                "\"Fatehgarh\":\"FGR\"," +
//
//
//                "\"Fatehgarhsahib\":\"FGSB\"," +
//
//
//                "\"Ferok\":\"FK\"," +
//
//
//                "\"Fakhrabad\":\"FKB\"," +
//
//
//                "\"Farakka\":\"FKK\"," +
//
//
//                "\"Fakiragram Jn.\":\"FKM\"," +
//
//
//                "\"Phulad\":\"FLD\"," +
//
//
//                "\"Falakata\":\"FLK\"," +
//
//
//                "\"Kcgfalaknuma\":\"FM\"," +
//
//
//                "\"Fatehpurskhwti\":\"FPS\"," +
//
//
//                "\"Farhedi\":\"FRD\"," +
//
//
//                "\"Fatehsinghpura\":\"FSP\"," +
//
//
//                "\"Fursatganj\":\"FTG\"," +
//
//
//                "\"Fatehpursikri\":\"FTS\"," +
//
//
//                "\"Faizullapur\":\"FYZ\"," +
//
//
//                "\"Fazalpur\":\"FZL\"," +
//
//
//                "\"Gudha\":\"GA\"," +
//
//
//                "\"Galan\":\"GAA\"," +
//
//
//                "\"Gevra Road\":\"GAD\"," +
//
//
//                "\"Gaipura\":\"GAE\"," +
//
//
//                "\"Gangaghat\":\"GAG\"," +
//
//
//                "\"Galgalia\":\"GAGA\"," +
//
//
//                "\"Ganeshganj\":\"GAJ\"," +
//
//
//                "\"Gajarabahara\":\"GAJB\"," +
//
//
//                "\"Gunadala\":\"GALA\"," +
//
//
//                "\"Gankar\":\"GALE\"," +
//
//
//                "\"Ganjam\":\"GAM\"," +
//
//
//                "\"Gogameri\":\"GAMI\"," +
//
//
//                "\"Gangaganj\":\"GANG\"," +
//
//
//                "\"Ghanauli\":\"GANL\"," +
//
//
//                "\"Gurpa\":\"GAP\"," +
//
//
//                "\"Gadarwara\":\"GAR\"," +
//
//
//                "\"Gavadaka\":\"GAV\"," +
//
//
//                "\"Gainjahwa\":\"GAW\"," +
//
//
//                "\"Gauribazar\":\"GB\"," +
//
//
//                "\"Garhbeta\":\"GBA\"," +
//
//
//                "\"Gubbi\":\"GBB\"," +
//
//
//                "\"Gauribidanur\":\"GBD\"," +
//
//
//                "\"Gayabari\":\"GBE\"," +
//
//
//                "\"Gulabpura\":\"GBP\"," +
//
//
//                "\"Gachhipura\":\"GCH\"," +
//
//
//                "\"Ghazipur City\":\"GCT\"," +
//
//
//                "\"Giddarbaha\":\"GDB\"," +
//
//
//                "\"Gadra Road\":\"GDD\"," +
//
//
//                "\"Garladinne\":\"GDE\"," +
//
//
//                "\"Godha\":\"GDHA\"," +
//
//
//                "\"Gudgeri\":\"GDI\"," +
//
//
//                "\"Gondal\":\"GDL\"," +
//
//
//                "\"Gudma\":\"GDM\"," +
//
//
//                "\"Gudupulli\":\"GDP\"," +
//
//
//                "\"Gpochampalli\":\"GDPL\"," +
//
//
//                "\"Gudaparti\":\"GDPT\"," +
//
//
//                "\"Gudivada Jn.\":\"GDVX\"," +
//
//
//                "\"Ghoksadanga\":\"GDX\"," +
//
//
//                "\"Ghoradongri\":\"GDYA\"," +
//
//
//                "\"Gundardehi\":\"GDZ\"," +
//
//
//                "\"Nagar\":\"GE\"," +
//
//
//                "\"Ghatera\":\"GEA\"," +
//
//
//                "\"Guledagudda Rd\":\"GED\"," +
//
//
//                "\"Girgadhara\":\"GEG\"," +
//
//
//                "\"Geratpur\":\"GER\"," +
//
//
//                "\"Gandhigram\":\"GG\"," +
//
//
//                "\"Ghoga\":\"GGA\"," +
//
//
//                "\"Gangadhara\":\"GGAR\"," +
//
//
//                "\"Garhmuktesarbr\":\"GGB\"," +
//
//
//                "\"Gullaguda\":\"GGD\"," +
//
//
//                "\"Goshainganj\":\"GGJ\"," +
//
//
//                "\"Goraghuma\":\"GGM\"," +
//
//
//                "\"Gurgaon\":\"GGN\"," +
//
//
//                "\"Goramghat\":\"GGO\"," +
//
//
//                "\"Ghugus\":\"GGS\"," +
//
//
//                "\"Ghunghuti\":\"GGT\"," +
//
//
//                "\"Ghughuli\":\"GH\"," +
//
//
//                "\"Ghagghar\":\"GHG\"," +
//
//
//                "\"Ghagwal\":\"GHGL\"," +
//
//
//                "\"Garhiharsaru\":\"GHH\"," +
//
//
//                "\"Gursahaiganj\":\"GHJ\"," +
//
//
//                "\"Gadadharpur\":\"GHLE\"," +
//
//
//                "\"Gohana\":\"GHNA\"," +
//
//
//                "\"Ghantikhalndpr\":\"GHNH\"," +
//
//
//                "\"Garhwa\":\"GHQ\"," +
//
//
//                "\"Gidhaur\":\"GHR\"," +
//
//
//                "\"Ghum\":\"GHUM\"," +
//
//
//                "\"Garhara\":\"GHX\"," +
//
//
//                "\"Giddalur\":\"GID\"," +
//
//
//                "\"Gidni\":\"GII\"," +
//
//
//                "\"Gandhidhambg\":\"GIMB\"," +
//
//
//                "\"Ginigera\":\"GIN\"," +
//
//
//                "\"Goriyan\":\"GIO\"," +
//
//
//                "\"Gainsari Jn\":\"GIR\"," +
//
//
//                "\"Gidam\":\"GIZ\"," +
//
//
//                "\"Gangajhari\":\"GJ\"," +
//
//
//                "\"Gujhandi\":\"GJD\"," +
//
//
//                "\"Gajjelakonda\":\"GJJ\"," +
//
//
//                "\"Ganjmuradabad\":\"GJMB\"," +
//
//
//                "\"Gangsarjaitu\":\"GJUT\"," +
//
//
//                "\"Ghatakavarana\":\"GKB\"," +
//
//
//                "\"Gorakhpur Cant.\":\"GKC\"," +
//
//
//                "\"Gadhakda\":\"GKD\"," +
//
//
//                "\"Guskara\":\"GKH\"," +
//
//
//                "\"Gokak Road\":\"GKK\"," +
//
//
//                "\"Gundalukamma\":\"GKM\"," +
//
//
//                "\"Ghaikalan\":\"GKX\"," +
//
//
//                "\"Gorakhpur City\":\"GKY\"," +
//
//
//                "\"Nagal\":\"GL\"," +
//
//
//                "\"Garla\":\"GLA\"," +
//
//
//                "\"Gulabhganj\":\"GLG\"," +
//
//
//                "\"Golaghat\":\"GLGT\"," +
//
//
//                "\"Gulaothi\":\"GLH\"," +
//
//
//                "\"Gollaprolu\":\"GLP\"," +
//
//
//                "\"Gullipadu\":\"GLU\"," +
//
//
//                "\"Gollapally\":\"GLY\"," +
//
//
//                "\"Goregaon\":\"GM\"," +
//
//
//                "\"Gumani\":\"GMAN\"," +
//
//
//                "\"Guramkhedi\":\"GMD\"," +
//
//
//                "\"Gumada\":\"GMDA\"," +
//
//
//                "\"Girimaidan\":\"GMDN\"," +
//
//
//                "\"Gamharia\":\"GMH\"," +
//
//
//                "\"Gumia\":\"GMIA\"," +
//
//
//                "\"Gumman\":\"GMM\"," +
//
//
//                "\"Gahmar\":\"GMR\"," +
//
//
//                "\"Garhmuktesar\":\"GMS\"," +
//
//
//                "\"Gauriyamau\":\"GMU\"," +
//
//
//                "\"Gurmura\":\"GMX\"," +
//
//
//                "\"Goneana\":\"GNA\"," +
//
//
//                "\"Gandhinagarcap\":\"GNC\"," +
//
//
//                "\"Govindgarhmalk\":\"GND\"," +
//
//
//                "\"Gauriganj\":\"GNG\"," +
//
//
//                "\"Gangadharpur\":\"GNGD\"," +
//
//
//                "\"Gangatolia\":\"GNGT\"," +
//
//
//                "\"Gangakher\":\"GNH\"," +
//
//
//                "\"Gunji\":\"GNJ\"," +
//
//
//                "\"Gangani\":\"GNNA\"," +
//
//
//                "\"Goregaon Road\":\"GNO\"," +
//
//
//                "\"Ghanpur\":\"GNP\"," +
//
//
//                "\"Gadiganuru\":\"GNR\"," +
//
//
//                "\"Ghonsor\":\"GNS\"," +
//
//
//                "\"Ganaur\":\"GNU\"," +
//
//
//                "\"Gangiwara\":\"GNW\"," +
//
//
//                "\"Ponmlaigldrck\":\"GOC\"," +
//
//
//                "\"Gidarpindi\":\"GOD\"," +
//
//
//                "\"Garot\":\"GOH\"," +
//
//
//                "\"Gevrai\":\"GOI\"," +
//
//
//                "\"Gokarna Road\":\"GOK\"," +
//
//
//                "\"Goilkera\":\"GOL\"," +
//
//
//                "\"Gole\":\"GOLE\"," +
//
//
//                "\"Gogamukh\":\"GOM\"," +
//
//
//                "\"Gotegaon\":\"GON\"," +
//
//
//                "\"Gopjam\":\"GOP\"," +
//
//
//                "\"Ghosipura\":\"GOPA\"," +
//
//
//                "\"Gopalganj\":\"GOPG\"," +
//
//
//                "\"Gotan\":\"GOTN\"," +
//
//
//                "\"Govindpuri\":\"GOV\"," +
//
//
//                "\"Govindnagar\":\"GOVR\"," +
//
//
//                "\"Golsar\":\"GOZ\"," +
//
//
//                "\"Rajgangpur\":\"GP\"," +
//
//
//                "\"Guptipara\":\"GPAE\"," +
//
//
//                "\"Ghatprabha\":\"GPB\"," +
//
//
//                "\"Gummidipundi\":\"GPD\"," +
//
//
//                "\"Gauriphanta\":\"GPF\"," +
//
//
//                "\"Garpos\":\"GPH\"," +
//
//
//                "\"Gajapatinagaram\":\"GPI\"," +
//
//
//                "\"Gorapur\":\"GPJ\"," +
//
//
//                "\"Gopalpur\":\"GPPR\"," +
//
//
//                "\"Ghorpuri\":\"GPR\"," +
//
//
//                "\"Gulapalyamu\":\"GPU\"," +
//
//
//                "\"Gautampura Road\":\"GPX\"," +
//
//
//                "\"Gohpur\":\"GPZ\"," +
//
//
//                "\"Gurla\":\"GQL\"," +
//
//
//                "\"Gharaunda\":\"GRA\"," +
//
//
//                "\"Garhdhrubeswar\":\"GRB\"," +
//
//
//                "\"Garudubilli\":\"GRBL\"," +
//
//
//                "\"Giridih\":\"GRD\"," +
//
//
//                "\"Gambhiri Road\":\"GRF\"," +
//
//
//                "\"Guwarighat\":\"GRG\"," +
//
//
//                "\"Ghorasahan\":\"GRH\"," +
//
//
//                "\"Girhadmatiya\":\"GRHM\"," +
//
//
//                "\"Guriya\":\"GRI\"," +
//
//
//                "\"Goraul\":\"GRL\"," +
//
//
//                "\"Garhmau\":\"GRM\"," +
//
//
//                "\"Garhimanikpur\":\"GRMR\"," +
//
//
//                "\"Gurra\":\"GRO\"," +
//
//
//                "\"Gurliramgarhwa\":\"GRRG\"," +
//
//
//                "\"Guraru\":\"GRRU\"," +
//
//
//                "\"Ghorawadi\":\"GRWD\"," +
//
//
//                "\"Gaura\":\"GRX\"," +
//
//
//                "\"Goraya\":\"GRY\"," +
//
//
//                "\"Ghosunda\":\"GSD\"," +
//
//
//                "\"Ghosi\":\"GSI\"," +
//
//
//                "\"Ghaso\":\"GSO\"," +
//
//
//                "\"Gurdaspur\":\"GSP\"," +
//
//
//                "\"Gosalpur\":\"GSPR\"," +
//
//
//                "\"Gursarshnewala\":\"GSW\"," +
//
//
//                "\"Gandhismrak Road\":\"GSX\"," +
//
//
//                "\"Golanthra\":\"GTA\"," +
//
//
//                "\"Gothaj\":\"GTE\"," +
//
//
//                "\"Gumthal\":\"GTF\"," +
//
//
//                "\"Ghutai\":\"GTI\"," +
//
//
//                "\"Getorjagatpura\":\"GTJT\"," +
//
//
//                "\"Ghutku\":\"GTK\"," +
//
//
//                "\"Geritakolvada\":\"GTKD\"," +
//
//
//                "\"Gotlam\":\"GTLM\"," +
//
//
//                "\"Ghatampur\":\"GTM\"," +
//
//
//                "\"Gomtinagar\":\"GTNR\"," +
//
//
//                "\"Grant Road\":\"GTR\"," +
//
//
//                "\"Gomta\":\"GTT\"," +
//
//
//                "\"Ghatnandur\":\"GTU\"," +
//
//
//                "\"Gatora\":\"GTW\"," +
//
//
//                "\"Gothangam\":\"GTX\"," +
//
//
//                "\"Gularbhoj\":\"GUB\"," +
//
//
//                "\"Galudih\":\"GUD\"," +
//
//
//                "\"Guldhar\":\"GUH\"," +
//
//
//                "\"Guler\":\"GULR\"," +
//
//
//                "\"Gummanur\":\"GUM\"," +
//
//
//                "\"Guma\":\"GUMA\"," +
//
//
//                "\"Ganagapur Road\":\"GUR\"," +
//
//
//                "\"Gurhi\":\"GUX\"," +
//
//
//                "\"Gunerubamori\":\"GVB\"," +
//
//
//                "\"Gholvad\":\"GVD\"," +
//
//
//                "\"Govindgarh\":\"GVG\"," +
//
//
//                "\"Garividi\":\"GVI\"," +
//
//
//                "\"Gudlavalleru\":\"GVL\"," +
//
//
//                "\"Govindimarwar\":\"GVMR\"," +
//
//
//                "\"Godavari\":\"GVN\"," +
//
//
//                "\"Goresuar\":\"GVR\"," +
//
//
//                "\"Girwar\":\"GW\"," +
//
//
//                "\"Ganjdundwara\":\"GWA\"," +
//
//
//                "\"Gadwal\":\"GWD\"," +
//
//
//                "\"Gannavaram\":\"GWM\"," +
//
//
//                "\"Gaushala\":\"GWS\"," +
//
//
//                "\"Gowdavalli\":\"GWV\"," +
//
//
//                "\"Gudiyattam\":\"GYM\"," +
//
//
//                "\"Gulzarbagh\":\"GZH\"," +
//
//
//                "\"Gazulapalli\":\"GZL\"," +
//
//
//                "\"Gourmalda\":\"GZM\"," +
//
//
//                "\"Nghaziabad\":\"GZN\"," +
//
//
//                "\"Harwada\":\"HAA\"," +
//
//
//                "\"Harippad\":\"HAD\"," +
//
//
//                "\"Hindaun City\":\"HAN\"," +
//
//
//                "\"Hamirpur Road\":\"HAR\"," +
//
//
//                "\"Hassan\":\"HAS\"," +
//
//
//                "\"Hathuran\":\"HAT\"," +
//
//
//                "\"Hautley\":\"HAY\"," +
//
//
//                "\"Habibwala\":\"HBW\"," +
//
//
//                "\"Harchandpur\":\"HCP\"," +
//
//
//                "\"Harischandrpur\":\"HCR\"," +
//
//
//                "\"Hirnoda\":\"HDA\"," +
//
//
//                "\"Haddinagundu\":\"HDD\"," +
//
//
//                "\"Handiakhas\":\"HDK\"," +
//
//
//                "\"Hodal\":\"HDL\"," +
//
//
//                "\"Haidarnagar\":\"HDN\"," +
//
//
//                "\"Hadapsar\":\"HDP\"," +
//
//
//                "\"Haridaspur\":\"HDS\"," +
//
//
//                "\"Hardua\":\"HDU\"," +
//
//
//                "\"Haldwani\":\"HDW\"," +
//
//
//                "\"Himayatnagar\":\"HEM\"," +
//
//
//                "\"Her\":\"HER\"," +
//
//
//                "\"Haflonghill\":\"HFG\"," +
//
//
//                "\"Hafizpeta\":\"HFZ\"," +
//
//
//                "\"Hotgi\":\"HG\"," +
//
//
//                "\"Haidergarh\":\"HGH\"," +
//
//
//                "\"Hagari\":\"HGI\"," +
//
//
//                "\"Harduaganj\":\"HGJ\"," +
//
//
//                "\"Hemagiri\":\"HGR\"," +
//
//
//                "\"Hinganghat\":\"HGT\"," +
//
//
//                "\"Hooghly\":\"HGY\"," +
//
//
//                "\"Harinagar\":\"HIR\"," +
//
//
//                "\"Hojai\":\"HJI\"," +
//
//
//                "\"Hejjala\":\"HJL\"," +
//
//
//                "\"Hugrajuli\":\"HJLI\"," +
//
//
//                "\"Harangajao\":\"HJO\"," +
//
//
//                "\"Helak\":\"HK\"," +
//
//
//                "\"Hirakud\":\"HKG\"," +
//
//
//                "\"Haranyakheri\":\"HKH\"," +
//
//
//                "\"Harkiakhal\":\"HKL\"," +
//
//
//                "\"Hakimpur\":\"HKP\"," +
//
//
//                "\"Kiwarkhed\":\"HKR\"," +
//
//
//                "\"Holealur\":\"HLAR\"," +
//
//
//                "\"Haldi Road\":\"HLDD\"," +
//
//
//                "\"Haldaur\":\"HLDR\"," +
//
//
//                "\"Hilligrove\":\"HLG\"," +
//
//
//                "\"Holalkere\":\"HLK\"," +
//
//
//                "\"Halakatta\":\"HLKT\"," +
//
//
//                "\"Holenarsipur\":\"HLN\"," +
//
//
//                "\"Halisahar\":\"HLR\"," +
//
//
//                "\"Hadmatiya Jn.\":\"HM\"," +
//
//
//                "\"Hamirgarh\":\"HMG\"," +
//
//
//                "\"Hindumalkote\":\"HMK\"," +
//
//
//                "\"Helem\":\"HML\"," +
//
//
//                "\"Hanumangarh Town\":\"HMO\"," +
//
//
//                "\"Hempur\":\"HMP\"," +
//
//
//                "\"Hamarpur\":\"HMPR\"," +
//
//
//                "\"Hamira\":\"HMR\"," +
//
//
//                "\"Harmuti\":\"HMY\"," +
//
//
//                "\"Hathbandh\":\"HN\"," +
//
//
//                "\"Honnavar\":\"HNA\"," +
//
//
//                "\"Hendegir\":\"HNDR\"," +
//
//
//                "\"Hanakere\":\"HNK\"," +
//
//
//                "\"Hansi\":\"HNS\"," +
//
//
//                "\"Hol\":\"HOL\"," +
//
//
//                "\"Haripur\":\"HP\"," +
//
//
//                "\"Hasanpur Road\":\"HPO\"," +
//
//
//                "\"Hirapur\":\"HPR\"," +
//
//
//                "\"Harri\":\"HRB\"," +
//
//
//                "\"Harsud\":\"HRD\"," +
//
//
//                "\"Hirdagarh\":\"HRG\"," +
//
//
//                "\"Harthala\":\"HRH\"," +
//
//
//                "\"Hardoi\":\"HRI\"," +
//
//
//                "\"Hadmadiya\":\"HRM\"," +
//
//
//                "\"Harauni\":\"HRN\"," +
//
//
//                "\"Hiranagar\":\"HRNR\"," +
//
//
//                "\"Harpalganj\":\"HRPG\"," +
//
//
//                "\"Hathras Jn.\":\"HRS\"," +
//
//
//                "\"Harisinga\":\"HRSN\"," +
//
//
//                "\"Harnaut\":\"HRT\"," +
//
//
//                "\"Harrad\":\"HRV\"," +
//
//
//                "\"Harrawala\":\"HRW\"," +
//
//
//                "\"Hosdurga Road\":\"HSD\"," +
//
//
//                "\"Harsauli\":\"HSI\"," +
//
//
//                "\"Harishanker Road\":\"HSK\"," +
//
//
//                "\"Hisvahal\":\"HSL\"," +
//
//
//                "\"Husainpur\":\"HSQ\"," +
//
//
//                "\"Hoshiarpur\":\"HSX\"," +
//
//
//                "\"Hathras City\":\"HTC\"," +
//
//
//                "\"Hatundi\":\"HTD\"," +
//
//
//                "\"Hathigadh\":\"HTGR\"," +
//
//
//                "\"Hathras Road\":\"HTJ\"," +
//
//
//                "\"Hatkalangda\":\"HTK\"," +
//
//
//                "\"Hatikhali\":\"HTL\"," +
//
//
//                "\"Hatra Road\":\"HTT\"," +
//
//
//                "\"Hathidah Jn.\":\"HTZ\"," +
//
//
//                "\"Holambikalan\":\"HUK\"," +
//
//
//                "\"Halvad\":\"HVD\"," +
//
//
//                "\"Hamsavaram\":\"HVM\"," +
//
//
//                "\"Haveri\":\"HVR\"," +
//
//
//                "\"Hooghly\":\"HYG\"," +
//
//
//                "\"Hadyal\":\"HYL\"," +
//
//
//                "\"Haiaghat\":\"HYT\"," +
//
//
//                "\"Hazaribagh Road\":\"HZD\"," +
//
//
//                "\"Hafizpur\":\"HZR\"," +
//
//
//                "\"Ib\": \"IB\"," +
//
//
//                "\"Indrabil\":\"IBL\"," +
//
//
//                "\"Ichauli\":\"ICL\"," +
//
//
//                "\"Idar\":\"IDAR\"," +
//
//
//                "\"Indargarh\":\"IDG\"," +
//
//
//                "\"Idgahagra Jn.\":\"IDH\"," +
//
//
//                "\"Idalhond\":\"IDJ\"," +
//
//
//                "\"Indalvai\":\"IDL\"," +
//
//
//                "\"Indupalli\":\"IDP\"," +
//
//
//                "\"Indi Road\":\"IDR\"," +
//
//
//                "\"Inchhapuri\":\"IHP\"," +
//
//
//                "\"Irinjalakuda\":\"IJK\"," +
//
//
//                "\"Ikkar\":\"IKK\"," +
//
//
//                "\"Iklehra\":\"IKR\"," +
//
//
//                "\"Silsiman\":\"ILA\"," +
//
//
//                "\"Indore Jn. MG\":\"INDM\"," +
//
//
//                "\"Innanje\":\"INJ\"," +
//
//
//                "\"Indapur\":\"INP\"," +
//
//
//                "\"Idappalli\":\"IPL\"," +
//
//
//                "\"Ichchpuram\":\"IPM\"," +
//
//
//                "\"Ipurupalem\":\"IPPM\"," +
//
//
//                "\"Iqbalpur\":\"IQB\"," +
//
//
//                "\"Iqbalgadh\":\"IQG\"," +
//
//
//                "\"Iravipuram\":\"IRP\"," +
//
//
//                "\"Isarda\":\"ISA\"," +
//
//
//                "\"Isarwara\":\"ISH\"," +
//
//
//                "\"Ismailaharyana\":\"ISM\"," +
//
//
//                "\"Itola\":\"ITA\"," +
//
//
//                "\"Intiyathok\":\"ITE\"," +
//
//
//                "\"Itwari\":\"ITR\"," +
//
//
//                "\"Izzatnagar\":\"IZN\"," +
//
//
//                "\"Jaliya\":\"JA\"," +
//
//
//                "\"Jhalida\":\"JAA\"," +
//
//
//                "\"Yamunabdgagra\":\"JAB\"," +
//
//
//                "\"Jalsu\":\"JAC\"," +
//
//
//                "\"Jalsunanak\":\"JACN\"," +
//
//
//                "\"Jadar\":\"JADR\"," +
//
//
//                "\"Jais\":\"JAIS\"," +
//
//
//                "\"Jawali\":\"JAL\"," +
//
//
//                "\"Jaliyadevani\":\"JALD\"," +
//
//
//                "\"Jarangdih\":\"JAN\"," +
//
//
//                "\"Jaora\":\"JAO\"," +
//
//
//                "\"Jandrapeta\":\"JAQ\"," +
//
//
//                "\"Jari\":\"JARI\"," +
//
//
//                "\"Jarwa\":\"JAW\"," +
//
//
//                "\"Jambur\":\"JBB\"," +
//
//
//                "\"Jungbahadurgnj\":\"JBG\"," +
//
//
//                "\"Jgmblakshnprm\":\"JBK\"," +
//
//
//                "\"Jabli\":\"JBL\"," +
//
//
//                "\"Jabri\":\"JBX\"," +
//
//
//                "\"Jethachndan\":\"JCH\"," +
//
//
//                "\"Jadcherla\":\"JCL\"," +
//
//
//                "\"Junichavand\":\"JCN\"," +
//
//
//                "\"Jagdalpur\":\"JDB\"," +
//
//
//                "\"Jamjodhpur Jn.\":\"JDH\"," +
//
//
//                "\"Jharradih\":\"JDI\"," +
//
//
//                "\"Jagdevwala\":\"JDL\"," +
//
//
//                "\"Jagudan\":\"JDN\"," +
//
//
//                "\"Jogindrnagaroa\":\"JDNA\"," +
//
//
//                "\"Jogindernagar\":\"JDNX\"," +
//
//
//                "\"Jiwdhara\":\"JDR\"," +
//
//
//                "\"Jarudanaraa\":\"JDW\"," +
//
//
//                "\"Jenapur\":\"JEN\"," +
//
//
//                "\"Jeonathpur\":\"JEP\"," +
//
//
//                "\"Jaleswar\":\"JER\"," +
//
//
//                "\"Jaitsar\":\"JES\"," +
//
//
//                "\"Jeur\":\"JEUR\"," +
//
//
//                "\"Jagadishpur\":\"JGD\"," +
//
//
//                "\"Jgnthtmplgte\":\"JGE\"," +
//
//
//                "\"Jogidih\":\"JGF\"," +
//
//
//                "\"Jhagadiya Jn.\":\"JGI\"," +
//
//
//                "\"Jagesharganj\":\"JGJ\"," +
//
//
//                "\"Jagraon\":\"JGN\"," +
//
//
//                "\"Jaswantnagar\":\"JGR\"," +
//
//
//                "\"Jogiwala\":\"JGW\"," +
//
//
//                "\"Jakhaura\":\"JHA\"," +
//
//
//                "\"Jhar\":\"JHAR\"," +
//
//
//                "\"Jehanabad\":\"JHD\"," +
//
//
//                "\"Jhingura\":\"JHG\"," +
//
//
//                "\"Jhimri\":\"JHMR\"," +
//
//
//                "\"Jakhim\":\"JHN\"," +
//                "\"Jhalawar Road\":\"JHW\"," +
//
//                "\"Jigna\":\"JIA\"," +
//
//
//                "\"Jagi Road\":\"JID\"," +
//
//
//                "\"Jalila Road\":\"JIL\"," +
//
//
//                "\"Jira Road\":\"JIR\"," +
//
//
//                "\"Jirat\":\"JIT\"," +
//
//
//                "\"Jiaganj\":\"JJG\"," +
//
//
//                "\"Jhinjhak\":\"JJK\"," +
//
//
//                "\"Jhunjhunun\":\"JJN\"," +
//
//
//                "\"Jhanjharpur\":\"JJP\"," +
//
//
//                "\"Jejuri\":\"JJR\"," +
//
//
//                "\"Jakhvada\":\"JKA\"," +
//
//
//                "\"Jukehi\":\"JKE\"," +
//
//
//                "\"Jahanikhera\":\"JKH\"," +
//
//
//                "\"Jankampet Jn.\":\"JKM\"," +
//
//
//                "\"Jakhanian\":\"JKN\"," +
//
//
//                "\"Jakhapura\":\"JKPR\"," +
//
//
//                "\"Jaksi\":\"JKS\"," +
//
//
//                "\"Jarwal Road\":\"JLD\"," +
//
//
//                "\"Jalalganj\":\"JLL\"," +
//
//
//                "\"Jakhalaun\":\"JLN\"," +
//
//
//                "\"Jalesar Road\":\"JLS\"," +
//
//
//                "\"Jhamat\":\"JLT\"," +
//
//
//                "\"Jhalwara\":\"JLW\"," +
//
//
//                "\"Jhilmili\":\"JLY\"," +
//
//
//                "\"Jamdha\":\"JMD\"," +
//
//
//                "\"Jamga\":\"JMG\"," +
//
//
//                "\"Jamunamukh\":\"JMK\"," +
//
//
//                "\"Jamuniakalan\":\"JMKL\"," +
//
//
//                "\"Jawlmukhi Road\":\"JMKR\"," +
//
//
//                "\"Jamikunta\":\"JMKT\"," +
//
//
//                "\"Jimidipeta\":\"JMPT\"," +
//
//
//                "\"Jamirghata\":\"JMQ\"," +
//
//
//                "\"Jamsar\":\"JMS\"," +
//
//
//                "\"Jamtara\":\"JMT\"," +
//
//
//                "\"Jamui\":\"JMU\"," +
//
//
//                "\"Jambara\":\"JMV\"," +
//
//
//                "\"Jhund\":\"JN\"," +
//
//
//                "\"Julana\":\"JNA\"," +
//
//
//                "\"Junagadhcb\":\"JNDC\"," +
//
//
//                "\"Janiyana\":\"JNE\"," +
//
//
//                "\"Janakinagar\":\"JNKR\"," +
//
//
//                "\"Jandiala\":\"JNL\"," +
//
//
//                "\"Jayngrmajlipur\":\"JNM\"," +
//
//
//                "\"Junnordeo\":\"JNO\"," +
//
//
//                "\"Janakpur Road\":\"JNR\"," +
//
//
//                "\"Jinti Road\":\"JNTR\"," +
//
//
//                "\"Jenal\":\"JNZ\"," +
//
//
//                "\"Jojagabor\":\"JO\"," +
//
//
//                "\"Janwal\":\"JOA\"," +
//
//
//                "\"Asalpurjobner\":\"JOB\"," +
//
//
//                "\"Joba\":\"JOBA\"," +
//
//
//                "\"Joychandipahar\":\"JOC\"," +
//
//
//                "\"Jogimagra\":\"JOM\"," +
//
//
//                "\"Jonha\":\"JON\"," +
//
//
//                "\"Jaunpur City\":\"JOP\"," +
//
//
//                "\"Jorai\":\"JOQ\"," +
//
//
//                "\"Jalor\":\"JOR\"," +
//
//
//                "\"Jogeshwari\":\"JOS\"," +
//
//
//                "\"Jalalpurdhai\":\"JPD\"," +
//
//
//                "\"Jalpaiguri Road\":\"JPE\"," +
//
//
//                "\"Jhantipahari\":\"JPH\"," +
//
//
//                "\"Jhadupudi\":\"JPI\"," +
//
//
//                "\"Japla\":\"JPL\"," +
//
//
//                "\"Jiyapuram\":\"JPM\"," +
//
//
//                "\"Jogighopa\":\"JPZ\"," +
//
//
//                "\"Jaraikela\":\"JRA\"," +
//
//
//                "\"Jharia\":\"JRI\"," +
//
//
//                "\"Jargaon\":\"JRJ\"," +
//
//
//                "\"Jeruwakhera\":\"JRK\"," +
//
//
//                "\"Jangipur Road\":\"JRLE\"," +
//
//
//                "\"Jairamnagar\":\"JRMG\"," +
//
//
//                "\"Jiron\":\"JRO\"," +
//
//
//                "\"Jharokhas\":\"JRQ\"," +
//
//
//                "\"Joravasan\":\"JRS\"," +
//
//
//                "\"Jarti\":\"JRT\"," +
//
//
//                "\"Juriagaon\":\"JRX\"," +
//
//
//                "\"Jasai\":\"JSA\"," +
//
//
//                "\"Jaswantgarh\":\"JSH\"," +
//
//
//                "\"Jasali\":\"JSI\"," +
//
//
//                "\"Jataulasamphka\":\"JSKA\"," +
//
//
//                "\"Jayasingpur\":\"JSP\"," +
//
//
//                "\"Jasra\":\"JSR\"," +
//
//
//                "\"Jarandeshwar\":\"JSV\"," +
//
//
//                "\"Jagatbela\":\"JTB\"," +
//
//
//                "\"Jatinga\":\"JTG\"," +
//
//
//                "\"Jaithari\":\"JTI\"," +
//
//
//                "\"Jhapaterdhal\":\"JTL\"," +
//
//
//                "\"Jotana\":\"JTN\"," +
//
//
//                "\"Jutogh\":\"JTO\"," +
//
//
//                "\"Jetpur\":\"JTP\"," +
//
//
//                "\"Jatkanhar\":\"JTR\"," +
//
//
//                "\"Jath Road\":\"JTRD\"," +
//
//
//                "\"Jorhat Town\":\"JTTN\"," +
//
//
//                "\"Jaitipur\":\"JTU\"," +
//
//
//                "\"Jetalvad\":\"JTV\"," +
//
//
//                "\"Jaitwar\":\"JTW\"," +
//
//
//                "\"Jatpipli\":\"JTX\"," +
//
//
//                "\"Jagadhri\":\"JUD\"," +
//
//
//                "\"Jagadhriwshop\":\"JUDW\"," +
//
//
//                "\"Jaulka\":\"JUK\"," +
//
//
//                "\"Jhulasan\":\"JUL\"," +
//
//
//                "\"Jhunpa\":\"JUP\"," +
//
//
//                "\"Javale\":\"JVA\"," +
//
//
//                "\"Jamwala\":\"JVL\"," +
//
//
//                "\"Jorawarnagar Jn.\":\"JVN\"," +
//
//
//                "\"Jawaibandh\":\"JWB\"," +
//
//
//                "\"Jajiwal\":\"JWL\"," +
//
//
//                "\"Jawad Road\":\"JWO\"," +
//
//
//                "\"Jwalapur\":\"JWP\"," +
//
//
//                "\"Jonekarrang\":\"JYK\"," +
//
//
//                "\"Jaisamand Road\":\"JYM\"," +
//
//
//                "\"Jeypore\":\"JYP\"," +
//
//
//                "\"Khandala\":\"KAD\"," +
//
//
//                "\"Kadi\":\"KADI\"," +
//
//
//                "\"Kodaganur\":\"KAG\"," +
//
//
//                "\"Kalhar\":\"KAH\"," +
//
//
//                "\"Kallal\":\"KAL\"," +
//
//
//                "\"Kudal\":\"KALD\"," +
//
//
//                "\"Kalay\":\"KALE\"," +
//
//
//                "\"Kalana\":\"KALN\"," +
//
//
//                "\"Kamakhyaguri\":\"KAMG\"," +
//
//
//                "\"Khana Jn.\":\"KAN\"," +
//
//
//                "\"Kanil\":\"KANJ\"," +
//
//
//                "\"Kanoh\":\"KANO\"," +
//
//
//                "\"Kansiyanes\":\"KANS\"," +
//
//
//                "\"Kaluparaghat\":\"KAPG\"," +
//
//
//                "\"Kolanukonda\":\"KAQ\"," +
//
//
//                "\"Karna\":\"KAR\"," +
//
//
//                "\"Kiratpursahib\":\"KART\"," +
//
//
//                "\"Kanas Road\":\"KASR\"," +
//
//
//                "\"Kasu\":\"KASU\"," +
//
//
//                "\"Khatauli\":\"KAT\"," +
//
//
//                "\"Katili\":\"KATA\"," +
//
//
//                "\"Katol\":\"KATL\"," +
//
//
//                "\"Katariya\":\"KATR\"," +
//
//
//                "\"Kalamna\":\"KAV\"," +
//
//
//                "\"Kanwat\":\"KAWT\"," +
//
//
//                "\"Kurabalakota\":\"KBA\"," +
//
//
//                "\"Kurebhar\":\"KBE\"," +
//
//
//                "\"Khandbaara\":\"KBH\"," +
//
//
//                "\"Kambrganvi\":\"KBI\"," +
//
//
//                "\"Kantabanji\":\"KBJ\"," +
//
//
//                "\"Khamilghat\":\"KBK\"," +
//
//
//                "\"Koppal\":\"KBL\"," +
//
//
//                "\"Kotabommali\":\"KBM\"," +
//
//
//                "\"Karbigwan\":\"KBN\"," +
//
//
//                "\"Kabakaputtur\":\"KBPR\"," +
//
//
//                "\"Kumrabadrohini\":\"KBQ\"," +
//
//
//                "\"Kabrai\":\"KBR\"," +
//
//
//                "\"Kanjariboriyav\":\"KBRV\"," +
//
//
//                "\"Khoirabari\":\"KBY\"," +
//
//
//                "\"Kuchman\":\"KCA\"," +
//
//
//                "\"Krishnacanal\":\"KCC\"," +
//
//
//                "\"Kurichedu\":\"KCD\"," +
//
//
//                "\"Kasimkota Halt\":\"KCH\"," +
//
//
//                "\"Kallkiri\":\"KCI\"," +
//
//
//                "\"Kasimpur\":\"KCJ\"," +
//
//
//                "\"Keckhi\":\"KCKI\"," +
//
//
//                "\"Kalasumudram\":\"KCM\"," +
//
//
//                "\"Karchana\":\"KCN\"," +
//
//
//                "\"Kachnara Road\":\"KCNR\"," +
//
//
//                "\"Kalgupur\":\"KCP\"," +
//
//
//                "\"Kundarkhi\":\"KD\"," +
//
//
//                "\"Khedbrahma\":\"KDBM\"," +
//
//
//                "\"Sanvardamcrchm\":\"KDCR\"," +
//
//
//                "\"Koradacheri\":\"KDE\"," +
//
//
//                "\"Khundaur\":\"KDF\"," +
//
//
//                "\"Kedgaon\":\"KDG\"," +
//
//
//                "\"Karchha\":\"KDHA\"," +
//
//
//                "\"Kundli\":\"KDI\"," +
//
//
//                "\"Kankroli\":\"KDL\"," +
//
//
//                "\"Kundalgarh\":\"KDLG\"," +
//
//
//                "\"Kandlaport\":\"KDLP\"," +
//
//
//                "\"Kandel Road\":\"KDLR\"," +
//
//
//                "\"Kesamudram\":\"KDM\"," +
//
//
//                "\"Kodiyarmandir\":\"KDMR\"," +
//
//
//                "\"Kudatini\":\"KDN\"," +
//
//
//                "\"Kadaynallur\":\"KDNL\"," +
//
//
//                "\"Kondapuram\":\"KDP\"," +
//
//
//                "\"Kumedpur\":\"KDPR\"," +
//
//
//                "\"Kadipur\":\"KDQ\"," +
//
//
//                "\"Khadarpett\":\"KDT\"," +
//
//
//                "\"Kirodimalnagar\":\"KDTR\"," +
//
//
//                "\"Kadambur\":\"KDU\"," +
//
//
//                "\"Kandaghat\":\"KDZ\"," +
//
//
//                "\"Katra\":\"KEA\"," +
//
//
//                "\"Karambeli\":\"KEB\"," +
//
//
//                "\"Kenduapada\":\"KED\"," +
//
//
//                "\"Krishnamakona\":\"KEF\"," +
//
//
//                "\"Karengi\":\"KEG\"," +
//
//
//                "\"Kapseti\":\"KEH\"," +
//
//
//                "\"Kashi\":\"KEI\"," +
//
//
//                "\"Kathleeghat\":\"KEJ\"," +
//
//
//                "\"Karkheli\":\"KEK\"," +
//
//
//                "\"Kem\":\"KEM\"," +
//
//
//                "\"Kukma\":\"KEMA\"," +
//
//
//                "\"Kotala\":\"KEN\"," +
//
//
//                "\"Koiripur\":\"KEPR\"," +
//
//
//                "\"Kirihrapur\":\"KER\"," +
//
//
//                "\"Kesrisinghpur\":\"KESR\"," +
//
//
//                "\"Koparia\":\"KFA\"," +
//
//
//                "\"Karanjadi\":\"KFD\"," +
//
//
//                "\"Kolda\":\"KFF\"," +
//
//
//                "\"Kappil\":\"KFI\"," +
//
//
//                "\"Kukrakhapa\":\"KFP\"," +
//
//
//                "\"Kafurpur\":\"KFPR\"," +
//
//
//                "\"Kajri\":\"KFT\"," +
//
//
//                "\"Kohand\":\"KFU\"," +
//
//
//                "\"Khaga\":\"KGA\"," +
//
//
//                "\"Kargi Road\":\"KGB\"," +
//
//
//                "\"Kalligudi\":\"KGD\"," +
//
//
//                "\"Katangi\":\"KGE\"," +
//
//
//                "\"Kathghar\":\"KGF\"," +
//
//
//                "\"Kengeri\":\"KGI\"," +
//
//
//                "\"Kupgal\":\"KGL\"," +
//
//
//                "\"Khagraghat Road\":\"KGLE\"," +
//
//
//                "\"Kangramandir\":\"KGMR\"," +
//
//
//                "\"Kurseong\":\"KGN\"," +
//
//
//                "\"Kangra\":\"KGRA\"," +
//
//
//                "\"Khongsara\":\"KGS\"," +
//
//
//                "\"Kauriyalaghath\":\"KGT\"," +
//
//
//                "\"Kariganuru\":\"KGW\"," +
//
//
//                "\"Kanginhal\":\"KGX\"," +
//
//
//                "\"Karunguzhi\":\"KGZ\"," +
//
//
//                "\"Kahiliya\":\"KH\"," +
//
//
//                "\"Khat\":\"KHAT\"," +
//
//
//                "\"Khannabanjari\":\"KHBJ\"," +
//
//
//                "\"Khorana\":\"KHC\"," +
//
//
//                "\"Khinchan\":\"KHCN\"," +
//
//
//                "\"Khodiyar\":\"KHD\"," +
//
//
//                "\"Kankather\":\"KHE\"," +
//
//
//                "\"Khed\":\"KHED\"," +
//
//
//                "\"Kichha\":\"KHH\"," +
//
//
//                "\"Khajraha\":\"KHJ\"," +
//
//
//                "\"Kherakalan\":\"KHKN\"," +
//
//
//                "\"Kusmhi\":\"KHM\"," +
//
//
//                "\"Khatima\":\"KHMA\"," +
//
//
//                "\"Khanyan\":\"KHN\"," +
//
//
//                "\"Kundaharnamgnj\":\"KHNM\"," +
//
//
//                "\"Khopoli\":\"KHPI\"," +
//
//
//                "\"Khalipali\":\"KHPL\"," +
//
//
//                "\"Kharik\":\"KHQ\"," +
//
//
//                "\"Khar Road\":\"KHR\"," +
//
//
//                "\"Kumbhraj\":\"KHRJ\"," +
//
//
//                "\"Kharak\":\"KHRK\"," +
//
//
//                "\"Khareshwar Road\":\"KHRS\"," +
//
//
//                "\"Kharsia\":\"KHS\"," +
//
//
//                "\"Srikalahasti\":\"KHT\"," +
//
//
//                "\"Khatgaon\":\"KHTG\"," +
//
//
//                "\"Khatu\":\"KHTU\"," +
//
//
//                "\"Khurhand\":\"KHU\"," +
//
//
//                "\"Khakhrechibg\":\"KHXB\"," +
//
//
//                "\"Khairar Jn.\":\"KID\"," +
//
//
//                "\"Karaikal\":\"KIK\"," +
//
//
//                "\"Kurwaikethora\":\"KIKA\"," +
//
//
//                "\"Kandivali\":\"KILE\"," +
//
//
//                "\"Kim\":\"KIM\"," +
//
//
//                "\"Kapasan\":\"KIN\"," +
//
//
//                "\"Khalilpur\":\"KIP\"," +
//
//
//                "\"Kapilas Road\":\"KIS\"," +
//
//
//                "\"Khallikot\":\"KIT\"," +
//
//
//                "\"Kita\":\"KITA\"," +
//
//
//                "\"Kaialsa\":\"KIV\"," +
//
//
//                "\"Kajgaon\":\"KJ\"," +
//
//
//                "\"Khajurhat\":\"KJA\"," +
//
//
//                "\"Karajgi\":\"KJG\"," +
//
//
//                "\"Kajra\":\"KJH\"," +
//
//
//                "\"Khajauli\":\"KJI\"," +
//
//
//                "\"Kodavaluru\":\"KJJ\"," +
//
//
//                "\"Kajoragram\":\"KJME\"," +
//
//
//                "\"Kannauj\":\"KJN\"," +
//
//
//                "\"Krishnarajasgra\":\"KJS\"," +
//
//
//                "\"Karjat\":\"KJT\"," +
//
//
//                "\"Kuntighat\":\"KJU\"," +
//
//
//                "\"Khijadiya Jn.\":\"KJV\"," +
//
//
//                "\"Khajwana\":\"KJW\"," +
//
//
//                "\"Khurja City\":\"KJY\"," +
//
//
//                "\"Karonji\":\"KJZ\"," +
//
//
//                "\"Khadki\":\"KK\"," +
//
//
//                "\"Kankaha\":\"KKAH\"," +
//
//
//                "\"Karakbel\":\"KKB\"," +
//
//
//                "\"Kalkund\":\"KKD\"," +
//
//
//                "\"Kekatumar\":\"KKG\"," +
//
//
//                "\"Kakirigumma\":\"KKGM\"," +
//
//
//                "\"Karkeli\":\"KKI\"," +
//
//
//                "\"Kakori\":\"KKJ\"," +
//
//
//                "\"Khakharia\":\"KKK\"," +
//
//
//                "\"Kaikolur\":\"KKLR\"," +
//
//
//                "\"Kaklur\":\"KKLU\"," +
//
//
//                "\"Kaikolur\":\"KKLX\"," +
//
//
//                "\"Kamalapuram\":\"KKM\"," +
//
//
//                "\"Khirkiya\":\"KKN\"," +
//
//
//                "\"Khunkhuna\":\"KKNA\"," +
//
//
//                "\"Kallakkudiplgh\":\"KKPM\"," +
//
//
//                "\"Kokpara\":\"KKPR\"," +
//
//
//                "\"Kikakui\":\"KKRD\"," +
//
//
//                "\"Kaikoram\":\"KKRM\"," +
//
//
//                "\"Kunkavav Jn.\":\"KKV\"," +
//
//
//                "\"Kankavali\":\"KKW\"," +
//
//
//                "\"Kottarakara\":\"KKZ\"," +
//
//
//                "\"Kheril\":\"KL\"," +
//
//
//                "\"Kulwa\":\"KLA\"," +
//
//
//                "\"Kulpahar\":\"KLAR\"," +
//
//
//                "\"Kiraoli\":\"KLB\"," +
//
//
//                "\"Kalambha\":\"KLBA\"," +
//
//
//                "\"Kalunga\":\"KLG\"," +
//
//
//                "\"Kollengode\":\"KLGD\"," +
//
//
//                "\"Khemli\":\"KLH\"," +
//
//
//                "\"Kamalganj\":\"KLJ\"," +
//
//
//                "\"Kalamboli\":\"KLMG\"," +
//
//
//                "\"Kalanaurkalan\":\"KLNK\"," +
//
//
//                "\"Kalinarynpur Jn.\":\"KLNP\"," +
//
//
//                "\"Kelod\":\"KLOD\"," +
//
//
//                "\"Kotalpukur\":\"KLP\"," +
//
//
//                "\"Kailasapuram\":\"KLPM\"," +
//
//
//                "\"Kilikollur\":\"KLQ\"," +
//
//
//                "\"Khalari\":\"KLRE\"," +
//
//
//                "\"Kulitalai\":\"KLT\"," +
//
//
//                "\"Kalmitar\":\"KLTR\"," +
//
//
//                "\"Kalluru\":\"KLU\"," +
//
//
//                "\"Kelva Road\":\"KLV\"," +
//
//
//                "\"Kolakalur\":\"KLX\"," +
//
//
//                "\"Khileriyan\":\"KLYN\"," +
//
//
//                "\"Keolari\":\"KLZ\"," +
//
//
//                "\"Khamargachhi\":\"KMAE\"," +
//
//
//                "\"Kamathe\":\"KMAH\"," +
//
//
//                "\"Kadambankulam\":\"KMBK\"," +
//
//
//                "\"Khambhaliya\":\"KMBL\"," +
//
//
//                "\"Kamareddi\":\"KMC\"," +
//
//
//                "\"Kodumudi\":\"KMD\"," +
//
//
//                "\"Karimuddinpur\":\"KMDR\"," +
//
//
//                "\"Kumhari\":\"KMI\"," +
//
//
//                "\"Kaimganj\":\"KMJ\"," +
//
//
//                "\"Komakhan\":\"KMK\"," +
//
//
//                "\"Kamtaul\":\"KML\"," +
//
//
//                "\"Kamli\":\"KMLI\"," +
//
//
//                "\"Kamalur\":\"KMLR\"," +
//
//
//                "\"Kannamangalam\":\"KMM\"," +
//
//
//                "\"Kumardubi\":\"KMME\"," +
//
//
//                "\"Khamgaon\":\"KMN\"," +
//
//
//                "\"Kuchaman City\":\"KMNC\"," +
//
//
//                "\"Kumendi\":\"KMND\"," +
//
//
//                "\"Kamalnagar\":\"KMNR\"," +
//
//
//                "\"Kumbla\":\"KMQ\"," +
//
//
//                "\"Kumarganj\":\"KMRJ\"," +
//
//
//                "\"Karamnasa\":\"KMS\"," +
//
//
//                "\"Kumarsadra\":\"KMSD\"," +
//
//
//                "\"Kamshet\":\"KMST\"," +
//
//
//                "\"Kumarhatti\":\"KMTI\"," +
//
//
//                "\"Karmad\":\"KMV\"," +
//
//
//                "\"Komatipalli\":\"KMX\"," +
//
//
//                "\"Kamudakkudi\":\"KMY\"," +
//
//
//                "\"Kadalundi\":\"KN\"," +
//
//
//                "\"Kandra\":\"KND\"," +
//
//
//                "\"Kandrori\":\"KNDI\"," +
//
//
//                "\"Khandip\":\"KNDP\"," +
//
//
//                "\"Kanhegaon\":\"KNGN\"," +
//
//
//                "\"Kanthan Jn.\":\"KNHN\"," +
//
//
//                "\"Kanalas Jn.\":\"KNLS\"," +
//
//
//                "\"Khanna\":\"KNN\"," +
//
//
//                "\"Khinaniyan\":\"KNNA\"," +
//
//
//                "\"Kaninakhas\":\"KNNK\"," +
//
//
//                "\"Kundgol\":\"KNO\"," +
//
//
//                "\"Khanapur\":\"KNP\"," +
//
//
//                "\"Kandanurpvaya\":\"KNPL\"," +
//
//
//                "\"Kendrapara Road\":\"KNPR\"," +
//
//
//                "\"Kanhargaonnaka\":\"KNRG\"," +
//
//
//                "\"Kuneru\":\"KNRT\"," +
//
//
//                "\"Kanasar\":\"KNSR\"," +
//
//
//                "\"Kanth\":\"KNT\"," +
//
//
//                "\"Kinwat\":\"KNVT\"," +
//
//
//                "\"Kosgi\":\"KO\"," +
//
//
//                "\"Karonda\":\"KOA\"," +
//
//
//                "\"Kodi\":\"KODI\"," +
//
//
//                "\"Marwarkori\":\"KOF\"," +
//
//
//                "\"Kohir Deccan\":\"KOHR\"," +
//
//
//                "\"Khodri\":\"KOI\"," +
//
//
//                "\"Kokrajhar\":\"KOJ\"," +
//
//
//                "\"Koka\":\"KOKA\"," +
//
//
//                "\"Kolad\":\"KOL\"," +
//
//
//                "\"Kolnur\":\"KOLR\"," +
//
//
//                "\"Kodikkalpalaiym\":\"KOM\"," +
//
//
//                "\"Kisoni\":\"KONY\"," +
//
//
//                "\"Khusropur\":\"KOO\"," +
//
//
//                "\"Kolhapur\":\"KOP\"," +
//
//
//                "\"Kuthur\":\"KOQ\"," +
//
//
//                "\"Koti\":\"KOTI\"," +
//
//
//                "\"Koduru\":\"KOU\"," +
//
//
//                "\"Kirloskarvadi\":\"KOV\"," +
//
//
//                "\"Kamptee\":\"KP\"," +
//
//
//                "\"Kanchrapara\":\"KPA\"," +
//
//
//                "\"Kharpokhra\":\"KPB\"," +
//
//
//                "\"Kapurdha Halt\":\"KPDH\"," +
//
//
//                "\"Kauwapur\":\"KPE\"," +
//
//
//                "\"Kalpi\":\"KPI\"," +
//
//
//                "\"Kalipahari\":\"KPK\"," +
//
//
//                "\"Khaprikheda\":\"KPKD\"," +
//
//
//                "\"Kantakapalle\":\"KPL\"," +
//
//
//                "\"Kopai\":\"KPLE\"," +
//
//
//                "\"Kottapndlpalli\":\"KPLL\"," +
//
//
//                "\"Kumarapuram\":\"KPM\"," +
//
//
//                "\"Kuppam\":\"KPN\"," +
//
//
//                "\"Kapan\":\"KPNA\"," +
//
//
//                "\"Kalapipal\":\"KPP\"," +
//
//
//                "\"Kannapuram\":\"KPQ\"," +
//
//
//                "\"Kalyanpur Road\":\"KPRD\"," +
//
//
//                "\"Kotapar Road\":\"KPRR\"," +
//
//
//                "\"Kambarasampetai\":\"KPT\"," +
//
//
//                "\"Keshoraipatan\":\"KPTN\"," +
//
//
//                "\"Kashipur\":\"KPV\"," +
//
//
//                "\"Karunagapalli\":\"KPY\"," +
//
//
//                "\"Kapren\":\"KPZ\"," +
//
//
//                "\"Kondagunta\":\"KQA\"," +
//
//
//                "\"Kalaakhar\":\"KQE\"," +
//
//
//                "\"Kotikulam\":\"KQK\"," +
//
//
//                "\"Koderma\":\"KQR\"," +
//
//
//                "\"Kurgunta\":\"KQT\"," +
//
//
//                "\"Kamarkundu\":\"KQU\"," +
//
//
//                "\"Kheduli\":\"KQW\"," +
//
//
//                "\"Kolar\":\"KQZ\"," +
//
//
//                "\"Karepalli\":\"KRA\"," +
//
//
//                "\"Kahet\":\"KRAI\"," +
//
//
//                "\"Khariar Road\":\"KRAR\"," +
//
//
//                "\"Karaboh\":\"KRBO\"," +
//
//
//                "\"Kiroda\":\"KRC\"," +
//
//
//                "\"Kharwachanda\":\"KRCD\"," +
//
//
//                "\"Karad\":\"KRD\"," +
//
//
//                "\"Koradih\":\"KRDH\"," +
//
//
//                "\"Kirandul\":\"KRDL\"," +
//
//
//                "\"Kartarpur\":\"KRE\"," +
//
//
//                "\"Koregaon\":\"KRG\"," +
//
//
//                "\"Khairthal\":\"KRH\"," +
//
//
//                "\"Korai Halt\":\"KRIH\"," +
//
//
//                "\"Khurja Jn.\":\"KRJ\"," +
//
//
//                "\"Karanja\":\"KRJA\"," +
//
//
//                "\"Karjoda\":\"KRJD\"," +
//
//
//                "\"Kyarkop\":\"KRKP\"," +
//
//
//                "\"Kotarlia\":\"KRL\"," +
//
//
//                "\"Kurali\":\"KRLI\"," +
//
//
//                "\"Karaila Road Jn.\":\"KRLR\"," +
//
//
//                "\"Kuarmunda\":\"KRMD\"," +
//
//
//                "\"Karmali\":\"KRMI\"," +
//
//
//                "\"Khorason Road\":\"KRND\"," +
//
//
//                "\"Krishanrajanaga\":\"KRNR\"," +
//
//
//                "\"Krishnapur\":\"KRP\"," +
//
//
//                "\"Karepur\":\"KRPR\"," +
//
//
//                "\"Koraputdistoa\":\"KRPT\"," +
//
//
//                "\"Karari\":\"KRQ\"," +
//
//
//                "\"Karisath\":\"KRS\"," +
//
//
//                "\"Kharsaliya\":\"KRSA\"," +
//
//
//                "\"Krishnashilla\":\"KRSL\"," +
//
//
//                "\"Kiratgarh\":\"KRTH\"," +
//
//
//                "\"Kheralu\":\"KRU\"," +
//
//
//                "\"Karavadi\":\"KRV\"," +
//
//
//                "\"Kharwa\":\"KRW\"," +
//
//
//                "\"Kharamp\":\"KRXA\"," +
//
//
//                "\"Kadiri\":\"KRY\"," +
//
//
//                "\"Khetasarai\":\"KS\"," +
//
//
//                "\"Kosamba Jn.\":\"KSB\"," +
//
//
//                "\"Kashichak\":\"KSC\"," +
//
//
//                "\"Keshod\":\"KSD\"," +
//
//
//                "\"Kosad\":\"KSE\"," +
//
//
//                "\"Khalispur\":\"KSF\"," +
//
//
//                "\"Kalisindh\":\"KSH\"," +
//
//
//                "\"Kosli\":\"KSI\"," +
//
//
//                "\"Kasimkota\":\"KSK\"," +
//
//
//                "\"Kamasamudram\":\"KSM\"," +
//
//
//                "\"Krishna\":\"KSN\"," +
//
//
//                "\"Kesinga\":\"KSNG\"," +
//
//
//                "\"Khushalnagar\":\"KSNR\"," +
//
//
//                "\"Kishanpur\":\"KSP\"," +
//
//
//                "\"Kashipurasarar\":\"KSPR\"," +
//
//
//                "\"Kasara\":\"KSRA\"," +
//
//
//                "\"Kashti\":\"KSTH\"," +
//
//
//                "\"Kushtaur\":\"KSU\"," +
//
//
//                "\"Kosikalan\":\"KSV\"," +
//
//
//                "\"Kesavaram\":\"KSVM\"," +
//
//
//                "\"Kherisalwa\":\"KSW\"," +
//
//
//                "\"Kalmeshwar\":\"KSWR\"," +
//
//
//                "\"Kotshila\":\"KSX\"," +
//
//
//                "\"Kumta\":\"KT\"," +
//
//
//                "\"Kushtala\":\"KTA\"," +
//
//
//                "\"Kantadih\":\"KTD\"," +
//
//
//                "\"Kotfatteh\":\"KTF\"," +
//
//
//                "\"Keutguda\":\"KTGA\"," +
//
//
//                "\"Kothgangad\":\"KTGD\"," +
//
//
//                "\"Katrasgarh\":\"KTH\"," +
//
//
//                "\"Khutaha\":\"KTHA\"," +
//
//
//                "\"Kathua\":\"KTHU\"," +
//
//
//                "\"Kanti\":\"KTI\"," +
//
//
//                "\"Khaltipur\":\"KTJ\"," +
//
//
//                "\"Kotlakheri\":\"KTKH\"," +
//
//
//                "\"Kotlikalan\":\"KTKL\"," +
//
//
//                "\"Kumtha Khurd\":\"KTKR\"," +
//
//
//                "\"Katkola Jn.\":\"KTLA\"," +
//
//
//                "\"Kutralam\":\"KTM\"," +
//
//
//                "\"Kotma\":\"KTMA\"," +
//
//
//                "\"Katora\":\"KTO\"," +
//
//
//                "\"Kotana\":\"KTOA\"," +
//
//
//                "\"Kathalpukhuri\":\"KTPR\"," +
//
//
//                "\"Kudra\":\"KTQ\"," +
//
//
//                "\"Kothar\":\"KTR\"," +
//
//
//                "\"Katosan Road\":\"KTRD\"," +
//
//
//                "\"Katareah\":\"KTRH\"," +
//
//
//                "\"Kathara Road\":\"KTRR\"," +
//
//
//                "\"Kotmisonanhlt\":\"KTSH\"," +
//
//
//                "\"Kuttippuram\":\"KTU\"," +
//
//
//                "\"Kottavalasa\":\"KTV\"," +
//
//
//                "\"Katakhal Jn.\":\"KTX\"," +
//
//
//                "\"Kotturu\":\"KTY\"," +
//
//
//                "\"Kottaiyur\":\"KTYR\"," +
//
//
//                "\"Kulharia\":\"KUA\"," +
//
//
//                "\"Kudachi\":\"KUD\"," +
//
//
//                "\"Kudal\":\"KUDL\"," +
//
//
//                "\"Kursela\":\"KUE\"," +
//
//
//                "\"Kaurha\":\"KUF\"," +
//
//
//                "\"Khachrod\":\"KUH\"," +
//
//
//                "\"Korukonda\":\"KUK\"," +
//
//
//                "\"Kolamb\":\"KULE\"," +
//
//
//                "\"Kuram\":\"KUM\"," +
//
//
//                "\"Kumarbagh\":\"KUMB\"," +
//
//
//                "\"Khurdpur\":\"KUPR\"," +
//
//
//                "\"Khajuraho\":\"KURJ\"," +
//
//
//                "\"Kuwanthal\":\"KUTL\"," +
//
//
//                "\"Kundara\":\"KUV\"," +
//
//
//                "\"Kanwar\":\"KUW\"," +
//
//
//                "\"Khirsadoh Jn.\":\"KUX\"," +
//
//
//                "\"Kavas\":\"KVA\"," +
//
//
//                "\"Kaparpura\":\"KVC\"," +
//
//
//                "\"Kadavakuduru\":\"KVDU\"," +
//
//
//                "\"Kuneanganj\":\"KVG\"," +
//
//
//                "\"Keshavganj\":\"KVJ\"," +
//
//
//                "\"Kavathemahankl\":\"KVK\"," +
//
//
//                "\"Kizhvelur\":\"KVL\"," +
//
//
//                "\"Karakavalasa\":\"KVLS\"," +
//
//
//                "\"Kavutaram\":\"KVM\"," +
//
//
//                "\"Kapadvanj\":\"KVNJ\"," +
//
//
//                "\"Kovvur\":\"KVR\"," +
//
//
//                "\"Kalsur\":\"KVS\"," +
//
//
//                "\"Kadakavur\":\"KVU\"," +
//
//
//                "\"Kusumbhi\":\"KVX\"," +
//
//
//                "\"Kavali\":\"KVZ\"," +
//
//
//                "\"Kaniwara\":\"KWB\"," +
//
//
//                "\"Katwa\":\"KWF\"," +
//
//
//                "\"Kawargaon\":\"KWGN\"," +
//
//
//                "\"Kachhwa Road\":\"KWH\"," +
//
//
//                "\"Kivarli\":\"KWI\"," +
//
//
//                "\"Khojewala\":\"KWJ\"," +
//
//
//                "\"Kampur\":\"KWM\"," +
//
//
//                "\"Kachewani\":\"KWN\"," +
//
//
//                "\"Koelwar\":\"KWR\"," +
//
//
//                "\"Kuanriya\":\"KXA\"," +
//
//
//                "\"Khariakhangarh\":\"KXG\"," +
//
//
//                "\"Kapurthala\":\"KXH\"," +
//
//
//                "\"Karimganj Jn.\":\"KXJ\"," +
//
//
//                "\"Kanshbahal\":\"KXN\"," +
//
//
//                "\"Kudikadu\":\"KXO\"," +
//
//
//                "\"Kaniyapuram\":\"KXP\"," +
//
//
//                "\"Ketti\":\"KXT\"," +
//
//
//                "\"Kata Road\":\"KXX\"," +
//
//
//                "\"Kareli\":\"KY\"," +
//
//
//                "\"Khurai\":\"KYE\"," +
//
//
//                "\"Kidiyanaga\":\"KYG\"," +
//
//
//                "\"Kalyani\":\"KYI\"," +
//
//
//                "\"Kayankulam\":\"KYJ\"," +
//
//
//                "\"Kadiyan\":\"KYM\"," +
//
//
//                "\"Kottapalli\":\"KYOP\"," +
//
//
//                "\"Kalyanpur\":\"KYP\"," +
//
//
//                "\"Kusumkasa\":\"KYS\"," +
//
//
//                "\"Kailahat\":\"KYT\"," +
//
//
//                "\"Karhiyabhadeli\":\"KYX\"," +
//
//
//                "\"Khada\":\"KZA\"," +
//
//
//                "\"Kurumbur\":\"KZB\"," +
//
//
//                "\"Kanhangad\":\"KZE\"," +
//
//
//                "\"Kazhakuttam\":\"KZK\"," +
//
//
//                "\"Khimel\":\"KZQ\"," +
//
//
//                "\"Kulitthurai\":\"KZT\"," +
//
//
//                "\"Kulitturai West\":\"KZTW\"," +
//
//
//                "\"Kunki\":\"KZU\"," +
//
//
//                "\"Kayalpattinam\":\"KZY\"," +
//
//
//                "\"Lakholi\":\"LAE\"," +
//
//
//                "\"Lakho\":\"LAK\"," +
//
//
//                "\"Lushala\":\"LAL\"," +
//
//
//                "\"Lathi\":\"LAT\"," +
//
//
//                "\"Ladnun\":\"LAU\"," +
//
//
//                "\"Laul\":\"LAUL\"," +
//
//
//                "\"Labha\":\"LAV\"," +
//
//
//                "\"Lambhua\":\"LBA\"," +
//
//
//                "\"Laban\":\"LBN\"," +
//
//
//                "\"Lucknow City\":\"LC\"," +
//
//
//                "\"Lalbagh Court Road\":\"LCAE\"," +
//
//
//                "\"Linch\":\"LCH\"," +
//
//
//                "\"Lalpurchandra\":\"LCN\"," +
//
//
//                "\"Lidhora Khurd\":\"LDA\"," +
//
//
//                "\"Lokdhikhera\":\"LDE\"," +
//
//
//                "\"Ledarmer\":\"LDM\"," +
//
//
//                "\"Lodipurbishnpr\":\"LDP\"," +
//
//
//                "\"Landaura\":\"LDR\"," +
//
//
//                "\"Lunidhar\":\"LDU\"," +
//
//
//                "\"Ladhowal\":\"LDW\"," +
//
//
//                "\"Ladda\":\"LDX\"," +
//
//
//                "\"Lakkiti\":\"LDY\"," +
//
//
//                "\"Lohgarhabub\":\"LGB\"," +
//
//
//                "\"Lalagudagate\":\"LGDH\"," +
//
//
//                "\"Lalgopalganj\":\"LGO\"," +
//
//
//                "\"Langting\":\"LGT\"," +
//
//
//                "\"Lehragaga\":\"LHA\"," +
//
//
//                "\"Lahabon\":\"LHB\"," +
//
//
//                "\"Lohogad\":\"LHD\"," +
//
//
//                "\"Lahli\":\"LHLL\"," +
//
//
//                "\"Lachyan\":\"LHN\"," +
//
//
//                "\"Loharwara\":\"LHW\"," +
//
//
//                "\"Linga\":\"LIG\"," +
//
//
//                "\"Lucknow\":\"LJN\"," +
//
//
//                "\"Lanjigarh Road\":\"LJR\"," +
//
//
//                "\"Lanka\":\"LKA\"," +
//
//
//                "\"Lakhabawal\":\"LKBL\"," +
//
//
//                "\"Lakodara\":\"LKD\"," +
//
//
//                "\"Lakheri\":\"LKE\"," +
//
//
//                "\"Lakhminia\":\"LKN\"," +
//
//
//                "\"Lakhna\":\"LKNA\"," +
//
//
//                "\"Lucknow\":\"LKO\"," +
//
//
//                "\"Lekhapani\":\"LKPE\"," +
//
//
//                "\"Laukahabazar\":\"LKQ\"," +
//
//
//                "\"Luckeesarai Jn.\":\"LKR\"," +
//
//
//                "\"Lunkaransar\":\"LKS\"," +
//
//
//                "\"Lakadiya\":\"LKZ\"," +
//
//
//                "\"Leliguma\":\"LLGM\"," +
//
//
//                "\"Liluah\":\"LLH\"," +
//
//
//                "\"Lalgudi\":\"LLI\"," +
//
//
//                "\"Lalganj\":\"LLJ\"," +
//
//
//                "\"Lalpur\":\"LLR\"," +
//
//
//                "\"Lalru\":\"LLU\"," +
//
//
//                "\"Limbdi\":\"LM\"," +
//
//
//                "\"Lakhamanchi\":\"LMC\"," +
//
//
//                "\"Linganenidoddi\":\"LMD\"," +
//
//
//                "\"Limkheda\":\"LMK\"," +
//
//
//                "\"Lachhmanpur\":\"LMN\"," +
//
//
//                "\"Lakshmibaingr\":\"LMNR\"," +
//
//
//                "\"Liliyamota\":\"LMO\"," +
//
//
//                "\"Almatti\":\"LMT\"," +
//
//
//                "\"Latemda\":\"LMTD\"," +
//
//
//                "\"Laimekuri\":\"LMY\"," +
//
//
//                "\"Lamana\":\"LNA\"," +
//
//
//                "\"Lachhmangarhsk\":\"LNH\"," +
//
//
//                "\"Lohiankhas Jn.\":\"LNK\"," +
//
//
//                "\"Lonand\":\"LNN\"," +
//
//
//                "\"Lohna Road\":\"LNO\"," +
//
//
//                "\"Lakhnauria\":\"LNQ\"," +
//
//
//                "\"Lunirichha\":\"LNR\"," +
//
//
//                "\"Lunavada\":\"LNV\"," +
//
//
//                "\"Lorha\":\"LOA\"," +
//
//
//                "\"Loha\":\"LOHA\"," +
//
//
//                "\"Loni\":\"LONI\"," +
//
//
//                "\"Lovedale\":\"LOV\"," +
//
//
//                "\"Lalapet\":\"LP\"," +
//
//
//                "\"Lapanga\":\"LPG\"," +
//
//
//                "\"Lotapahar\":\"LPH\"," +
//
//
//                "\"Lingampalli\":\"LPI\"," +
//
//
//                "\"Lalpurjam\":\"LPJ\"," +
//
//
//                "\"Lilapur Road\":\"LPR\"," +
//
//
//                "\"Ladpura\":\"LR\"," +
//
//
//                "\"Lodna\":\"LRA\"," +
//
//
//                "\"Lar Road\":\"LRD\"," +
//
//
//                "\"Lalpurumri\":\"LRU\"," +
//
//
//                "\"Lasalgaon\":\"LS\"," +
//
//
//                "\"Lusadiya\":\"LSD\"," +
//
//
//                "\"Lawasardargarh\":\"LSG\"," +
//
//
//                "\"Laheriasarai\":\"LSI\"," +
//
//
//                "\"Lasur\":\"LSR\"," +
//
//
//                "\"Loisingha\":\"LSX\"," +
//
//
//                "\"Lamta\":\"LTA\"," +
//
//
//                "\"Latehar\":\"LTHR\"," +
//
//
//                "\"Lakhtar\":\"LTR\"," +
//
//
//                "\"Latur Road\":\"LTRR\"," +
//
//
//                "\"Lotarva\":\"LTV\"," +
//
//
//                "\"Lusa\":\"LUSA\"," +
//
//
//                "\"Lorwada\":\"LW\"," +
//
//
//                "\"Lunseriya\":\"LXR\"," +
//
//
//                "\"Madha\":\"MA\"," +
//
//
//                "\"Maval\":\"MAA\"," +
//
//
//                "\"Mandibamora\":\"MABA\"," +
//
//
//                "\"Mahbubabad\":\"MABD\"," +
//
//
//                "\"Matanabuzurg\":\"MABG\"," +
//
//
//                "\"Madhapur Road\":\"MADP\"," +
//
//
//                "\"Madure\":\"MADR\"," +
//
//
//                "\"Matheran\":\"MAE\"," +
//
//
//                "\"Mangalagiri\":\"MAG\"," +
//
//
//                "\"Mahe\":\"MAHE\"," +
//
//
//                "\"Maholi\":\"MAHO\"," +
//
//
//                "\"Mehsi\":\"MAI\"," +
//
//
//                "\"Mararikulam\":\"MAKM\"," +
//
//
//                "\"Mala\":\"MAL\"," +
//
//
//                "\"Maliyamiyana\":\"MALB\"," +
//
//
//                "\"Malkapur Road\":\"MALK\"," +
//
//
//                "\"Manthralayam Road\":\"MALM\"," +
//
//
//                "\"Maliya\":\"MALX\"," +
//
//
//                "\"Mangalmahudi\":\"MAM\"," +
//
//
//                "\"Maninagar\":\"MAN\"," +
//
//
//                "\"Maninagar\":\"MANI\"," +
//
//
//                "\"Manki\":\"MANK\"," +
//
//
//                "\"Morappur\":\"MAP\"," +
//
//
//                "\"Mulanur\":\"MAR\"," +
//
//
//                "\"Mavur\":\"MARD\"," +
//
//
//                "\"Maur\":\"MAUR\"," +
//
//
//                "\"Mariammankovil\":\"MAV\"," +
//
//
//                "\"Mariahu\":\"MAY\"," +
//
//
//                "\"Mangra\":\"MAZ\"," +
//
//
//                "\"Murshidabad\":\"MBB\"," +
//
//
//                "\"Moradabad City\":\"MBCT\"," +
//
//
//                "\"Mustabada\":\"MBD\"," +
//
//
//                "\"Munabao\":\"MBF\"," +
//
//
//                "\"Maibang\":\"MBG\"," +
//
//
//                "\"Marwarbagra\":\"MBGA\"," +
//
//
//                "\"Mambalam\":\"MBM\"," +
//
//
//                "\"Marwarbhinmal\":\"MBNL\"," +
//
//
//                "\"Madhosingh\":\"MBS\"," +
//
//
//                "\"Marwarbalia\":\"MBSK\"," +
//
//
//                "\"Marwarbirthi\":\"MBT\"," +
//
//
//                "\"Mumbai Chitrapathi Shivaji Terminal\":\"MBVT\"," +
//
//
//                "\"Malwara\":\"MBW\"," +
//
//
//                "\"Mandidabwali\":\"MBY\"," +
//
//
//                "\"Mandapamcamp\":\"MC\"," +
//
//
//                "\"Mecheda\":\"MCA\"," +
//
//
//                "\"Mancheral\":\"MCI\"," +
//
//
//                "\"Manjattidal\":\"MCJ\"," +
//
//
//                "\"Madimangalam\":\"MCL\"," +
//
//
//                "\"Macherla\":\"MCLA\"," +
//
//
//                "\"Manchili\":\"MCLE\"," +
//
//
//                "\"Mukundarayapurm\":\"MCN\"," +
//
//
//                "\"Motihari Court\":\"MCO\"," +
//
//
//                "\"Marwarchapri\":\"MCPE\"," +
//
//
//                "\"Mirchadhori\":\"MCQ\"," +
//
//
//                "\"Mancheswar\":\"MCS\"," +
//
//
//                "\"Mumbai Central\":\"MCT\"," +
//
//
//                "\"Mulacalacheruvu\":\"MCU\"," +
//
//
//                "\"Macharya\":\"MCV\"," +
//
//
//                "\"Machavaram\":\"MCVM\"," +
//
//
//                "\"Mandhana Jn.\":\"MDA\"," +
//
//
//                "\"Mandor\":\"MDB\"," +
//
//
//                "\"Madhabpur\":\"MDBP\"," +
//
//
//                "\"Malad\":\"MDD\"," +
//
//
//                "\"Mandidip\":\"MDDP\"," +
//
//
//                "\"Makhdumpurgaya\":\"MDE\"," +
//
//
//                "\"Muradi\":\"MDF\"," +
//
//
//                "\"Manendragarh\":\"MDGR\"," +
//
//
//                "\"Mandhar\":\"MDH\"," +
//
//
//                "\"Madhapar\":\"MDHP\"," +
//
//
//                "\"Muhammadganj\":\"MDJ\"," +
//
//
//                "\"Madhukunda\":\"MDKD\"," +
//
//
//                "\"Modukuru\":\"MDKU\"," +
//
//
//                "\"Mandal\":\"MDL\"," +
//
//
//                "\"Mandarhill\":\"MDLE\"," +
//
//
//                "\"Mundalaram\":\"MDLM\"," +
//
//
//                "\"Modinagar\":\"MDNR\"," +
//
//
//                "\"Madhopur Punjab\":\"MDPB\"," +
//
//
//                "\"Modpur\":\"MDPR\"," +
//
//
//                "\"Madhira\":\"MDR\"," +
//
//
//                "\"Murdeshwar\":\"MDRW\"," +
//
//
//                "\"Mandasor\":\"MDS\"," +
//
//
//                "\"Mandavalli\":\"MDVL\"," +
//
//
//                "\"Madhavnagar\":\"MDVR\"," +
//
//
//                "\"Marwarmundwa\":\"MDW\"," +
//
//
//                "\"Masaipet\":\"ME\"," +
//
//
//                "\"Merta City\":\"MEC\"," +
//
//
//                "\"Medchal\":\"MED\"," +
//
//
//                "\"Marinelines\":\"MEL\"," +
//
//
//                "\"Melusar\":\"MELH\"," +
//
//
//                "\"Mauaimma\":\"MEM\"," +
//
//
//                "\"Mahidpur Road\":\"MEP\"," +
//
//
//                "\"Malethukanak\":\"MEQ\"," +
//
//
//                "\"Madurai East\":\"MES\"," +
//
//
//                "\"Malerkotla\":\"MET\"," +
//
//
//                "\"Mukerian\":\"MEX\"," +
//
//
//                "\"Marenga\":\"MEZ\"," +
//
//
//                "\"Mustafabad\":\"MFB\"," +
//
//
//                "\"Monabari\":\"MFC\"," +
//
//
//                "\"Muftiganj\":\"MFJ\"," +
//
//
//                "\"Musafirkhana\":\"MFKA\"," +
//
//
//                "\"Misrauli\":\"MFL\"," +
//
//
//                "\"Mahalam\":\"MFM\"," +
//
//
//                "\"Mahroi\":\"MFQ\"," +
//
//
//                "\"Mandlafort\":\"MFR\"," +
//
//
//                "\"Modelgram\":\"MG\"," +
//
//
//                "\"Mudigubba\":\"MGB\"," +
//
//
//                "\"Mugad\":\"MGD\"," +
//
//
//                "\"Mandagere\":\"MGF\"," +
//
//
//                "\"Mangliyagaon\":\"MGG\"," +
//
//
//                "\"Manigachi\":\"MGI\"," +
//
//
//                "\"Manigram\":\"MGLE\"," +
//
//
//                "\"Mangolpuri\":\"MGLP\"," +
//
//
//                "\"Muragacha\":\"MGM\"," +
//
//
//                "\"Mccluskieganj\":\"MGME\"," +
//
//
//                "\"Meghnagar\":\"MGN\"," +
//
//
//                "\"Mahisgaon\":\"MGO\"," +
//
//
//                "\"Monghyr\":\"MGR\"," +
//
//
//                "\"Mangrolla\":\"MGRL\"," +
//
//
//                "\"Magarwara\":\"MGW\"," +
//
//
//                "\"Marahra\":\"MH\"," +
//
//
//                "\"Mohadiprgnlng\":\"MHAD\"," +
//
//
//                "\"Mhmdvdkheda Road\":\"MHD\"," +
//
//
//                "\"Mahadevpara\":\"MHDP\"," +
//
//
//                "\"Maghar\":\"MHH\"," +
//
//
//                "\"Mahajan\":\"MHJ\"," +
//
//
//                "\"Mahwal\":\"MHL\"," +
//
//
//                "\"Mahanadi\":\"MHN\"," +
//
//
//                "\"Mohandi\":\"MHND\"," +
//
//
//                "\"Mahpur\":\"MHO\"," +
//
//
//                "\"Muhammadpur\":\"MHP\"," +
//
//
//                "\"Mahuda\":\"MHQ\"," +
//
//
//                "\"Mahendragarh\":\"MHRG\"," +
//
//
//                "\"Manheru\":\"MHU\"," +
//
//
//                "\"Mahuva Jn.\":\"MHV\"," +
//
//
//                "\"Madhi\":\"MID\"," +
//
//
//                "\"Mihrawan\":\"MIH\"," +
//
//
//                "\"Manikul\":\"MIK\"," +
//
//
//                "\"Milak\":\"MIL\"," +
//
//
//                "\"Mihinpurwa\":\"MIN\"," +
//
//
//                "\"Maikalganj\":\"MINJ\"," +
//
//
//                "\"Mirhakur\":\"MIQ\"," +
//
//
//                "\"Mira Road\":\"MIRA\"," +
//
//
//                "\"Mitha\":\"MITA\"," +
//
//
//                "\"Maripat\":\"MIU\"," +
//
//
//                "\"Meja Road\":\"MJA\"," +
//
//
//                "\"Majbat\":\"MJBT\"," +
//
//
//                "\"Malkajgiri\":\"MJF\"," +
//
//
//                "\"Majhagawan\":\"MJG\"," +
//
//
//                "\"Majhowlia\":\"MJL\"," +
//
//
//                "\"Makum Jn.\":\"MJN\"," +
//
//
//                "\"Majorda\":\"MJO\"," +
//
//
//                "\"Moharajpur\":\"MJP\"," +
//
//
//                "\"Majri Jn.\":\"MJRI\"," +
//
//
//                "\"Manjeshwar\":\"MJS\"," +
//
//
//                "\"Maramjhiri\":\"MJY\"," +
//
//
//                "\"Majholapakarya\":\"MJZ\"," +
//
//
//                "\"Miranpurkatra\":\"MK\"," +
//
//
//                "\"Mankatha\":\"MKB\"," +
//
//
//                "\"Markundi\":\"MKD\"," +
//
//
//                "\"Morkadhana\":\"MKDN\"," +
//
//
//                "\"Marwarkhara\":\"MKHR\"," +
//
//
//                "\"Makkajipalli\":\"MKJ\"," +
//
//
//                "\"Maklidrug\":\"MKL\"," +
//
//
//                "\"Marikuppam\":\"MKM\"," +
//
//
//                "\"Makrana Jn\":\"MKN\"," +
//
//
//                "\"Markona\":\"MKO\"," +
//
//
//                "\"Muktapur\":\"MKPR\"," +
//
//
//                "\"Malikpeth\":\"MKPT\"," +
//
//
//                "\"Maddikera\":\"MKR\"," +
//
//
//                "\"Makrera\":\"MKRA\"," +
//
//
//                "\"Machhakunda\":\"MKRD\"," +
//
//
//                "\"Makronia\":\"MKRN\"," +
//
//
//                "\"Muktsar\":\"MKS\"," +
//
//
//                "\"Mokalsar\":\"MKSR\"," +
//
//
//                "\"Mukhtiarbalwar\":\"MKT\"," +
//
//
//                "\"Malkapur\":\"MKU\"," +
//
//
//                "\"Morak\":\"MKX\"," +
//
//
//                "\"Malhour\":\"ML\"," +
//
//
//                "\"Malpura\":\"MLA\"," +
//
//
//                "\"Modnimb\":\"MLB\"," +
//
//
//                "\"Malkisar\":\"MLC\"," +
//
//
//                "\"Malihabad\":\"MLD\"," +
//
//
//                "\"Malhargarh\":\"MLG\"," +
//
//
//                "\"Mandalgarh\":\"MLGH\"," +
//
//
//                "\"Mallappagate\":\"MLGT\"," +
//
//
//                "\"Manaklao\":\"MLH\"," +
//
//
//                "\"Maliyahatina\":\"MLHA\"," +
//
//
//                "\"Mangaliyawas\":\"MLI\"," +
//
//
//                "\"Mohanlalganj\":\"MLJ\"," +
//
//
//                "\"Malkapuram\":\"MLK\"," +
//
//
//                "\"Malthan\":\"MLM\"," +
//
//
//                "\"Melmaruvattur\":\"MLMR\"," +
//
//
//                "\"Malur\":\"MLO\"," +
//
//
//                "\"Malipur\":\"MLPR\"," +
//
//
//                "\"Malasa\":\"MLS\"," +
//
//
//                "\"Malsailu\":\"MLSU\"," +
//
//
//                "\"Melattur\":\"MLTR\"," +
//
//
//                "\"Malugur\":\"MLU\"," +
//
//
//                "\"Mallarpur\":\"MLV\"," +
//
//
//                "\"Mallanwan\":\"MLW\"," +
//
//
//                "\"Mullanpur\":\"MLX\"," +
//
//
//                "\"Maulaali\":\"MLY\"," +
//
//
//                "\"Malarna\":\"MLZ\"," +
//
//
//                "\"Mahim\":\"MM\"," +
//
//
//                "\"Muhammadabad\":\"MMA\"," +
//
//
//                "\"Mahmudabadavdh\":\"MMB\"," +
//
//
//                "\"Mahamandir\":\"MMC\"," +
//
//
//                "\"Maheshmunda\":\"MMD\"," +
//
//
//                "\"Muthalamada\":\"MMDA\"," +
//
//
//                "\"Mahadanapuram\":\"MMH\"," +
//
//
//                "\"Madurantakam\":\"MMK\"," +
//
//
//                "\"Madanmahal\":\"MML\"," +
//
//
//                "\"Mahuamilan\":\"MMLN\"," +
//
//
//                "\"Mandapam\":\"MMM\"," +
//
//
//                "\"Mambalappattu\":\"MMP\"," +
//
//
//                "\"Mandasa Road\":\"MMS\"," +
//
//
//                "\"Mahalimarup\":\"MMV\"," +
//
//
//                "\"Marwarmathanya\":\"MMY\"," +
//
//
//                "\"Mandamari\":\"MMZ\"," +
//
//
//                "\"Mankar\":\"MNAE\"," +
//
//
//                "\"Madankata\":\"MNC\"," +
//
//
//                "\"Mandirhasaud\":\"MNDH\"," +
//
//
//                "\"Mandidhanaura\":\"MNDR\"," +
//
//
//                "\"Manda Road\":\"MNF\"," +
//
//
//                "\"Maniharighat\":\"MNG\"," +
//
//
//                "\"Muniguda\":\"MNGD\"," +
//
//
//                "\"Mangaon\":\"MNI\"," +
//
//
//                "\"Manoharganj\":\"MNJ\"," +
//
//
//                "\"Mananpur\":\"MNP\"," +
//
//
//                "\"Mainpuri\":\"MNQ\"," +
//
//
//                "\"Manaksar\":\"MNSR\"," +
//
//
//                "\"Mundikota\":\"MNU\"," +
//
//
//                "\"Mannanur\":\"MNUR\"," +
//
//
//                "\"Mungaoli\":\"MNV\"," +
//
//
//                "\"Manganallur\":\"MNX\"," +
//
//
//                "\"Mankarai\":\"MNY\"," +
//
//
//                "\"Mohol\":\"MO\"," +
//
//
//                "\"Manoharabad\":\"MOB\"," +
//
//
//                "\"Mondh\":\"MOF\"," +
//
//
//                "\"Moga\":\"MOGA\"," +
//
//
//                "\"Moribera\":\"MOI\"," +
//
//
//                "\"Muli Road\":\"MOL\"," +
//
//
//                "\"Maman\":\"MOM\"," +
//
//
//                "\"Molakalmuru\":\"MOMU\"," +
//
//
//                "\"Modran\":\"MON\"," +
//
//
//                "\"Muddanuru\":\"MOO\"," +
//
//
//                "\"Mohitnagar\":\"MOP\"," +
//
//
//                "\"Mor\":\"MOR\"," +
//
//
//                "\"Malout\":\"MOT\"," +
//
//
//                "\"Motichur\":\"MOTC\"," +
//
//
//                "\"Moth\":\"MOTH\"," +
//
//
//                "\"Manoharpur\":\"MOU\"," +
//
//
//                "\"Mananwala\":\"MOW\"," +
//
//
//                "\"Mohri\":\"MOY\"," +
//
//
//                "\"Manaparai\":\"MPA\"," +
//
//
//                "\"Muirpur Road\":\"MPF\"," +
//
//
//                "\"Mundhapande\":\"MPH\"," +
//
//
//                "\"Madanapalle Road\":\"MPL\"," +
//
//
//                "\"Marthipalayam\":\"MPLM\"," +
//
//
//                "\"Mahipal Road\":\"MPLR\"," +
//
//
//                "\"Makarpura\":\"MPR\"," +
//
//
//                "\"Mangalampeta\":\"MPT\"," +
//
//
//                "\"Medapadu\":\"MPU\"," +
//
//
//                "\"Mohammadkhera\":\"MQE\"," +
//
//
//                "\"Madhorajpur\":\"MQH\"," +
//
//
//                "\"Mirkhal\":\"MQL\"," +
//
//
//                "\"Munroturuttu\":\"MQO\"," +
//
//
//                "\"Markahandiuht\":\"MQQ\"," +
//
//
//                "\"Malkhaid Road\":\"MQR\"," +
//
//
//                "\"Malsianshahkht\":\"MQS\"," +
//
//
//                "\"Murukkampuzha\":\"MQU\"," +
//
//
//                "\"Meralgram\":\"MQX\"," +
//
//
//                "\"Motajadra\":\"MQZ\"," +
//
//
//                "\"Morena\":\"MRA\"," +
//
//
//                "\"Munirabad\":\"MRB\"," +
//
//
//                "\"Muribahal\":\"MRBL\"," +
//
//
//                "\"Mordar\":\"MRDD\"," +
//
//
//                "\"Meramandolil\":\"MRDL\"," +
//
//
//                "\"Murdeshwar\":\"MRDW\"," +
//
//
//                "\"Manauri\":\"MRE\"," +
//
//
//                "\"Marpalli\":\"MRF\"," +
//
//
//                "\"Marmagao\":\"MRH\"," +
//
//
//                "\"Murliganj\":\"MRIJ\"," +
//
//
//                "\"Markapur Road\":\"MRK\"," +
//
//
//                "\"Maroli\":\"MRL\"," +
//
//
//                "\"Morwani\":\"MRN\"," +
//
//
//                "\"Morinda\":\"MRND\"," +
//
//
//                "\"Marampalli\":\"MRPL\"," +
//
//
//                "\"Mauranipur\":\"MRPR\"," +
//
//
//                "\"Murarai\":\"MRR\"," +
//
//
//                "\"Mathura Cant.\":\"MRT\"," +
//
//
//                "\"Mirthal\":\"MRTL\"," +
//
//
//                "\"Matunga Road\":\"MRU\"," +
//
//
//                "\"Marsul\":\"MRV\"," +
//
//
//                "\"Marwarranawas\":\"MRWS\"," +
//
//
//                "\"Masjid\":\"MSD\"," +
//
//
//                "\"Masudan\":\"MSDN\"," +
//
//
//                "\"Murshadpur\":\"MSDR\"," +
//
//
//                "\"Maheskhunt\":\"MSK\"," +
//
//
//                "\"Mahasamund\":\"MSMD\"," +
//
//
//                "\"Misamari\":\"MSMI\"," +
//
//
//                "\"Misrod\":\"MSO\"," +
//
//
//                "\"Masodha\":\"MSOD\"," +
//
//
//                "\"Mansurpur\":\"MSP\"," +
//
//
//                "\"Marwarratanpra\":\"MSQ\"," +
//
//
//                "\"Masur\":\"MSR\"," +
//
//
//                "\"Mahesharisndhn\":\"MSSD\"," +
//
//
//                "\"Masit\":\"MST\"," +
//
//
//                "\"Maskanwa\":\"MSW\"," +
//
//
//                "\"Mansa\":\"MSZ\"," +
//
//
//                "\"Matlabpur\":\"MTB\"," +
//
//
//                "\"Meturdam\":\"MTDM\"," +
//
//
//                "\"Mettur\":\"MTE\"," +
//
//
//                "\"Mataundh\":\"MTH\"," +
//
//
//                "\"Mothala Halt\":\"MTHH\"," +
//
//
//                "\"Mithapur\":\"MTHP\"," +
//
//
//                "\"Mothala\":\"MTIA\"," +
//
//
//                "\"Mailam\":\"MTL\"," +
//
//
//                "\"Mattancherihlt\":\"MTNC\"," +
//
//
//                "\"Muttarasanallur\":\"MTNL\"," +
//
//
//                "\"Motipurachauki\":\"MTPC\"," +
//
//
//                "\"Raimehatpur\":\"MTPR\"," +
//
//
//                "\"Motipur\":\"MTR\"," +
//
//
//                "\"Mutupet\":\"MTT\"," +
//
//
//                "\"Matmari\":\"MTU\"," +
//
//
//                "\"Multai\":\"MTY\"," +
//
//
//                "\"Musra\":\"MUA\"," +
//
//
//                "\"Muradnagar\":\"MUD\"," +
//
//
//                "\"Magra\":\"MUG\"," +
//
//
//                "\"Mahugarha\":\"MUGA\"," +
//
//
//                "\"Manuguru\":\"MUGR\"," +
//
//
//                "\"Munumaka\":\"MUK\"," +
//
//
//                "\"Mulki\":\"MULK\"," +
//
//
//                "\"Murhipar\":\"MUP\"," +
//
//
//                "\"Meerut Cant.\":\"MUT\"," +
//
//
//                "\"Mahuawa Khurd\":\"MUUA\"," +
//
//
//                "\"Mathurapur\":\"MUW\"," +
//
//
//                "\"Mugaiyur\":\"MUY\"," +
//
//
//                "\"Mohiuddinpur\":\"MUZ\"," +
//
//
//                "\"Mundhewadi\":\"MVE\"," +
//
//
//                "\"Manabar\":\"MVF\"," +
//
//
//                "\"Maligura\":\"MVG\"," +
//
//
//                "\"Morbi\":\"MVI\"," +
//
//
//                "\"Mavli Jn.\":\"MVJ\"," +
//
//
//                "\"Malavli\":\"MVL\"," +
//
//
//                "\"Mavelikara\":\"MVLK\"," +
//
//
//                "\"Milavittan\":\"MVN\"," +
//
//
//                "\"Manwath Road\":\"MVO\"," +
//
//
//                "\"Manavadar\":\"MVR\"," +
//
//
//                "\"Mallividu\":\"MVW\"," +
//
//
//                "\"Mairwa\":\"MW\"," +
//
//
//                "\"Mhasavad\":\"MWD\"," +
//
//
//                "\"Malwan\":\"MWH\"," +
//
//
//                "\"Mordadtanda\":\"MWK\"," +
//
//
//                "\"Malleswaram\":\"MWM\"," +
//
//
//                "\"Mahansar\":\"MWR\"," +
//
//
//                "\"Marwarlohwat\":\"MWT\"," +
//
//
//                "\"Mallanwalakhas\":\"MWX\"," +
//
//
//                "\"Mahalakshmi\":\"MX\"," +
//
//
//                "\"Marauda\":\"MXA\"," +
//
//
//                "\"Makhu\":\"MXH\"," +
//
//
//                "\"Mandrak\":\"MXK\"," +
//
//
//                "\"Mokholi\":\"MXL\"," +
//
//
//                "\"Morthala\":\"MXO\"," +
//
//
//                "\"Mahur\":\"MXR\"," +
//
//
//                "\"Malakpetkcg\":\"MXT\"," +
//
//
//                "\"Mahadevsal\":\"MXW\"," +
//
//
//                "\"Mahuariya\":\"MXY\"," +
//
//
//                "\"Malliyam\":\"MY\"," +
//
//
//                "\"Mandya\":\"MYA\"," +
//
//
//                "\"Miyagamkarjan\":\"MYG\"," +
//
//
//                "\"Miyagamkjnng\":\"MYGL\"," +
//
//
//                "\"Maheji\":\"MYJ\"," +
//
//
//                "\"Mayakonda\":\"MYK\"," +
//
//
//                "\"Malliyala\":\"MYL\"," +
//
//
//                "\"Memari\":\"MYM\"," +
//
//
//                "\"Miyana\":\"MYN\"," +
//
//
//                "\"Mundilyampakkam\":\"MYP\"," +
//
//
//                "\"Maihar\":\"MYR\"," +
//
//
//                "\"Mayanoor\":\"MYU\"," +
//
//
//                "\"Metyalsohar\":\"MYX\"," +
//
//
//                "\"Mayyanad\":\"MYY\"," +
//
//
//                "\"Mirzacheuki\":\"MZC\"," +
//
//
//                "\"Manzurgarhi\":\"MZGI\"," +
//
//
//                "\"Mauhari\":\"MZH\"," +
//
//
//                "\"Mirzapali\":\"MZL\"," +
//
//
//                "\"Muzzampurnryn\":\"MZM\"," +
//
//
//                "\"Mahmudpursryn\":\"MZN\"," +
//
//
//                "\"Manjuri Road\":\"MZZ\"," +
//
//
//                "\"Nawa City\":\"NAC\"," +
//
//
//                "\"Nagargali\":\"NAG\"," +
//
//
//                "\"Naksalbari\":\"NAK\"," +
//
//
//                "\"Namrup\":\"NAM\"," +
//
//
//                "\"Nandgaon Road\":\"NAN\"," +
//
//
//                "\"Nana\":\"NANA\"," +
//
//
//                "\"Nar\":\"NAR\"," +
//
//
//                "\"Nasrala\":\"NAS\"," +
//
//
//                "\"Narasingapalli\":\"NASP\"," +
//
//
//                "\"Nathnagar\":\"NAT\"," +
//
//
//                "\"Nawandgi\":\"NAW\"," +
//
//
//                "\"Nazirganj\":\"NAZJ\"," +
//
//
//                "\"Nimbhora\":\"NB\"," +
//
//
//                "\"Nabenagar Road\":\"NBG\"," +
//
//
//                "\"Nimbahera\":\"NBH\"," +
//
//
//                "\"Nanabhamodra\":\"NBHM\"," +
//
//
//                "\"Navabpalem\":\"NBM\"," +
//
//
//                "\"Nibhapur\":\"NBP\"," +
//
//
//                "\"Namburu\":\"NBR\"," +
//
//
//                "\"Newbhuj\":\"NBUJ\"," +
//
//
//                "\"Newbhuj\":\"NBVJ\"," +
//
//
//                "\"Nizbarganj\":\"NBX\"," +
//
//
//                "\"Nizchatia\":\"NCA\"," +
//
//
//                "\"Nabadwipdham\":\"NDAE\"," +
//
//
//                "\"Nayaazadpur\":\"NDAZ\"," +
//
//
//                "\"Nandre\":\"NDE\"," +
//
//
//                "\"Nindharbenar\":\"NDH\"," +
//
//
//                "\"Nandganj\":\"NDJ\"," +
//
//
//                "\"Nidamanuru\":\"NDM\"," +
//
//
//                "\"Nardana\":\"NDN\"," +
//
//
//                "\"Nandapur\":\"NDPR\"," +
//
//
//                "\"Nudurupadu\":\"NDPU\"," +
//
//
//                "\"Nandesari\":\"NDR\"," +
//
//
//                "\"Nathdwara\":\"NDT\"," +
//
//
//                "\"Nadauj\":\"NDU\"," +
//
//
//                "\"Nidigallu\":\"NDZ\"," +
//
//
//                "\"Nemem\":\"NEM\"," +
//
//
//                "\"Nenpur\":\"NEP\"," +
//
//
//                "\"Neri\":\"NERI\"," +
//
//
//                "\"Nivari\":\"NEW\"," +
//
//
//                "\"Nagari\":\"NG\"," +
//
//
//                "\"Ningala Jn.\":\"NGA\"," +
//
//
//                "\"Nagardevla\":\"NGD\"," +
//
//
//                "\"Nagarnabi\":\"NGF\"," +
//
//
//                "\"Nagina\":\"NGG\"," +
//
//
//                "\"Nagari\":\"NGI\"," +
//
//
//                "\"Ngrjunanagaramu\":\"NGJN\"," +
//
//
//                "\"Nagercoiloa\":\"NGK\"," +
//
//
//                "\"Naglatula\":\"NGLL\"," +
//
//
//                "\"Naglatula\":\"NGLT\"," +
//
//
//                "\"Nagasamudram\":\"NGM\"," +
//
//
//                "\"Nagaur\":\"NGO\"," +
//
//
//                "\"Annigeri\":\"NGR\"," +
//
//
//                "\"Nagrota\":\"NGRT\"," +
//
//
//                "\"Nagappattinam\":\"NGT\"," +
//
//
//                "\"Newgitldada ode\":\"NGTG\"," +
//
//
//                "\"Nagothane\":\"NGTN\"," +
//
//
//                "\"Nauganwan\":\"NGW\"," +
//
//
//                "\"Naihati Jn.\":\"NH\"," +
//
//
//                "\"Nihalgarh\":\"NHH\"," +
//
//
//                "\"Naharkatiya\":\"NHK\"," +
//
//
//                "\"Nandoldehegam\":\"NHM\"," +
//
//
//                "\"Nigohan\":\"NHN\"," +
//
//
//                "\"Nohar\":\"NHR\"," +
//
//
//                "\"Nalhati Jn.\":\"NHT\"," +
//
//
//                "\"Naganahalli\":\"NHY\"," +
//
//
//                "\"Naydongri\":\"NI\"," +
//
//
//                "\"Naila\":\"NIA\"," +
//
//
//                "\"Nidur\":\"NID\"," +
//
//
//                "\"Naigaon\":\"NIG\"," +
//
//
//                "\"Nilambur Road\":\"NIL\"," +
//
//
//                "\"Nilaje\":\"NILD\"," +
//
//
//                "\"Nimitita\":\"NILE\"," +
//
//
//                "\"Nimdih\":\"NIM\"," +
//
//
//                "\"Nizampur\":\"NIP\"," +
//
//
//                "\"Nigaura\":\"NIQ\"," +
//
//
//                "\"Nira\":\"NIRA\"," +
//
//
//                "\"Nabipur\":\"NIU\"," +
//
//
//                "\"Nivasar\":\"NIV\"," +
//
//
//                "\"Njramanal\":\"NJM\"," +
//
//
//                "\"Nagercoil\":\"NJT\"," +
//
//
//                "\"Nagrakota\":\"NKB\"," +
//
//
//                "\"Nekonda\":\"NKD\"," +
//
//
//                "\"Nakkanadoddi\":\"NKDO\"," +
//
//
//                "\"Naikheri\":\"NKI\"," +
//
//
//                "\"Narikkudi\":\"NKK\"," +
//
//
//                "\"Namkon\":\"NKM\"," +
//
//
//                "\"Nirakarpur\":\"NKP\"," +
//
//
//                "\"Nimarkheri\":\"NKR\"," +
//
//
//                "\"Naliya Cant.\":\"NLC\"," +
//
//
//                "\"Nileshwar\":\"NLE\"," +
//
//
//                "\"Namli\":\"NLI\"," +
//
//
//                "\"Navlakhi\":\"NLK\"," +
//
//
//                "\"Nilokheri\":\"NLKR\"," +
//
//
//                "\"Nallapadu\":\"NLPD\"," +
//
//
//                "\"Nalbari\":\"NLV\"," +
//
//
//                "\"Naliya\":\"NLY\"," +
//
//
//                "\"Naimisharanya\":\"NM\"," +
//
//
//                "\"Nirmali\":\"NMA\"," +
//
//
//                "\"Nomoda\":\"NMD\"," +
//
//
//                "\"Nidamangalam\":\"NMJ\"," +
//
//
//                "\"Nimkathana\":\"NMK\"," +
//
//
//                "\"Nellimaria\":\"NML\"," +
//
//
//                "\"Newmisamari\":\"NMM\"," +
//
//
//                "\"Newmaynaguri\":\"NMX\"," +
//
//
//                "\"Nandura\":\"NN\"," +
//
//
//                "\"Naugachia\":\"NNA\"," +
//
//
//                "\"Nonera\":\"NNE\"," +
//
//
//                "\"Nanaksar\":\"NNKR\"," +
//
//
//                "\"Narnaul\":\"NNL\"," +
//
//
//                "\"Nannilam\":\"NNM\"," +
//
//
//                "\"Nanguneri\":\"NNN\"," +
//
//
//                "\"Nangloi\":\"NNO\"," +
//
//
//                "\"Nanpara Jn.\":\"NNP\"," +
//
//
//                "\"Narayanpur\":\"NNR\"," +
//
//
//                "\"Nrynpurtatwar\":\"NNW\"," +
//
//
//                "\"Nosaria\":\"NOA\"," +
//
//
//                "\"Nogongassam\":\"NOG\"," +
//
//
//                "\"Nariaoli\":\"NOI\"," +
//
//
//                "\"Nokha\":\"NOK\"," +
//
//
//                "\"Niyol\":\"NOL\"," +
//
//
//                "\"Noamundi\":\"NOMD\"," +
//
//
//                "\"Noyal\":\"NOY\"," +
//
//
//                "\"Nawapara Road\":\"NPD\"," +
//
//
//                "\"Nipania\":\"NPI\"," +
//
//
//                "\"Nagalapalle\":\"NPL\"," +
//
//
//                "\"Nellikuppan\":\"NPM\"," +
//
//
//                "\"Nepanagar\":\"NPNR\"," +
//
//
//                "\"Nepalganj Road\":\"NPR\"," +
//
//
//                "\"Napasar\":\"NPS\"," +
//
//
//                "\"Narasingampet\":\"NPT\"," +
//
//
//                "\"Nipanivadgaon\":\"NPW\"," +
//
//
//                "\"Narajmarthapur\":\"NQR\"," +
//
//
//                "\"Niphad\":\"NR\"," +
//
//
//                "\"Nunkhar\":\"NRA\"," +
//
//
//                "\"Naroda\":\"NRD\"," +
//
//
//                "\"Nagireddipalli\":\"NRDP\"," +
//
//
//                "\"Nergundi\":\"NRG\"," +
//
//
//                "\"Naranjipur\":\"NRGR\"," +
//
//
//                "\"Naraina\":\"NRI\"," +
//
//
//                "\"Naraikkinar\":\"NRK\"," +
//
//
//                "\"Narkher\":\"NRKR\"," +
//
//
//                "\"Neral\":\"NRL\"," +
//
//
//                "\"Norlia Road\":\"NRLR\"," +
//
//
//                "\"Nurmahal\":\"NRM\"," +
//
//
//                "\"Narhan\":\"NRN\"," +
//
//
//                "\"Nakodar Jn.\":\"NRO\"," +
//
//
//                "\"Nari Road\":\"NROD\"," +
//
//
//                "\"Narsipatnam Road\":\"NRP\"," +
//
//
//                "\"Naraynpuranant\":\"NRPA\"," +
//
//
//                "\"Narayanpet Road\":\"NRPD\"," +
//
//
//                "\"Nagarur\":\"NRR\"," +
//
//
//                "\"Nagariasadat\":\"NRS\"," +
//
//
//                "\"Narasaraopet\":\"NRT\"," +
//
//
//                "\"Nariyar\":\"NRV\"," +
//
//
//                "\"Narwasi\":\"NRWI\"," +
//
//
//                "\"Noadardhal\":\"NRX\"," +
//
//
//                "\"Nowrozabad\":\"NRZB\"," +
//
//
//                "\"Nasirabad\":\"NSD\"," +
//
//
//                "\"Nallasopara\":\"NSP\"," +
//
//
//                "\"Nisui\":\"NSU\"," +
//
//
//                "\"Nar Town\":\"NTN\"," +
//
//
//                "\"Nautanwa\":\"NTV\"," +
//
//
//                "\"Nanjangud Town\":\"NTW\"," +
//
//
//                "\"Netawal\":\"NTWL\"," +
//
//
//                "\"Nathwana\":\"NTZ\"," +
//
//
//                "\"Narsinghpur\":\"NU\"," +
//
//
//                "\"Nua\":\"NUA\"," +
//
//
//                "\"Navagadh\":\"NUD\"," +
//
//
//                "\"Nujella\":\"NUJ\"," +
//
//
//                "\"Nagaruntari\":\"NUQ\"," +
//
//
//                "\"Narela\":\"NUR\"," +
//
//
//                "\"Nawagaon\":\"NVG\"," +
//
//
//                "\"Neyveli\":\"NVL\"," +
//
//
//                "\"Nawalgohan\":\"NVLN\"," +
//
//
//                "\"Navade Road\":\"NVRD\"," +
//
//
//                "\"Navsari\":\"NVS\"," +
//
//
//                "\"Navipet\":\"NVT\"," +
//
//
//                "\"Navalur\":\"NVU\"," +
//
//
//                "\"Nalwar\":\"NW\"," +
//
//
//                "\"Nagarwara\":\"NWA\"," +
//
//
//                "\"Niwas Road\":\"NWB\"," +
//
//
//                "\"Nawadah\":\"NWD\"," +
//
//
//                "\"Nawalgarh\":\"NWH\"," +
//
//
//                "\"Naupada Jn.\":\"NWP\"," +
//
//
//                "\"Niwar\":\"NWR\"," +
//
//
//                "\"Navapur\":\"NWU\"," +
//
//
//                "\"Nuagaon\":\"NXN\"," +
//
//
//                "\"Nayandahalli\":\"NYH\"," +
//
//
//                "\"\":\"NYK\"," +
//
//
//                "\"Naini\":\"NYN\"," +
//
//
//                "\"Nayadupeta\":\"NYP\"," +
//
//
//                "\"Neyyattinkara\":\"NYY\"," +
//
//
//                "\"Nuzvid\":\"NZD\"," +
//
//
//                "\"Nazareth\":\"NZT\"," +
//
//
//                "\"Obradam\":\"OBR\"," +
//
//
//                "\"Obulavaripalli\":\"OBVP\"," +
//
//                "\"Obhaniyachache\":\"OCH\"," +
//
//
//                "\"Ochira\":\"OCR\"," +
//
//
//                "\"Oddamhatram\":\"ODC\"," +
//
//
//                "\"Obaidullaganj\":\"ODG\"," +
//
//
//                "\"Ondagram\":\"ODM\"," +
//
//
//                "\"Odela\":\"OEA\"," +
//
//
//                "\"Okhla\":\"OKA\"," +
//
//
//                "\"Olakur\":\"OLA\"," +
//
//
//                "\"Omkareshwar Road\":\"OM\"," +
//
//
//                "\"Uppal\":\"OPL\"," +
//
//
//                "\"Orchha\":\"ORC\"," +
//
//
//                "\"Oddarahalli\":\"ORH\"," +
//
//
//                "\"Orr\":\"ORR\"," +
//
//
//                "\"Osiyan\":\"OSN\"," +
//
//
//                "\"Osra\":\"OSRA\"," +
//
//
//                "\"Ottappalam\":\"OTP\"," +
//
//
//                "\"Moturu\":\"OTR\"," +
//
//
//                "\"Otivakkam\":\"OV\"," +
//
//
//                "\"Waria\":\"OYR\"," +
//
//
//                "\"Patas\":\"PAA\"," +
//
//
//                "\"Pardi\":\"PAD\"," +
//
//
//                "\"Palana\":\"PAE\"," +
//
//
//                "\"Pabai\":\"PAI\"," +
//
//
//                "\"Pakala Jn.\":\"PAK\"," +
//
//
//                "\"Pali\":\"PALI\"," +
//
//
//                "\"Palaiyam\":\"PALM\"," +
//
//
//                "\"Panapakam\":\"PAM\"," +
//
//
//                "\"Panagarh\":\"PAN\"," +
//
//
//                "\"Pandavapura\":\"PANP\"," +
//
//
//                "\"Panoli\":\"PAO\"," +
//
//
//                "\"Pithapuram\":\"PAP\"," +
//
//
//                "\"Pandhurna\":\"PAR\"," +
//
//
//                "\"Pasur\":\"PAS\"," +
//
//
//                "\"Parashshala\":\"PASA\"," +
//
//
//                "\"Pata\":\"PATA\"," +
//
//
//                "\"Pedana\":\"PAV\"," +
//
//
//                "\"Peddaavutapale\":\"PAVP\"," +
//
//
//                "\"Pandabeswar\":\"PAW\"," +
//
//
//                "\"Patti\":\"PAX\"," +
//
//
//                "\"Payyanur\":\"PAY\"," +
//
//
//                "\"Payangadi\":\"PAZ\"," +
//
//
//                "\"Puntamba\":\"PB\"," +
//
//
//                "\"Piardoba\":\"PBA\"," +
//
//
//                "\"Pedabramadvam\":\"PBD\"," +
//
//
//                "\"Pmbakvlshandy\":\"PBKS\"," +
//
//
//                "\"Pathsala\":\"PBL\"," +
//
//
//                "\"Pamban Jn.\":\"PBM\"," +
//
//
//                "\"Pembarti\":\"PBP\"," +
//
//
//                "\"Pathardihbazar\":\"PBQ\"," +
//
//
//                "\"Purabsarai\":\"PBS\"," +
//
//
//                "\"Paliba\":\"PBV\"," +
//
//
//                "\"Pantnagar\":\"PBW\"," +
//
//
//                "\"Prachi Road Jn.\":\"PCC\"," +
//
//
//                "\"Pachhapur\":\"PCH\"," +
//
//
//                "\"Pulicherla\":\"PCL\"," +
//
//
//                "\"Palachauri\":\"PCLI\"," +
//
//
//                "\"Panchalam\":\"PCLM\"," +
//
//
//                "\"Panchpipila\":\"PCN\"," +
//
//
//                "\"Pichkurirdhal\":\"PCQ\"," +
//
//
//                "\"Panchra\":\"PCR\"," +
//
//
//                "\"Panchtalavda Road\":\"PCT\"," +
//
//
//                "\"Palakkodu\":\"PCV\"," +
//
//
//                "\"Paglachandi\":\"PCX\"," +
//
//
//                "\"Pocharam\":\"PCZ\"," +
//
//
//                "\"Pundooah\":\"PDA\"," +
//
//
//                "\"Padubidri\":\"PDD\"," +
//
//
//                "\"Pindrai\":\"PDE\"," +
//
//
//                "\"Paradgaon\":\"PDG\"," +
//
//
//                "\"Pudunagaram\":\"PDGM\"," +
//
//
//                "\"Padhegaon\":\"PDGN\"," +
//
//
//                "\"Padadhari\":\"PDH\"," +
//
//
//                "\"Pendekallu\":\"PDL\"," +
//
//
//                "\"Pandikanmoi\":\"PDM\"," +
//
//
//                "\"Padse\":\"PDP\"," +
//
//
//                "\"Peddapalli\":\"PDPL\"," +
//
//
//                "\"Padla\":\"PDQ\"," +
//
//
//                "\"Payagpur\":\"PDR\"," +
//
//
//                "\"Pindra Road\":\"PDRD\"," +
//
//
//                "\"Pendurti\":\"PDT\"," +
//
//
//                "\"Ponduru\":\"PDU\"," +
//
//
//                "\"Pandaravadai\":\"PDV\"," +
//
//
//                "\"Pilioda\":\"PDZ\"," +
//
//
//                "\"Pipardahi\":\"PED\"," +
//
//
//                "\"Pathardih Jn.\":\"PEH\"," +
//
//
//                "\"Perani\":\"PEI\"," +
//
//
//                "\"Peralam\":\"PEM\"," +
//
//
//                "\"Pen\":\"PEN\"," +
//
//
//                "\"Phephna Jn.\":\"PEP\"," +
//
//
//                "\"Perambur\":\"PER\"," +
//
//
//                "\"Pernem\":\"PERN\"," +
//
//
//                "\"Phesar\":\"PES\"," +
//
//
//                "\"Piprala\":\"PFL\"," +
//
//
//                "\"Pachor Road\":\"PFR\"," +
//
//
//                "\"Padua\":\"PFU\"," +
//
//
//                "\"Pergaon\":\"PG\"," +
//
//
//                "\"Pagara\":\"PGA\"," +
//
//
//                "\"Penganga\":\"PGG\"," +
//
//
//                "\"Parpanangadi\":\"PGI\"," +
//
//
//                "\"Pilibangan\":\"PGK\"," +
//
//
//                "\"Perugamani\":\"PGN\"," +
//
//
//                "\"Pugalur\":\"PGR\"," +
//
//
//                "\"Piduguralla\":\"PGRL\"," +
//
//
//                "\"Padugupadu\":\"PGU\"," +
//
//
//                "\"Phagwara Jn.\":\"PGW\"," +
//
//
//                "\"Perunguzhi\":\"PGZ\"," +
//
//
//                "\"Patharia\":\"PHA\"," +
//
//
//                "\"Phaphund\":\"PHD\"," +
//
//
//                "\"Punarakh\":\"PHK\"," +
//
//
//                "\"Pokhrayan\":\"PHN\"," +
//
//
//                "\"Pardhande\":\"PHQ\"," +
//
//
//                "\"Phillaur Jn.\":\"PHR\"," +
//
//
//                "\"Panchrukhi\":\"PHRH\"," +
//
//
//                "\"Ferozeshah\":\"PHS\"," +
//
//
//                "\"Pirthiganj\":\"PHV\"," +
//
//
//                "\"Pipraigaon\":\"PIA\"," +
//
//
//                "\"Paricha\":\"PIC\"," +
//
//
//                "\"Parhihara\":\"PIH\"," +
//
//
//                "\"Pij\":\"PIJ\"," +
//
//
//                "\"Piler\":\"PIL\"," +
//
//
//                "\"Piplia\":\"PIP\"," +
//
//
//                "\"Palitana\":\"PIT\"," +
//
//
//                "\"Pingli\":\"PIZ\"," +
//
//
//                "\"Pajian\":\"PJA\"," +
//
//
//                "\"Pirjhalar\":\"PJH\"," +
//
//
//                "\"Panjkosi\":\"PJK\"," +
//
//
//                "\"Panjhan\":\"PJN\"," +
//
//
//                "\"Pakni\":\"PK\"," +
//
//
//                "\"Penukonda\":\"PKD\"," +
//
//
//                "\"Pimparkhed\":\"PKE\"," +
//
//
//                "\"Papinayaknahali\":\"PKL\"," +
//
//
//                "\"Pokharninrsnha\":\"PKNS\"," +
//
//
//                "\"Palakollu\":\"PKO\"," +
//
//
//                "\"Pallikere\":\"PKP\"," +
//
//
//                "\"Pattikkad\":\"PKQ\"," +
//
//
//                "\"Pakaur\":\"PKR\"," +
//
//
//                "\"Parsakhera\":\"PKRA\"," +
//
//
//                "\"Pakara Road\":\"PKRD\"," +
//
//
//                "\"Pattukottai\":\"PKT\"," +
//
//
//                "\"Panskura\":\"PKU\"," +
//
//
//                "\"Pilkhua\":\"PKW\"," +
//
//
//                "\"Lower Parel\":\"PL\"," +
//
//
//                "\"Palia\":\"PLA\"," +
//
//
//                "\"Phalodi\":\"PLC\"," +
//
//
//                "\"Paldhi\":\"PLD\"," +
//
//
//                "\"Piplee\":\"PLE\"," +
//
//
//                "\"Palghar\":\"PLG\"," +
//
//
//                "\"Pettaivayatalai\":\"PLI\"," +
//
//
//                "\"Palej\":\"PLJ\"," +
//
//
//                "\"Phulwartanr\":\"PLJE\"," +
//
//
//                "\"Parli\":\"PLL\"," +
//
//
//                "\"Panelimoti\":\"PLM\"," +
//
//
//                "\"Palampurhpoa\":\"PLMA\"," +
//
//
//                "\"Palampurhmchl\":\"PLMX\"," +
//
//
//                "\"Phulpur\":\"PLP\"," +
//
//
//                "\"Palappuram\":\"PLPM\"," +
//
//
//                "\"Pipalsana\":\"PLS\"," +
//
//
//                "\"Palsana\":\"PLSN\"," +
//
//
//                "\"Patakottacheru\":\"PLU\"," +
//
//
//                "\"Pallevada\":\"PLVA\"," +
//
//
//                "\"Pingleshwar\":\"PLW\"," +
//
//
//                "\"Plassey\":\"PLY\"," +
//
//
//                "\"Palam\":\"PM\"," +
//
//
//                "\"Paraomahna\":\"PMH\"," +
//
//
//                "\"Paramakkudi\":\"PMK\"," +
//
//
//                "\"Papanasam\":\"PML\"," +
//
//
//                "\"Paman\":\"PMN\"," +
//
//
//                "\"Pandoli\":\"PMO\"," +
//
//
//                "\"Pimpri\":\"PMP\"," +
//
//
//                "\"Pitambarpur\":\"PMR\"," +
//
//
//                "\"Parmalkasa\":\"PMS\"," +
//
//
//                "\"Palimarwar\":\"PMY\"," +
//
//
//                "\"Pansar\":\"PN\"," +
//
//
//                "\"Pendra Road\":\"PND\"," +
//
//
//                "\"Pennadam\":\"PNDM\"," +
//
//
//                "\"Prantik\":\"PNE\"," +
//
//
//                "\"Pangaon\":\"PNF\"," +
//
//
//                "\"Panchgram\":\"PNGM\"," +
//
//
//                "\"Puraini\":\"PNI\"," +
//
//
//                "\"Padriganj\":\"PNJ\"," +
//
//
//                "\"Panki\":\"PNK\"," +
//
//
//                "\"Panyam\":\"PNM\"," +
//
//
//                "\"Pandu\":\"PNO\"," +
//
//
//                "\"Panpali\":\"PNPL\"," +
//
//
//                "\"Punkunnam\":\"PNQ\"," +
//
//
//                "\"Panitola\":\"PNT\"," +
//
//
//                "\"Pundhag\":\"PNW\"," +
//
//
//                "\"Paniahwa\":\"PNYA\"," +
//
//
//                "\"Parangipettai\":\"PO\"," +
//
//
//                "\"Piparsand\":\"POF\"," +
//
//
//                "\"Pokran\":\"POK\"," +
//
//
//                "\"Punthottam\":\"POM\"," +
//
//
//                "\"Ponneri\":\"PON\"," +
//
//
//                "\"Potlapadu\":\"POO\"," +
//
//
//                "\"Pipalda Road\":\"POR\"," +
//
//
//                "\"Padrauna\":\"POU\"," +
//
//
//                "\"Pollachi Jn.\":\"POY\"," +
//
//
//                "\"Potul\":\"POZ\"," +
//
//
//                "\"Pipra\":\"PPA\"," +
//
//
//                "\"Pipraich\":\"PPC\"," +
//
//
//                "\"Piplod Jn.\":\"PPD\"," +
//
//
//                "\"Piplaj\":\"PPF\"," +
//
//
//                "\"Piplodabagla\":\"PPG\"," +
//
//
//                "\"Princep Ghat\":\"PPGT\"," +
//
//
//                "\"Pipridih\":\"PPH\"," +
//
//
//                "\"Pophlaj\":\"PPJ\"," +
//
//
//                "\"Pipli\":\"PPLI\"," +
//
//
//                "\"Phirangipuram\":\"PPM\"," +
//
//
//                "\"Punpun\":\"PPN\"," +
//
//
//                "\"Panposh\":\"PPO\"," +
//
//
//                "\"Pipar Road Jn.\":\"PPR\"," +
//
//
//                "\"Piparahan Halt\":\"PPRH\"," +
//
//
//                "\"Pirpainti\":\"PPT\"," +
//
//
//                "\"Piparpur\":\"PPU\"," +
//
//
//                "\"Peddempet\":\"PPZ\"," +
//
//
//                "\"Pranpur Road\":\"PQD\"," +
//
//
//                "\"Pawapuri Road\":\"PQE\"," +
//
//
//                "\"Pindlai\":\"PQL\"," +
//
//
//                "\"Pakkam\":\"PQM\"," +
//
//
//                "\"Pwnklaknder Road\":\"PQN\"," +
//
//
//                "\"Pablikhas\":\"PQY\"," +
//
//
//                "\"Parbati\":\"PRB\"," +
//
//
//                "\"Parsabazar\":\"PRBZ\"," +
//
//
//                "\"Perecherla\":\"PRCA\"," +
//
//
//                "\"Paradol\":\"PRDL\"," +
//
//
//                "\"Pahara\":\"PRE\"," +
//
//
//                "\"Parsipur\":\"PRF\"," +
//
//
//                "\"Prayag\":\"PRG\"," +
//
//
//                "\"Powerpet\":\"PRH\"," +
//
//
//                "\"Pathri\":\"PRI\"," +
//
//
//                "\"Prantij\":\"PRJ\"," +
//
//
//                "\"Parkham\":\"PRK\"," +
//
//
//                "\"Powerkheda\":\"PRKD\"," +
//
//
//                "\"Puruakhera\":\"PRKE\"," +
//
//
//                "\"Parkanhatti\":\"PRKH\"," +
//
//
//                "\"Polur\":\"PRL\"," +
//
//
//                "\"Parlivaijnath\":\"PRLI\"," +
//
//
//                "\"Pirumadara\":\"PRM\"," +
//
//
//                "\"Parauna\":\"PRN\"," +
//
//
//                "\"Purnia Court\":\"PRNC\"," +
//
//
//                "\"Pritamnagar\":\"PRNG\"," +
//
//
//                "\"Paharpur\":\"PRP\"," +
//
//
//                "\"Prshtampatnam\":\"PRPT\"," +
//
//
//                "\"Panruti\":\"PRT\"," +
//
//
//                "\"Pirtala\":\"PRTL\"," +
//
//
//                "\"Partapur\":\"PRTP\"," +
//
//
//                "\"Parlu\":\"PRU\"," +
//
//
//                "\"Parewadi\":\"PRWD\"," +
//
//
//                "\"Paras\":\"PS\"," +
//
//
//                "\"Parsabad\":\"PSB\"," +
//
//
//                "\"Parsoda\":\"PSD\"," +
//
//
//                "\"Pasivedala\":\"PSDA\"," +
//
//
//                "\"Palsoramakrawa\":\"PSO\"," +
//
//
//                "\"Pasraha\":\"PSR\"," +
//
//
//                "\"Posotia\":\"PST\"," +
//
//
//                "\"Patli\":\"PT\"," +
//
//
//                "\"Pattambi\":\"PTB\"," +
//
//
//                "\"Puttaparthioa\":\"PTBY\"," +
//
//
//                "\"Kodikkarai\":\"PTC\"," +
//
//
//                "\"Petlad Jn.\":\"PTD\"," +
//
//
//                "\"Patiala Cant.\":\"PTE\"," +
//
//
//                "\"Patranga\":\"PTH\"," +
//
//
//                "\"Potkapalli\":\"PTKP\"," +
//
//
//                "\"Pathauli\":\"PTLI\"," +
//
//
//                "\"Padalam\":\"PTM\"," +
//
//
//                "\"Patan\":\"PTN\"," +
//
//
//                "\"Patalpani\":\"PTP\"," +
//
//
//                "\"Prattiapadu\":\"PTPU\"," +
//
//
//                "\"Pataudi Road\":\"PTRD\"," +
//
//
//                "\"Patara\":\"PTRE\"," +
//
//
//                "\"Pathrala\":\"PTRL\"," +
//
//
//                "\"Patratu\":\"PTRU\"," +
//
//
//                "\"Patansaongi\":\"PTS\"," +
//
//
//                "\"Putalapattu\":\"PTT\"," +
//
//
//                "\"Partur\":\"PTU\"," +
//
//
//                "\"Patsul\":\"PTZ\"," +
//
//
//                "\"Patchur\":\"PU\"," +
//
//
//                "\"Pulla\":\"PUA\"," +
//
//
//                "\"Phanda\":\"PUD\"," +
//
//
//                "\"Palari\":\"PUE\"," +
//
//
//                "\"Pudukad\":\"PUK\"," +
//
//
//                "\"Rampuraphul\":\"PUL\"," +
//
//
//                "\"Pundi\":\"PUN\"," +
//
//
//                "\"Pirumrod\":\"PUO\"," +
//
//
//                "\"Phusro\":\"PUS\"," +
//
//
//                "\"Puttur\":\"PUT\"," +
//
//
//                "\"Punalur\":\"PUU\"," +
//
//
//                "\"Pusa Road\":\"PUV\"," +
//
//
//                "\"Parasia\":\"PUX\"," +
//
//
//                "\"Peddavadiapudi\":\"PVD\"," +
//
//
//                "\"Peravurani\":\"PVI\"," +
//
//
//                "\"Pasupatikovil\":\"PVL\"," +
//
//
//                "\"Parvatipuram\":\"PVP\"," +
//
//
//                "\"Parvatipuramtn\":\"PVPT\"," +
//
//
//                "\"Pandharpur\":\"PVR\"," +
//
//
//                "\"Piravam Road\":\"PVRD\"," +
//
//
//                "\"Paravur\":\"PVU\"," +
//
//
//                "\"Pirwa\":\"PW\"," +
//
//
//                "\"Palwal\":\"PWL\"," +
//
//
//                "\"Phulwanisharif\":\"PWS\"," +
//
//
//                "\"Prayag Ghat\":\"PYG\"," +
//
//
//                "\"Pandiyapuram\":\"PYM\"," +
//
//
//                "\"Payyoli\":\"PYOL\"," +
//
//
//                "\"Peyanapalli\":\"PYX\"," +
//
//
//                "\"Qadian\":\"QDN\"," +
//
//
//                "\"Quilandi\":\"QLD\"," +
//
//
//                "\"Kulem\":\"QLM\"," +
//
//
//                "\"Kayamsar\":\"QMRS\"," +
//
//
//                "\"Kilaraipur\":\"QRP\"," +
//
//
//                "\"Quarrysdg\":\"QRS\"," +
//
//
//                "\"Kansrao\":\"QSR\"," +
//
//
//                "\"Kothara\":\"QTR\"," +
//
//
//                "\"Ramparda\":\"RA\"," +
//
//
//                "\"Barara\":\"RAA\"," +
//
//
//                "\"Rajagambiram\":\"RAGM\"," +
//
//
//                "\"Raibha\":\"RAI\"," +
//
//
//                "\"Raikakhol\":\"RAIR\"," +
//
//
//                "\"Rajpipla\":\"RAJ\"," +
//
//
//                "\"Rajapur Road\":\"RAJP\"," +
//
//
//                "\"Rajur\":\"RAJR\"," +
//
//
//                "\"Repalle\":\"RAL\"," +
//
//
//                "\"Ramapuram\":\"RAM\"," +
//
//
//                "\"Rani\":\"RANI\"," +
//
//
//                "\"Rau\":\"RAU\"," +
//
//
//                "\"Ray\":\"RAY\"," +
//
//
//                "\"Rambha\":\"RBA\"," +
//
//
//                "\"Rahimabad\":\"RBD\"," +
//
//
//                "\"Raybag\":\"RBG\"," +
//
//
//                "\"Robertsganj\":\"RBGJ\"," +
//
//
//                "\"Reotibkhera\":\"RBK\"," +
//
//
//                "\"Raghubansnagar\":\"RBN\"," +
//
//
//                "\"Ribada\":\"RBR\"," +
//
//
//                "\"Rupbas\":\"RBS\"," +
//
//
//                "\"Rambhaddarpur\":\"RBZ\"," +
//
//
//                "\"Rachagunnari\":\"RCG\"," +
//
//
//                "\"Richughutu\":\"RCGT\"," +
//
//
//                "\"Ramachandrapur\":\"RCP\"," +
//
//
//                "\"Rikhabdev Road\":\"RDD\"," +
//
//
//                "\"Rathdhana\":\"RDDE\"," +
//
//
//                "\"Radhagaon\":\"RDF\"," +
//
//
//                "\"Rayadrug\":\"RDG\"," +
//
//
//                "\"Radhanpur\":\"RDHP\"," +
//
//
//                "\"Rudauli\":\"RDL\"," +
//
//
//                "\"Radhikapur\":\"RDP\"," +
//
//
//                "\"Ramdevra\":\"RDRA\"," +
//
//
//                "\"Ravtha Road\":\"RDT\"," +
//
//
//                "\"Rampurdumra\":\"RDUM\"," +
//
//
//                "\"Rechni Road\":\"RECH\"," +
//
//
//                "\"Regupalem\":\"REG\"," +
//
//
//                "\"Rithi\":\"REI\"," +
//
//
//                "\"Rejinagar\":\"REJ\"," +
//
//
//                "\"Ren\":\"REN\"," +
//
//
//                "\"Rasull\":\"RES\"," +
//
//
//                "\"Rewa\":\"REW\"," +
//
//
//                "\"Rafiganj\":\"RFJ\"," +
//
//
//                "\"Rajghatnarora\":\"RG\"," +
//
//
//                "\"Ramganga\":\"RGB\"," +
//
//
//                "\"Ramgiri\":\"RGI\"," +
//
//
//                "\"Raiganj\":\"RGJ\"," +
//
//
//                "\"Rengali\":\"RGL\"," +
//
//
//                "\"Rangapuram\":\"RGM\"," +
//
//
//                "\"Rotegaon\":\"RGO\"," +
//
//
//                "\"Raghunathpalli\":\"RGP\"," +
//
//
//                "\"Raghavapuram\":\"RGPM\"," +
//
//
//                "\"Raigadh Road\":\"RGQ\"," +
//
//
//                "\"Ragaul\":\"RGU\"," +
//
//
//                "\"Rakhamines\":\"RHE\"," +
//
//
//                "\"Rajgarh\":\"RHG\"," +
//
//
//                "\"Rakhi\":\"RHI\"," +
//
//
//                "\"Roshanpur\":\"RHN\"," +
//
//
//                "\"Rohini\":\"RHNE\"," +
//
//
//                "\"Rajhura\":\"RHR\"," +
//
//
//                "\"Ridhore\":\"RID\"," +
//
//
//                "\"Riga\":\"RIGA\"," +
//
//
//                "\"Rajanagar\":\"RJA\"," +
//
//
//                "\"Rajabera\":\"RJB\"," +
//
//
//                "\"Rajgram\":\"RJG\"," +
//
//
//                "\"Rajawari\":\"RJI\"," +
//
//
//                "\"Rajmahal\":\"RJL\"," +
//
//
//                "\"Rajendrapul\":\"RJO\"," +
//
//
//                "\"Razampeta\":\"RJP\"," +
//
//
//                "\"Rajendranagar(Patna)\":\"RJPB\"," +
//
//
//                "\"Rajapalayam\":\"RJPM\"," +
//
//
//                "\"Rajaldesar\":\"RJR\"," +
//
//
//                "\"Rajiyasar\":\"RJS\"," +
//
//
//                "\"Rajula City\":\"RJU\"," +
//
//
//                "\"Raikabagh\":\"RKB\"," +
//
//
//                "\"Rukadi\":\"RKD\"," +
//
//
//                "\"Rakhiyal\":\"RKH\"," +
//
//
//                "\"Ramkanali Jn.\":\"RKI\"," +
//
//
//                "\"Ramkola\":\"RKL\"," +
//
//
//                "\"Rmkrshnaprmgte\":\"RKO\"," +
//
//
//                "\"Sarairani\":\"RKS\"," +
//
//
//                "\"Rishikesh\":\"RKSH\"," +
//
//
//                "\"Rajkharsawan Jn.\":\"RKSN\"," +
//
//
//                "\"Kothariya\":\"RKY\"," +
//
//
//                "\"Rajula Jn.\":\"RLA\"," +
//
//
//                "\"Relangi\":\"RLG\"," +
//
//
//                "\"Rayalcheruvu\":\"RLO\"," +
//
//
//                "\"Raila Road\":\"RLR\"," +
//
//
//                "\"Rajmane\":\"RM\"," +
//
//
//                "\"Ramganjmandi\":\"RMA\"," +
//
//
//                "\"Ramchaura Road\":\"RMC\"," +
//
//
//                "\"Ramna\":\"RMF\"," +
//
//
//                "\"Ramganj\":\"RMGJ\"," +
//
//
//                "\"Ramanagaram\":\"RMGM\"," +
//
//
//                "\"Rangmahal\":\"RMH\"," +
//
//
//                "\"Ramannapet\":\"RMNP\"," +
//
//
//                "\"Ramakona\":\"RMO\"," +
//
//
//                "\"Rahimatpur\":\"RMP\"," +
//
//
//                "\"Ramgarh Cant.\":\"RMT\"," +
//
//
//                "\"Ramavarappadu\":\"RMV\"," +
//
//
//                "\"Ramsar\":\"RMX\"," +
//
//
//                "\"Rohanakalan\":\"RNA\"," +
//
//
//                "\"Ranabordi\":\"RNBD\"," +
//
//
//                "\"Rahenbata\":\"RNBT\"," +
//
//
//                "\"Ranjani\":\"RNE\"," +
//
//
//                "\"Raniganj\":\"RNG\"," +
//
//
//                "\"Runkhera\":\"RNH\"," +
//
//
//                "\"Rangapani\":\"RNI\"," +
//
//
//                "\"Ranolishishu\":\"RNIS\"," +
//
//
//                "\"Runija\":\"RNJ\"," +
//
//
//                "\"Ranjangaon Road\":\"RNJD\"," +
//
//
//                "\"Ranala\":\"RNL\"," +
//
//
//                "\"Rajankunti\":\"RNN\"," +
//
//
//                "\"Ranoli\":\"RNO\"," +
//
//
//                "\"Rupnarayanpur\":\"RNPR\"," +
//
//
//                "\"Renukut\":\"RNQ\"," +
//
//
//                "\"Ranibennur\":\"RNR\"," +
//
//
//                "\"Ranipur Road\":\"RNRD\"," +
//
//
//                "\"Ranthambhore\":\"RNT\"," +
//
//
//                "\"Raniwara\":\"RNV\"," +
//
//
//                "\"Renwal\":\"RNW\"," +
//
//
//                "\"Ruseraghat\":\"ROA\"," +
//
//
//                "\"Robertson\":\"ROB\"," +
//
//
//                "\"Roha\":\"ROHA\"," +
//
//
//                "\"Rupsa Jn.\":\"ROP\"," +
//
//
//                "\"Rora\":\"RORA\"," +
//
//
//                "\"Rajosi\":\"ROS\"," +
//
//
//                "\"Roza Jn.\":\"ROZA\"," +
//
//
//                "\"Rupnagar\":\"RPAR\"," +
//
//
//                "\"Rupaund\":\"RPD\"," +
//
//
//                "\"Rupaheli\":\"RPI\"," +
//
//
//                "\"Raghunathpur\":\"RPR\"," +
//
//
//                "\"Rupra Road\":\"RPRD\"," +
//
//
//                "\"Ranippettai\":\"RPT\"," +
//
//
//                "\"Ratanpur\":\"RPUR\"," +
//
//
//                "\"Ranapratapnagar\":\"RPZ\"," +
//
//
//                "\"Rningrjlpaigri\":\"RQJ\"," +
//
//
//                "\"Richha Road\":\"RR\"," +
//
//
//                "\"Rahul Road\":\"RRE\"," +
//
//
//                "\"Rahuri\":\"RRI\"," +
//
//
//                "\"Ramarajupalli\":\"RRJ\"," +
//
//
//                "\"Rewral\":\"RRL\"," +
//
//
//                "\"Ranchi Road\":\"RRME\"," +
//
//
//                "\"Risama\":\"RSA\"," +
//
//
//                "\"Ramsagar\":\"RSG\"," +
//
//
//                "\"Ratanshahr\":\"RSH\"," +
//
//
//                "\"Rasmara\":\"RSM\"," +
//
//
//                "\"Rasana\":\"RSNA\"," +
//
//
//                "\"Raisinghnagar\":\"RSNR\"," +
//
//
//                "\"Rasra\":\"RSR\"," +
//
//
//                "\"Rmgrhshekhwati\":\"RSWT\"," +
//
//
//                "\"Rasayani\":\"RSYI\"," +
//
//
//                "\"Ruthiyai\":\"RTA\"," +
//
//
//                "\"Rangtong\":\"RTG\"," +
//
//
//                "\"Ratangaon\":\"RTGN\"," +
//
//
//                "\"Raoti\":\"RTI\"," +
//
//
//                "\"Ramtek\":\"RTK\"," +
//
//
//                "\"Ratanpura\":\"RTP\"," +
//
//
//                "\"Rasulabad\":\"RUB\"," +
//
//
//                "\"Rajlugarhi\":\"RUG\"," +
//
//
//                "\"Rukni\":\"RUI\"," +
//
//
//                "\"Ranuj\":\"RUJ\"," +
//
//
//                "\"Rauli\":\"RUL\"," +
//
//
//                "\"Rupamau\":\"RUM\"," +
//
//
//                "\"Rudrapur City\":\"RUPC\"," +
//
//
//                "\"Rudrapur Road\":\"RUPR\"," +
//
//
//                "\"Ranpur\":\"RUR\"," +
//
//
//                "\"Rura\":\"RURA\"," +
//
//
//                "\"Ratnal\":\"RUT\"," +
//
//
//                "\"Raver\":\"RV\"," +
//
//
//                "\"Ravikampadu\":\"RVD\"," +
//
//
//                "\"Rajabhatkhawa\":\"RVK\"," +
//
//
//                "\"Ravindrakhani\":\"RVKH\"," +
//
//
//                "\"Rowriahsdg\":\"RWH\"," +
//
//
//                "\"Rawaniadungar\":\"RWJ\"," +
//
//
//                "\"Raiwala\":\"RWL\"," +
//
//
//                "\"Ranavav\":\"RWO\"," +
//
//
//                "\"Rowtabagan\":\"RWTB\"," +
//
//
//                "\"Ramsan\":\"RXN\"," +
//
//
//                "\"Ratangarh West\":\"RXW\"," +
//
//
//                "\"Rayanapad\":\"RYP\"," +
//
//
//                "\"Rasuriya\":\"RYS\"," +
//
//
//                "\"Rauzagaon\":\"RZN\"," +
//
//
//                "\"Shrirangapatna\":\"S\"," +
//
//
//                "\"Sathiaon\":\"SAA\"," +
//
//
//                "\"Santamagulur\":\"SAB\"," +
//
//
//                "\"Sonada\":\"SAD\"," +
//
//
//                "\"Simaria\":\"SAE\"," +
//
//
//                "\"Sangrur\":\"SAG\"," +
//
//
//                "\"Shrirajnagar\":\"SAGR\"," +
//
//
//                "\"Saphale\":\"SAH\"," +
//
//
//                "\"Sathi\":\"SAHI\"," +
//
//
//                "\"Sarai\":\"SAI\"," +
//
//
//                "\"Salwa\":\"SAL\"," +
//
//
//                "\"Salar\":\"SALE\"," +
//
//
//                "\"Salur\":\"SALR\"," +
//
//
//                "\"Salemmarket\":\"SAMT\"," +
//
//
//                "\"Sandila\":\"SAN\"," +
//
//
//                "\"Sardarnagar\":\"SANR\"," +
//
//
//                "\"Sagoni\":\"SAO\"," +
//
//
//                "\"Shahzadnagar\":\"SAR\"," +
//
//
//                "\"Shdsprapadmpra\":\"SAS\"," +
//
//
//                "\"Sasangir\":\"SASG\"," +
//
//
//                "\"Sausar\":\"SASR\"," +
//
//
//                "\"Sant Road\":\"SAT\"," +
//
//
//                "\"Sanand\":\"SAU\"," +
//
//
//                "\"Savda\":\"SAV\"," +
//
//
//                "\"Suriawan\":\"SAW\"," +
//
//
//                "\"Sahibabad\":\"SBB\"," +
//
//
//                "\"Sleemanabad Road\":\"SBD\"," +
//
//
//                "\"Sorbhog Jn.\":\"SBE\"," +
//
//
//                "\"Sulebhavi\":\"SBH\"," +
//
//
//                "\"Shribhavnath\":\"SBHN\"," +
//
//
//                "\"Subrahmanyaroa\":\"SBHR\"," +
//
//
//                "\"Sabarmati Jn.\":\"SBI\"," +
//
//
//                "\"Sabalgarh\":\"SBL\"," +
//
//
//                "\"Shribalaji\":\"SBLJ\"," +
//
//
//                "\"Shribdryalathi\":\"SBLT\"," +
//
//
//                "\"Shrivijainagar\":\"SBNR\"," +
//
//
//                "\"Sabaur\":\"SBO\"," +
//
//
//                "\"Sambalpur Road\":\"SBPD\"," +
//
//
//                "\"Sambharlake\":\"SBR\"," +
//
//
//                "\"Sarbahara\":\"SBRA\"," +
//
//
//                "\"Sangranasahib\":\"SBS\"," +
//
//
//                "\"Sabarmati Jn.\":\"SBT\"," +
//
//
//                "\"Sbhakhtiyarpur\":\"SBV\"," +
//
//
//                "\"Sbewbabudih\":\"SBW\"," +
//
//
//                "\"Solanbrewery\":\"SBY\"," +
//
//
//                "\"Sachin\":\"SCH\"," +
//
//
//                "\"Sanchi\":\"SCI\"," +
//
//
//                "\"Salichauka Road\":\"SCKR\"," +
//
//
//                "\"Simhachalam\":\"SCM\"," +
//
//
//                "\"Satuna\":\"SCO\"," +
//
//
//                "\"Sirnapalli\":\"SCP\"," +
//
//
//                "\"Shamchaurasi\":\"SCQ\"," +
//
//
//                "\"Secbadtwncb\":\"SCTN\"," +
//
//
//                "\"Sidhauli\":\"SD\"," +
//
//
//                "\"Sindhawadar\":\"SDD\"," +
//
//
//                "\"Sadisopur\":\"SDE\"," +
//
//
//                "\"Sudsar\":\"SDF\"," +
//
//
//                "\"Sahadaibuzurg\":\"SDG\"," +
//
//
//                "\"Sridungargarh\":\"SDGH\"," +
//
//
//                "\"Sardargram\":\"SDGM\"," +
//
//
//                "\"Saradhna\":\"SDH\"," +
//
//
//                "\"Shahdol\":\"SDL\"," +
//
//
//                "\"Sundlak\":\"SDLK\"," +
//
//
//                "\"Surareddipalem\":\"SDM\"," +
//
//
//                "\"Sudamdih\":\"SDMD\"," +
//
//
//                "\"Sidmukh\":\"SDMK\"," +
//
//
//                "\"Sholavandan\":\"SDN\"," +
//
//
//                "\"Sindpan\":\"SDPN\"," +
//
//
//                "\"Sadulshahr\":\"SDS\"," +
//
//
//                "\"Sadat\":\"SDT\"," +
//
//
//                "\"Somidevipalle\":\"SDV\"," +
//
//
//                "\"Semla\":\"SE\"," +
//
//
//                "\"Sonnagar\":\"SEB\"," +
//
//
//                "\"Salkhiacbo\":\"SEC\"," +
//
//
//                "\"Shedbal\":\"SED\"," +
//
//
//                "\"Shegaon\":\"SEG\"," +
//
//
//                "\"Sehore\":\"SEH\"," +
//
//
//                "\"Shendri\":\"SEI\"," +
//
//
//                "\"Selu\":\"SELU\"," +
//
//
//                "\"Seram\":\"SEM\"," +
//
//
//                "\"Senapura\":\"SEN\"," +
//
//
//                "\"Seohara\":\"SEO\"," +
//
//
//                "\"Semari\":\"SES\"," +
//
//
//                "\"Settihally\":\"SET\"," +
//
//
//                "\"Sendra\":\"SEU\"," +
//
//
//                "\"Sithalavai\":\"SEV\"," +
//
//
//                "\"Seoni\":\"SEY\"," +
//
//
//                "\"Saintala\":\"SFC\"," +
//
//
//                "\"Subedarganj\":\"SFG\"," +
//
//
//                "\"Sikir\":\"SFK\"," +
//
//
//                "\"Sunam\":\"SFM\"," +
//
//
//                "\"Sarangpur\":\"SFW\"," +
//
//
//                "\"Safilguda\":\"SFX\"," +
//
//
//                "\"Shajapur\":\"SFY\"," +
//
//
//                "\"Sareigram\":\"SGAM\"," +
//
//
//                "\"Songadh\":\"SGD\"," +
//
//
//                "\"Sigadam\":\"SGDM\"," +
//
//
//                "\"Sankaridrug\":\"SGE\"," +
//
//
//                "\"Sangat\":\"SGF\"," +
//
//
//                "\"Sultanganj\":\"SGG\"," +
//
//
//                "\"Safdarganj\":\"SGJ\"," +
//
//
//                "\"Srungavruksham\":\"SGKM\"," +
//
//
//                "\"Sangola\":\"SGLA\"," +
//
//
//                "\"Solgampatti\":\"SGM\"," +
//
//
//                "\"Shrigonda Road\":\"SGND\"," +
//
//
//                "\"Saugor\":\"SGO\"," +
//
//
//                "\"Sohagpur\":\"SGP\"," +
//
//
//                "\"Sangmeshwar\":\"SGR\"," +
//
//
//                "\"Sangaria\":\"SGRA\"," +
//
//
//                "\"Sulgare\":\"SGRD\"," +
//
//
//                "\"Sulgare\":\"SGRE\"," +
//
//
//                "\"Shoghi\":\"SGS\"," +
//
//
//                "\"Siliguru Town\":\"SGUT\"," +
//
//
//                "\"Saragchni\":\"SGV\"," +
//
//
//                "\"Singwal\":\"SGW\"," +
//
//
//                "\"Shahbadmarknda\":\"SHDM\"," +
//
//
//                "\"Shadhoragaon\":\"SHDR\"," +
//
//
//                "\"Seoraphuli\":\"SHE\"," +
//
//
//                "\"Shirud\":\"SHF\"," +
//
//
//                "\"Shapur Jn.\":\"SHH\"," +
//
//
//                "\"Sheikpura\":\"SHK\"," +
//
//
//                "\"Shalashahthana\":\"SHLT\"," +
//
//
//                "\"Shiroor\":\"SHMI\"," +
//
//
//                "\"Shivnagar\":\"SHNG\"," +
//
//
//                "\"Shadnagar\":\"SHNR\"," +
//
//
//                "\"Sheosinghpura\":\"SHNX\"," +
//
//
//                "\"Sihora Road\":\"SHR\"," +
//
//
//                "\"Saijsertha Road\":\"SHRD\"," +
//
//
//                "\"Shertallaioa\":\"SHTA\"," +
//
//
//                "\"Silghat Town\":\"SHTT\"," +
//
//
//                "\"Sholinghur\":\"SHU\"," +
//
//
//                "\"Shivani\":\"SHV\"," +
//
//
//                "\"Summerhill\":\"SHZ\"," +
//
//
//                "\"Raisi\":\"SI\"," +
//
//
//                "\"Sonik\":\"SIC\"," +
//
//
//                "\"Siddhpur\":\"SID\"," +
//
//
//                "\"Siddampalli\":\"SIE\"," +
//
//
//                "\"Sirli\":\"SIF\"," +
//
//
//                "\"Siho\":\"SIHO\"," +
//
//
//                "\"Sitimani\":\"SII\"," +
//
//
//                "\"Sakhigopal\":\"SIL\"," +
//
//
//                "\"Silao\":\"SILO\"," +
//
//
//                "\"Shriamirgadh\":\"SIM\"," +
//
//
//                "\"Sini Jn.\":\"SINI\"," +
//
//
//                "\"Samakhiali\":\"SIO\"," +
//
//
//                "\"Suraimanpur\":\"SIP\"," +
//
//
//                "\"Sarkoni\":\"SIQ\"," +
//
//
//                "\"Sirhind Jn.\":\"SIR\"," +
//
//
//                "\"Sirran\":\"SIRN\"," +
//
//
//                "\"Shirravde\":\"SIW\"," +
//
//
//                "\"Sajanvar Road\":\"SJF\"," +
//
//
//                "\"Sgmjagarlamudi\":\"SJL\"," +
//
//
//                "\"Sanjan\":\"SJN\"," +
//
//
//                "\"Sujanpur\":\"SJNP\"," +
//
//
//                "\"Shujalpur\":\"SJP\"," +
//
//
//                "\"Surajpur Road\":\"SJQ\"," +
//
//
//                "\"Shamlaji Road\":\"SJS\"," +
//
//
//                "\"Salemgarhmasani\":\"SJSM\"," +
//
//
//                "\"Shujaatpur\":\"SJT\"," +
//
//
//                "\"Sojitra\":\"SJTR\"," +
//
//
//                "\"Sikandrarao\":\"SKA\"," +
//
//
//                "\"Sakhotitanda\":\"SKF\"," +
//
//
//                "\"Saktesgarh\":\"SKGH\"," +
//
//
//                "\"Sakri Jn.\":\"SKI\"," +
//
//
//                "\"Sahibpurkml Jn.\":\"SKJ\"," +
//
//
//                "\"Sikkal\":\"SKK\"," +
//
//
//                "\"Sakleshpur\":\"SKLR\"," +
//
//
//                "\"Singarayakonda\":\"SKM\"," +
//
//
//                "\"Srikrishnnagar\":\"SKN\"," +
//
//
//                "\"Shankarpalli\":\"SKP\"," +
//
//
//                "\"Shrikalyanpura\":\"SKPA\"," +
//
//
//                "\"Somanayakkanpti\":\"SKPT\"," +
//
//
//                "\"Sikandarpur\":\"SKQ\"," +
//
//
//                "\"Sakhpur\":\"SKR\"," +
//
//
//                "\"Salekasa\":\"SKS\"," +
//
//
//                "\"Sakti\":\"SKT\"," +
//
//
//                "\"Sankval\":\"SKVL\"," +
//
//
//                "\"Shikara\":\"SKY\"," +
//
//
//                "\"Salboni\":\"SLB\"," +
//
//
//                "\"Sakaldiha\":\"SLD\"," +
//
//
//                "\"Silli\":\"SLF\"," +
//
//
//                "\"Simlagarh\":\"SLG\"," +
//
//
//                "\"Shelgoanh\":\"SLGH\"," +
//
//
//                "\"Siliari\":\"SLH\"," +
//
//
//                "\"Sulahhmchlpdh\":\"SLHP\"," +
//
//
//                "\"Sakrigali Jn.\":\"SLJ\"," +
//
//
//                "\"Sandalkalan\":\"SLKN\"," +
//
//
//                "\"Salka Road\":\"SLKR\"," +
//
//
//                "\"Salakati\":\"SLKX\"," +
//
//
//                "\"Somalapuram\":\"SLM\"," +
//
//
//                "\"Salauna\":\"SLNA\"," +
//
//
//                "\"Shivalingapuram\":\"SLPM\"," +
//
//
//                "\"Shilpaprabesh\":\"SLPP\"," +
//
//
//                "\"Salogra\":\"SLR\"," +
//
//
//                "\"Surla Road\":\"SLRD\"," +
//
//
//                "\"Salarpur\":\"SLRP\"," +
//
//
//                "\"Salanpur\":\"SLS\"," +
//
//
//                "\"Silaut\":\"SLT\"," +
//
//
//                "\"Sohwal\":\"SLW\"," +
//
//
//                "\"Samalpatti\":\"SLY\"," +
//
//
//                "\"Samsi\":\"SM\"," +
//
//
//                "\"Samudragarh\":\"SMAE\"," +
//
//
//                "\"Simbhooli\":\"SMBL\"," +
//
//
//                "\"Samba\":\"SMBX\"," +
//
//
//                "\"Samnapur\":\"SMC\"," +
//
//
//                "\"Simenchapari\":\"SMCP\"," +
//
//
//                "\"Shimoga\":\"SME\"," +
//
//
//                "\"Samalkha\":\"SMK\"," +
//
//
//                "\"Samlaya Jn.\":\"SMLA\"," +
//
//
//                "\"Shimiliaguda\":\"SMLG\"," +
//
//
//                "\"Semapur\":\"SMO\"," +
//
//
//                "\"Shambhupura\":\"SMP\"," +
//
//
//                "\"Shrimadhopur\":\"SMPR\"," +
//
//
//                "\"Samdhari Jn.\":\"SMR\"," +
//
//
//                "\"Sumreri\":\"SMRR\"," +
//
//
//                "\"Salamatpur\":\"SMT\"," +
//
//
//                "\"Samuktala Road\":\"SMTA\"," +
//
//
//                "\"Sambhu\":\"SMU\"," +
//
//
//                "\"Saraimir\":\"SMZ\"," +
//
//
//                "\"Sukna\":\"SN\"," +
//
//
//                "\"Sunderabad\":\"SNBD\"," +
//
//
//                "\"Snarayanchpla\":\"SNC\"," +
//
//
//                "\"Sindhudurg\":\"SNDD\"," +
//
//
//                "\"Shenoli\":\"SNE\"," +
//
//
//                "\"Sanatnagar\":\"SNF\"," +
//
//
//                "\"Sanganer\":\"SNGN\"," +
//
//
//                "\"Singhpur\":\"SNGP\"," +
//
//
//                "\"Sanganapur\":\"SNGR\"," +
//
//
//                "\"Saunshi\":\"SNH\"," +
//
//
//                "\"Sindi\":\"SNI\"," +
//
//
//                "\"Sindkheda\":\"SNK\"," +
//
//
//                "\"Sankarankovil\":\"SNKL\"," +
//
//
//                "\"Sanka\":\"SNKR\"," +
//
//
//                "\"Sanahwal\":\"SNL\"," +
//
//
//                "\"Santalpur\":\"SNLR\"," +
//
//
//                "\"Sitanagaram\":\"SNM\"," +
//
//
//                "\"Sonegaon\":\"SNN\"," +
//
//
//                "\"Sonipat\":\"SNP\"," +
//
//
//                "\"Singarpur\":\"SNPR\"," +
//
//
//                "\"Sankarpur\":\"SNQ\"," +
//
//
//                "\"Sansarpur\":\"SNRR\"," +
//
//
//                "\"Sasni\":\"SNS\"," +
//
//
//                "\"Sonshelu\":\"SNSL\"," +
//
//
//                "\"Sonasan\":\"SNSN\"," +
//
//
//                "\"Sanosaranandra\":\"SNSR\"," +
//
//
//                "\"Sainthia\":\"SNT\"," +
//
//
//                "\"Santaldih\":\"SNTD\"," +
//
//
//                "\"Sangrampur\":\"SNU\"," +
//
//
//                "\"Sanvatsar\":\"SNVR\"," +
//
//
//                "\"Saneh Road\":\"SNX\"," +
//
//
//                "\"Sanosra\":\"SOA\"," +
//
//
//                "\"Somrabazar\":\"SOAE\"," +
//
//
//                "\"Silanibari\":\"SOB\"," +
//
//
//                "\"Shillongoa\":\"SOC\"," +
//
//
//                "\"Sheopurkalan\":\"SOE\"," +
//
//
//                "\"Sogra\":\"SOGR\"," +
//
//
//                "\"Sirohi Road\":\"SOH\"," +
//
//
//                "\"Sarojininagar\":\"SOJ\"," +
//
//
//                "\"Somna\":\"SOM\"," +
//
//
//                "\"Soni\":\"SONI\"," +
//
//
//                "\"Saoner Jn.\":\"SONR\"," +
//
//
//                "\"Shiupur\":\"SOP\"," +
//
//
//                "\"Sonagir\":\"SOR\"," +
//
//
//                "\"Soro\":\"SORO\"," +
//
//
//                "\"Somesar\":\"SOS\"," +
//
//
//                "\"Shohratgarh\":\"SOT\"," +
//
//
//                "\"Suhsarai\":\"SOW\"," +
//
//
//                "\"Sukrimangela\":\"SOY\"," +
//
//
//                "\"Supedi\":\"SPD\"," +
//
//
//                "\"Sullurupeta\":\"SPE\"," +
//
//
//                "\"Stuartpuram\":\"SPF\"," +
//
//
//                "\"Sapekhati\":\"SPK\"," +
//
//
//                "\"Sundaraprmlkoil\":\"SPL\"," +
//
//
//                "\"Sujnipara\":\"SPLE\"," +
//
//
//                "\"Shahjehanpur\":\"SPN\"," +
//
//
//                "\"Surpura\":\"SPO\"," +
//
//
//                "\"Sonarpur Jn.\":\"SPR\"," +
//
//
//                "\"Singapuram Road\":\"SPRD\"," +
//
//
//                "\"Sompeta\":\"SPT\"," +
//
//
//                "\"Silapathar\":\"SPTR\"," +
//
//
//                "\"Sampla\":\"SPZ\"," +
//
//
//                "\"Sattirakkudi\":\"SQD\"," +
//
//
//                "\"Sontalai\":\"SQL\"," +
//
//
//                "\"Saraikansrai\":\"SQN\"," +
//
//
//                "\"Sultanpurlodi\":\"SQR\"," +
//
//
//                "\"Sabli Road\":\"SR\"," +
//
//
//                "\"Semra\":\"SRA\"," +
//
//
//                "\"Siras\":\"SRAS\"," +
//
//
//                "\"Surbari\":\"SRBR\"," +
//
//
//                "\"Santragachi Jn.\":\"SRC\"," +
//
//
//                "\"Sardarshahr\":\"SRDR\"," +
//
//
//                "\"Surajgarh\":\"SRGH\"," +
//
//
//                "\"Srirangam\":\"SRGM\"," +
//
//
//                "\"Surendranagarg\":\"SRGT\"," +
//
//
//                "\"Sukhparroha\":\"SRHA\"," +
//
//
//                "\"Salmari\":\"SRI\"," +
//
//
//                "\"Shridham\":\"SRID\"," +
//
//
//                "\"Shankargarh\":\"SRJ\"," +
//
//
//                "\"Sirjam\":\"SRJM\"," +
//
//
//                "\"Samrau\":\"SRK\"," +
//
//
//                "\"Semarkheri\":\"SRKI\"," +
//
//
//                "\"Sherekan\":\"SRKN\"," +
//
//
//                "\"Sarola\":\"SRL\"," +
//
//
//                "\"Soron\":\"SRN\"," +
//
//
//                "\"Sriramnagar\":\"SRNR\"," +
//
//
//                "\"Sirathu\":\"SRO\"," +
//
//
//                "\"Serampore\":\"SRP\"," +
//
//
//                "\"Swarupganj\":\"SRPJ\"," +
//
//
//                "\"Sarupsar Jn.\":\"SRPR\"," +
//
//
//                "\"Sarsi\":\"SRSI\"," +
//
//
//                "\"Satur\":\"SRT\"," +
//
//
//                "\"Shertalai\":\"SRTL\"," +
//
//
//                "\"Sibsagar Town\":\"SRTN\"," +
//
//
//                "\"Sirpur Town\":\"SRUR\"," +
//
//
//                "\"Shirva\":\"SRVA\"," +
//
//
//                "\"Suravali\":\"SRVX\"," +
//
//
//                "\"Shrikaranpur\":\"SRW\"," +
//
//
//                "\"Saraswatinagar\":\"SRWN\"," +
//
//
//                "\"Suranussi\":\"SRX\"," +
//
//
//                "\"Shirsoli\":\"SS\"," +
//
//
//                "\"Shakurbasti\":\"SSB\"," +
//
//
//                "\"Suisa\":\"SSIA\"," +
//
//
//                "\"Sisarka\":\"SSKA\"," +
//
//
//                "\"Sirsaul\":\"SSL\"," +
//
//
//                "\"Sasaram\":\"SSM\"," +
//
//
//                "\"Sason\":\"SSN\"," +
//
//
//                "\"Sadashivapet Road\":\"SSPD\"," +
//
//
//                "\"Sareri\":\"SSR\"," +
//
//
//                "\"Sarsawa\":\"SSW\"," +
//
//
//                "\"Shantipur\":\"STB\"," +
//
//
//                "\"Santacruz\":\"STC\"," +
//
//
//                "\"Satrod\":\"STD\"," +
//
//
//                "\"Satadhar\":\"STDR\"," +
//
//
//                "\"Sikta\":\"STF\"," +
//
//
//                "\"Sathajagat\":\"STJT\"," +
//
//
//                "\"Sasthankotta\":\"STKT\"," +
//
//
//                "\"Simultala\":\"STL\"," +
//
//
//                "\"Sitarampur\":\"STN\"," +
//
//
//                "\"Satnali\":\"STNL\"," +
//
//
//                "\"Sitapur\":\"STP\"," +
//
//
//                "\"Snarayanapuram\":\"STPM\"," +
//
//
//                "\"Sitampet\":\"STPT\"," +
//
//
//                "\"Sataraoa\":\"STRC\"," +
//
//
//                "\"Shaitansinghngr\":\"STSN\"," +
//
//
//                "\"Satulur\":\"STUR\"," +
//
//
//                "\"Sahatwar\":\"STW\"," +
//
//
//                "\"Sunak\":\"SUC\"," +
//
//
//                "\"Sudhani\":\"SUD\"," +
//
//
//                "\"Summadevi\":\"SUDV\"," +
//
//
//                "\"Sujangarh\":\"SUJH\"," +
//
//
//                "\"Sukhpur\":\"SUKP\"," +
//
//
//                "\"Suladhal\":\"SUL\"," +
//
//
//                "\"Sulhani\":\"SULH\"," +
//
//
//                "\"Sumer\":\"SUMR\"," +
//
//
//                "\"Shrungavarpukta\":\"SUP\"," +
//
//
//                "\"Surajpur\":\"SUPR\"," +
//
//
//                "\"Sholapurcb\":\"SURC\"," +
//
//
//                "\"Sureli\":\"SURL\"," +
//
//
//                "\"Solapur Jn.\":\"SURM\"," +
//
//
//                "\"Suratpura\":\"SURP\"," +
//
//
//                "\"Sukhisewaniyan\":\"SUW\"," +
//
//
//                "\"Sudiyur\":\"SUX\"," +
//
//
//                "\"Subansiri\":\"SUZ\"," +
//
//
//                "\"Suwasra\":\"SVA\"," +
//
//
//                "\"Savni\":\"SVB\"," +
//
//
//                "\"Sarwari\":\"SVD\"," +
//
//
//                "\"Sivaganga\":\"SVGA\"," +
//
//
//                "\"Shrivagilu\":\"SVGL\"," +
//
//
//                "\"Sonadanga\":\"SVH\"," +
//
//
//                "\"Sisvinhalli\":\"SVHE\"," +
//
//
//                "\"Sagarpali\":\"SVI\"," +
//
//
//                "\"Sajiyavadar\":\"SVJ\"," +
//
//
//                "\"Sivajinagar\":\"SVJR\"," +
//
//
//                "\"Savarkundla\":\"SVKD\"," +
//
//
//                "\"Sivakasi\":\"SVKS\"," +
//
//
//                "\"Sevaliya\":\"SVL\"," +
//
//
//                "\"Sanverdamchuch\":\"SVM\"," +
//
//
//                "\"Sivungaon\":\"SVN\"," +
//
//
//                "\"Savanur\":\"SVNR\"," +
//
//
//                "\"Sanvrad\":\"SVO\"," +
//
//
//                "\"Svenkteswrpalm\":\"SVPM\"," +
//
//
//                "\"Srivilliputtur\":\"SVPR\"," +
//
//
//                "\"Shivanarayanpur\":\"SVRP\"," +
//
//
//                "\"Shivpura\":\"SVT\"," +
//
//
//                "\"Srivaikuntam\":\"SVV\"," +
//
//
//                "\"Shivnishivapur\":\"SVW\"," +
//
//
//                "\"Savarda\":\"SVX\"," +
//
//
//                "\"Saraiharkhu\":\"SVZ\"," +
//
//
//                "\"Sehramau\":\"SW\"," +
//
//
//                "\"Sahjanwa\":\"SWA\"," +
//
//
//                "\"Shivrampur\":\"SWC\"," +
//
//
//                "\"Sanawad\":\"SWD\"," +
//
//
//                "\"Siwaith\":\"SWE\"," +
//
//
//                "\"Sathin Road\":\"SWF\"," +
//
//
//                "\"Swamimalai\":\"SWI\"," +
//
//
//                "\"Siajuli\":\"SWJ\"," +
//
//
//                "\"Sawaimdhopr Jn.\":\"SWMM\"," +
//
//
//                "\"Siwani\":\"SWNI\"," +
//
//
//                "\"Sonwara\":\"SWO\"," +
//
//
//                "\"Sewapuri\":\"SWPR\"," +
//
//
//                "\"Sonua\":\"SWR\"," +
//
//
//                "\"Sahawar Town\":\"SWRT\"," +
//
//
//                "\"Suwansa\":\"SWS\"," +
//
//
//                "\"Saidanwala\":\"SWX\"," +
//
//
//                "\"Sambre\":\"SXB\"," +
//
//
//                "\"Sonakhan\":\"SXN\"," +
//
//
//                "\"Sankopara\":\"SXP\"," +
//
//
//                "\"Salem Town\":\"SXT\"," +
//
//
//                "\"Suku\":\"SXV\"," +
//
//
//                "\"Sanha\":\"SXW\"," +
//
//
//                "\"Sirkazhi\":\"SY\"," +
//
//
//                "\"Salaia\":\"SYA\"," +
//
//
//                "\"Saraichandi\":\"SYC\"," +
//
//
//                "\"Singarenicolrs\":\"SYI\"," +
//
//
//                "\"Saidraja\":\"SYJ\"," +
//
//
//                "\"Saidkhanpur\":\"SYK\"," +
//
//
//                "\"Salpura\":\"SYL\"," +
//
//
//                "\"Savalyapuram\":\"SYM\"," +
//
//
//                "\"Sayan\":\"SYN\"," +
//
//
//                "\"Sarayan\":\"SYU\"," +
//
//
//                "\"Sindurwa\":\"SYW\"," +
//
//
//                "\"Saiyidsarawan\":\"SYWN\"," +
//
//
//                "\"Sarotra Road\":\"SZA\"," +
//
//
//                "\"Sarona\":\"SZB\"," +
//
//
//                "\"Surkhandkakh\":\"SZK\"," +
//
//
//                "\"Subzimandi\":\"SZM\"," +
//
//
//                "\"Sarupathar\":\"SZR\"," +
//
//
//                "\"Silakjhori\":\"SZY\"," +
//
//
//                "\"Tanur\":\"TA\"," +
//
//
//                "\"Tadali\":\"TAE\"," +
//
//
//                "\"Takal\":\"TAKL\"," +
//
//
//                "\"Taku\":\"TAKU\"," +
//
//
//                "\"Tarana Road\":\"TAN\"," +
//
//
//                "\"Tamna\":\"TAO\"," +
//
//
//                "\"Tapa\":\"TAPA\"," +
//
//
//                "\"Tharsa\":\"TAR\"," +
//
//
//                "\"Tummanamgutta\":\"TAT\"," +
//
//
//                "\"Talala Jn.\":\"TAV\"," +
//
//
//                "\"Talaiyuthu\":\"TAY\"," +
//
//
//                "\"Targaon\":\"TAZ\"," +
//
//
//                "\"Timba Road\":\"TBA\"," +
//
//
//                "\"Tribeni\":\"TBAE\"," +
//
//
//                "\"Tilbhita\":\"TBB\"," +
//
//
//                "\"Tatibahar\":\"TBH\"," +
//
//
//                "\"Timarni\":\"TBN\"," +
//
//
//                "\"Talbahat\":\"TBT\"," +
//
//
//                "\"Timbarva\":\"TBV\"," +
//
//
//                "\"Tiruchchuli\":\"TCH\"," +
//
//
//                "\"Tiruchendur\":\"TCN\"," +
//
//
//                "\"Tindharia\":\"TDH\"," +
//
//
//                "\"Tiruparankndrm\":\"TDN\"," +
//
//
//                "\"Tandaurmar\":\"TDO\"," +
//
//
//                "\"Todarpur\":\"TDP\"," +
//
//
//                "\"Tirupadripulyur\":\"TDPR\"," +
//
//
//                "\"Tiruvidalmarudr\":\"TDR\"," +
//
//
//                "\"Todaraisingh\":\"TDRS\"," +
//
//
//                "\"Tandur\":\"TDU\"," +
//
//
//                "\"Thondebhavi\":\"TDV\"," +
//
//
//                "\"Taregna\":\"TEA\"," +
//
//
//                "\"Teli\":\"TELI\"," +
//
//
//                "\"Telo\":\"TELO\"," +
//
//
//                "\"Teni\":\"TENI\"," +
//
//
//                "\"Telta\":\"TETA\"," +
//
//
//                "\"Teghra\":\"TGA\"," +
//
//
//                "\"Titagarh\":\"TGH\"," +
//
//
//                "\"Tuggali\":\"TGL\"," +
//
//
//                "\"Tangarmunda\":\"TGM\"," +
//
//
//                "\"Talegaon\":\"TGN\"," +
//
//
//                "\"Tuljapur\":\"TGP\"," +
//
//
//                "\"Tenganmada\":\"TGQ\"," +
//
//
//                "\"Tinaighat\":\"TGT\"," +
//
//
//                "\"Tarigoppula\":\"TGU\"," +
//
//
//                "\"Than Jn.\":\"THAN\"," +
//
//
//                "\"Thanabihpur Jn.\":\"THB\"," +
//
//
//                "\"Thandla Road\":\"THDR\"," +
//
//
//                "\"Thawe Jn.\":\"THE\"," +
//
//
//                "\"Talheribuzurg\":\"THJ\"," +
//
//
//                "\"Thallak\":\"THKU\"," +
//
//
//                "\"Thalyathamira\":\"THM\"," +
//
//
//                "\"Thathanamithri\":\"THMR\"," +
//
//
//                "\"Tulin\":\"THO\"," +
//
//
//                "\"Taherpur\":\"THP\"," +
//
//
//                "\"Thuria\":\"THUR\"," +
//
//
//                "\"Therubali\":\"THV\"," +
//
//
//                "\"Thivim\":\"THVM\"," +
//
//
//                "\"Thadi\":\"THY\"," +
//
//
//                "\"Tilaya\":\"TIA\"," +
//
//
//                "\"Tibi\":\"TIBI\"," +
//
//
//                "\"Tihu\":\"TIHU\"," +
//
//
//                "\"Tilrath\":\"TIL\"," +
//
//
//                "\"Timmanacherla\":\"TIM\"," +
//
//
//                "\"Tattapparai\":\"TIP\"," +
//
//
//                "\"Tatisilwai\":\"TIS\"," +
//
//
//                "\"Tisi\":\"TISI\"," +
//
//
//                "\"Talit\":\"TIT\"," +
//
//
//                "\"Tilaru\":\"TIU\"," +
//
//
//                "\"Tivari\":\"TIW\"," +
//
//
//                "\"Talaja\":\"TJA\"," +
//
//
//                "\"Tajpurdehma\":\"TJD\"," +
//
//
//                "\"Tajpur\":\"TJP\"," +
//
//
//                "\"Tumkur\":\"TK\"," +
//
//
//                "\"Teharka\":\"TKA\"," +
//
//
//                "\"Tupkadih\":\"TKB\"," +
//
//
//                "\"Tsakibanda\":\"TKBN\"," +
//
//
//                "\"Tuglakabad\":\"TKD\"," +
//
//
//                "\"Tarikere\":\"TKE\"," +
//
//
//                "\"Thakurganj\":\"TKG\"," +
//
//
//                "\"Takarkhede\":\"TKHE\"," +
//
//
//                "\"Takli\":\"TKI\"," +
//
//
//                "\"Tilak Bridge\":\"TKJ\"," +
//
//
//                "\"Tikekarwadi\":\"TKKD\"," +
//
//
//                "\"Tankuppa\":\"TKN\"," +
//
//
//                "\"Trikarpur\":\"TKQ\"," +
//
//
//                "\"Takari\":\"TKR\"," +
//
//
//                "\"Tikiri\":\"TKRI\"," +
//
//
//                "\"Tanakallu\":\"TKU\"," +
//
//
//                "\"Tikaria\":\"TKYR\"," +
//
//
//                "\"Talchhapar\":\"TLC\"," +
//
//
//                "\"Tilda\":\"TLD\"," +
//
//
//                "\"Talgaria\":\"TLE\"," +
//
//
//                "\"Talguppa\":\"TLGP\"," +
//
//
//                "\"Tilhar\":\"TLH\"," +
//
//
//                "\"Tulwarajhil\":\"TLI\"," +
//
//
//                "\"Taljhari\":\"TLJ\"," +
//
//
//                "\"Talakhajuri\":\"TLKH\"," +
//
//
//                "\"Trilochanmahdo\":\"TLMD\"," +
//
//
//                "\"Tilaunchi\":\"TLNH\"," +
//
//
//                "\"Tulsipur\":\"TLR\"," +
//
//
//                "\"Tarlupadu\":\"TLU\"," +
//
//
//                "\"Thalwara\":\"TLWA\"," +
//
//
//                "\"Talavli\":\"TLZ\"," +
//
//
//                "\"Talamanchi\":\"TMC\"," +
//
//
//                "\"Talmadla\":\"TMD\"," +
//
//
//                "\"Tutimelur\":\"TME\"," +
//
//
//                "\"Tenmalai\":\"TML\"," +
//
//
//                "\"Tirumangalam\":\"TMQ\"," +
//
//
//                "\"Tindivanam\":\"TMV\"," +
//
//
//                "\"Timmapur\":\"TMX\"," +
//
//
//                "\"Tamluk\":\"TMZ\"," +
//
//
//                "\"Thane\":\"TNA\"," +
//
//
//                "\"Toranagallu\":\"TNGL\"," +
//
//
//                "\"Tandarai\":\"TNI\"," +
//
//
//                "\"Tirunellikaval\":\"TNK\"," +
//
//
//                "\"Tanuku\":\"TNKU\"," +
//
//
//                "\"Tangla\":\"TNL\"," +
//
//
//                "\"Tiruvannamalai\":\"TNM\"," +
//
//
//                "\"Tondiarpet\":\"TNP\"," +
//
//
//                "\"Tanguturu\":\"TNR\"," +
//
//
//                "\"Tenneru\":\"TNRU\"," +
//
//
//                "\"Taraknagar\":\"TNX\"," +
//
//
//                "\"Talod\":\"TOD\"," +
//
//
//                "\"Tamkuhi Road\":\"TOI\"," +
//
//
//                "\"Thokur\":\"TOK\"," +
//
//
//                "\"Tondamanpatti\":\"TOM\"," +
//
//
//                "\"Tori\":\"TORI\"," +
//
//
//                "\"Telaprolu\":\"TOU\"," +
//
//
//                "\"Tirchrpalifort\":\"TP\"," +
//
//
//                "\"Tiruppachetti\":\"TPC\"," +
//
//
//                "\"Tiruchrpliplki\":\"TPE\"," +
//
//
//                "\"Tarapith Road\":\"TPF\"," +
//
//
//                "\"Tipling\":\"TPG\"," +
//
//
//                "\"Tinpahar Jn.\":\"TPH\"," +
//
//
//                "\"Talojapanchand\":\"TPND\"," +
//
//
//                "\"Topokal\":\"TPQ\"," +
//
//
//                "\"Tirupattur Jn.\":\"TPT\"," +
//
//
//                "\"Tiruchrpalitwn\":\"TPTN\"," +
//
//
//                "\"Tanakpur\":\"TPU\"," +
//
//
//                "\"Tirupatiwhlt\":\"TPW\"," +
//
//
//                "\"Tadakalpudi\":\"TPY\"," +
//
//
//                "\"Takia\":\"TQA\"," +
//
//
//                "\"Tarangambadi\":\"TQB\"," +
//
//
//                "\"Telam\":\"TQM\"," +
//
//
//                "\"Tikunia\":\"TQN\"," +
//
//
//                "\"Taru\":\"TR\"," +
//
//
//                "\"Tangra\":\"TRA\"," +
//
//
//                "\"Tarangahill\":\"TRAH\"," +
//
//
//                "\"Torang\":\"TRAN\"," +
//
//
//                "\"Tiruverumbur\":\"TRB\"," +
//
//
//                "\"Tirodi\":\"TRDI\"," +
//
//
//                "\"Tarighat\":\"TRG\"," +
//
//
//                "\"Tirukoilur\":\"TRK\"," +
//
//
//                "\"Turekala Road\":\"TRKR\"," +
//
//
//                "\"Trivellore\":\"TRL\"," +
//
//
//                "\"Tirunagesvaram\":\"TRM\"," +
//
//
//                "\"Tirora\":\"TRO\"," +
//
//
//                "\"Taraori\":\"TRR\"," +
//
//
//                "\"Tarsai\":\"TRSR\"," +
//
//
//                "\"Tiruttani\":\"TRT\"," +
//
//
//                "\"Triupunittura\":\"TRTR\"," +
//
//
//                "\"Tiruvalla\":\"TRVL\"," +
//
//
//                "\"Tisua\":\"TSA\"," +
//
//
//                "\"Tahsilbhadra\":\"TSD\"," +
//
//
//                "\"Tahsilfatehpur\":\"TSF\"," +
//
//
//                "\"Tinsukia Jn.\":\"TSK\"," +
//
//
//                "\"Taksal\":\"TSL\"," +
//
//
//                "\"Tsunduru\":\"TSR\"," +
//
//
//                "\"Tallisaidasahu\":\"TSS\"," +
//
//
//                "\"Titte\":\"TT\"," +
//
//
//                "\"Titabar\":\"TTB\"," +
//
//
//                "\"Tirumlaihlsoa\":\"TTH\"," +
//
//
//                "\"Turtipar\":\"TTI\"," +
//
//
//                "\"Tiruttangal\":\"TTL\"," +
//
//
//                "\"Tarntaran\":\"TTO\"," +
//
//
//                "\"Tiruturaipdi Jn.\":\"TTP\"," +
//
//
//                "\"Tiptur\":\"TTR\"," +
//
//
//                "\"Tettu\":\"TTU\"," +
//
//
//                "\"Tukaithad\":\"TTZ\"," +
//
//
//                "\"Tadipatri\":\"TU\"," +
//
//
//                "\"Tirunnavaya\":\"TUA\"," +
//
//
//                "\"Tiraldih\":\"TUL\"," +
//
//
//                "\"Tohana\":\"TUN\"," +
//
//
//                "\"Tung\":\"TUNG\"," +
//
//
//                "\"Tiruppur\":\"TUP\"," +
//
//
//                "\"Turki\":\"TUR\"," +
//
//
//                "\"Turavur\":\"TUVR\"," +
//
//
//                "\"Tuwa\":\"TUWA\"," +
//
//
//                "\"Tunia\":\"TUX\"," +
//
//
//                "\"Adavali\":\"TVD\"," +
//
//
//                "\"Tiruvangur\":\"TVF\"," +
//
//
//                "\"Tavargatti\":\"TVG\"," +
//
//
//                "\"Taradevi\":\"TVI\"," +
//
//
//                "\"Tadwal\":\"TVL\"," +
//
//
//                "\"Tiruppuvanam\":\"TVN\"," +
//
//
//                "\"Trivandrumpett\":\"TVP\"," +
//
//
//                "\"Talwandi\":\"TWB\"," +
//
//
//                "\"Twiningganj\":\"TWG\"," +
//
//
//                "\"Tilwara\":\"TWL\"," +
//
//
//                "\"Tyada\":\"TXD\"," +
//
//
//                "\"Tozhuppedu\":\"TZD\"," +
//
//
//                "\"Upleta\":\"UA\"," +
//
//
//                "\"Uppala\":\"UAA\"," +
//
//
//                "\"Udagamandalam\":\"UAM\"," +
//
//
//                "\"Unawaaithor\":\"UAR\"," +
//
//
//                "\"Ambala City\":\"UBC\"," +
//
//
//                "\"Ubarni\":\"UBN\"," +
//
//
//                "\"Umbargam Road\":\"UBR\"," +
//
//
//                "\"Uchana\":\"UCA\"," +
//
//
//                "\"Unchibassi\":\"UCB\"," +
//
//
//                "\"Unchaulia\":\"UCH\"," +
//
//
//                "\"Uchippuli\":\"UCP\"," +
//
//
//                "\"Udgir\":\"UDGR\"," +
//
//
//                "\"Andal Jn.\":\"UDL\"," +
//
//
//                "\"Undasamadhawpu\":\"UDM\"," +
//
//
//                "\"Udasar\":\"UDS\"," +
//
//
//                "\"Udumalaippettai\":\"UDT\"," +
//
//
//                "\"Urdauli\":\"UDX\"," +
//
//
//                "\"Uppugunduru\":\"UGD\"," +
//
//
//                "\"Ugar Khurd\":\"UGR\"," +
//
//
//                "\"Ugwe\":\"UGWE\"," +
//
//
//                "\"Unahimachal\":\"UHL\"," +
//
//
//                "\"Unchhera\":\"UHR\"," +
//
//
//                "\"Umariaispahlt\":\"UIH\"," +
//
//
//                "\"Ujalvav\":\"UJ\"," +
//
//
//                "\"Unjha\":\"UJA\"," +
//
//
//                "\"Ujhani\":\"UJH\"," +
//
//
//                "\"Ujiarpur\":\"UJP\"," +
//
//
//                "\"Ukhra\":\"UKA\"," +
//
//
//                "\"Ukshi\":\"UKC\"," +
//
//
//                "\"Uttarkathani\":\"UKE\"," +
//
//
//                "\"Ukhali\":\"UKH\"," +
//
//
//                "\"Uttukuli\":\"UKL\"," +
//
//
//                "\"Udalkachar\":\"UKR\"," +
//
//
//                "\"Umranala\":\"ULA\"," +
//
//
//                "\"Ulubaria\":\"ULB\"," +
//
//
//                "\"Achalda\":\"ULD\"," +
//
//
//                "\"Udalguri\":\"ULG\"," +
//
//
//                "\"Ullal\":\"ULL\"," +
//
//
//                "\"Ulhasnagar\":\"ULNR\"," +
//
//
//                "\"Kulti\":\"ULT\"," +
//
//
//                "\"Umardashi\":\"UM\"," +
//
//
//                "\"Umed\":\"UMED\"," +
//
//
//                "\"Umreth\":\"UMH\"," +
//
//
//                "\"Ambliyasan\":\"UMN\"," +
//
//
//                "\"Umeshnagar\":\"UMNR\"," +
//
//
//                "\"Umaria\":\"UMR\"," +
//
//
//                "\"Umra\":\"UMRA\"," +
//
//
//                "\"Umri\":\"UMRI\"," +
//
//
//                "\"Udramsar\":\"UMS\"," +
//
//
//                "\"Unchdih\":\"UND\"," +
//
//
//                "\"Undi\":\"UNDI\"," +
//
//
//                "\"Unaivansada Road\":\"UNI\"," +
//
//
//                "\"Unkal\":\"UNK\"," +
//
//
//                "\"Unhel\":\"UNL\"," +
//
//
//                "\"Unaula\":\"UNLA\"," +
//
//
//                "\"Uttarpara\":\"UPA\"," +
//
//
//                "\"Ulavapadu\":\"UPD\"," +
//
//
//                "\"Uplai\":\"UPI\"," +
//
//
//                "\"Uppalur\":\"UPL\"," +
//
//
//                "\"Usmanpur\":\"UPR\"," +
//
//
//                "\"Uppalavai\":\"UPW\"," +
//
//
//                "\"Umdanagar\":\"UR\"," +
//
//
//                "\"Untare Road\":\"URD\"," +
//
//
//                "\"Uren\":\"UREN\"," +
//
//
//                "\"Usargaon\":\"URG\"," +
//
//
//                "\"Uruli\":\"URI\"," +
//
//
//                "\"Urkura\":\"URK\"," +
//
//
//                "\"Unjalur\":\"URL\"," +
//
//
//                "\"Urma\":\"URMA\"," +
//
//
//                "\"Utran\":\"URN\"," +
//
//
//                "\"Ugrasenpur\":\"URPR\"," +
//
//
//                "\"Ukaisongadh\":\"USD\"," +
//
//
//                "\"Usalapur\":\"USL\"," +
//
//
//                "\"Usilampatti\":\"USLP\"," +
//
//
//                "\"Umartali\":\"UTA\"," +
//
//
//                "\"Utarsanda\":\"UTD\"," +
//
//
//                "\"Utarlai\":\"UTL\"," +
//
//
//                "\"Utrahtia\":\"UTR\"," +
//
//
//                "\"Udvada\":\"UVD\"," +
//
//
//                "\"Bhaga Jn.\":\"VAA\"," +
//
//
//                "\"Vadali\":\"VAE\"," +
//
//
//                "\"Vadal\":\"VAL\"," +
//
//
//                "\"Vapi\":\"VAPI\"," +
//
//
//                "\"Valapattanam\":\"VAPM\"," +
//
//
//                "\"Valkam Road\":\"VARD\"," +
//
//
//                "\"Vatlur\":\"VAT\"," +
//
//
//                "\"Vambori\":\"VBR\"," +
//
//
//                "\"Vaibhavwadi Road\":\"VBW\"," +
//
//
//                "\"Virochannagar\":\"VCN\"," +
//
//
//                "\"Vagdiya\":\"VD\"," +
//
//
//                "\"Vasad Jn.\":\"VDA\"," +
//
//
//                "\"Vendodu\":\"VDD\"," +
//
//
//                "\"Vedayapalem\":\"VDE\"," +
//
//
//                "\"Vadnagar\":\"VDG\"," +
//
//
//                "\"Vadgaonnila\":\"VDGN\"," +
//
//
//                "\"Vedchha\":\"VDH\"," +
//
//
//                "\"Veldurti\":\"VDI\"," +
//
//
//                "\"Vadakannikapurm\":\"VDK\"," +
//
//
//                "\"Vithisvarankol\":\"VDL\"," +
//
//
//                "\"Vadgaon\":\"VDN\"," +
//
//
//                "\"Vidyasagar\":\"VDS\"," +
//
//
//                "\"Vadiyadevli\":\"VDV\"," +
//
//
//                "\"Vedaranniyam\":\"VDY\"," +
//
//
//                "\"Veer\":\"VEER\"," +
//
//
//                "\"Veli\":\"VELI\"," +
//
//
//                "\"Verna\":\"VEN\"," +
//
//
//                "\"Vangani\":\"VGI\"," +
//
//
//                "\"Vaghli\":\"VGL\"," +
//
//
//                "\"Vangaon\":\"VGN\"," +
//
//
//                "\"Unguturu\":\"VGT\"," +
//
//
//                "\"Villianur\":\"VI\"," +
//
//
//                "\"Vilavade\":\"VID\"," +
//
//
//                "\"Vejandla\":\"VJA\"," +
//
//
//                "\"Vijpadi Road\":\"VJD\"," +
//
//
//                "\"Vijapur\":\"VJF\"," +
//
//
//                "\"Vyasarpadijiva\":\"VJM\"," +
//
//
//                "\"Vijiypurjammu\":\"VJPJ\"," +
//
//
//                "\"Vijayanagar\":\"VJR\"," +
//
//
//                "\"Verka Jn.\":\"VKA\"," +
//
//
//                "\"Vikarabad Jn\":\"VKB\"," +
//
//
//                "\"Venkatagiri\":\"VKI\"," +
//
//
//                "\"Venkatesapuram\":\"VKM\"," +
//
//
//                "\"Vinukonda\":\"VKN\"," +
//
//
//                "\"Valmikinagar Road\":\"VKNR\"," +
//
//
//                "\"Venkatnagra\":\"VKR\"," +
//
//
//                "\"Venkatachalam\":\"VKT\"," +
//
//
//                "\"Vilad\":\"VL\"," +
//
//
//                "\"Bavla\":\"VLA\"," +
//
//
//                "\"Vayalpad\":\"VLD\"," +
//
//
//                "\"Valadar\":\"VLDR\"," +
//
//
//                "\"Vallikunnu\":\"VLI\"," +
//
//
//                "\"Vileparle\":\"VLP\"," +
//
//
//                "\"Vellore Cant.\":\"VLR\"," +
//
//
//                "\"Vadalur\":\"VLU\"," +
//
//
//                "\"Valliyur\":\"VLY\"," +
//
//
//                "\"Vallabhvdyangr\":\"VLYN\"," +
//
//
//                "\"Vikramgarhalot\":\"VMA\"," +
//
//
//                "\"Vadlamannadu\":\"VMD\"," +
//
//
//                "\"Vemuru\":\"VMU\"," +
//
//
//                "\"Vaniyambadi\":\"VN\"," +
//
//
//                "\"Varangaon\":\"VNA\"," +
//
//
//                "\"Vaniyambalam\":\"VNB\"," +
//
//
//                "\"Vendra\":\"VND\"," +
//
//
//                "\"Viswanathchrli\":\"VNE\"," +
//
//
//                "\"Visnagar\":\"VNG\"," +
//
//
//                "\"Binaiki\":\"VNK\"," +
//
//
//                "\"Vani Road\":\"VNRD\"," +
//
//
//                "\"Vishnupuram\":\"VNUP\"," +
//
//
//                "\"Vondh\":\"VON\"," +
//
//
//                "\"Virapur\":\"VP\"," +
//
//
//                "\"Ventrapragada\":\"VPG\"," +
//
//
//                "\"Venkatampalle\":\"VPL\"," +
//
//
//                "\"Bhupiamau\":\"VPO\"," +
//
//
//                "\"Visapur\":\"VPR\"," +
//
//
//                "\"Veysarpadi\":\"VPY\"," +
//
//
//                "\"Vailapuzha\":\"VPZ\"," +
//
//
//                "\"Virar\":\"VR\"," +
//
//
//                "\"Valavanur\":\"VRA\"," +
//
//
//                "\"Virdel Road\":\"VRD\"," +
//
//
//                "\"Varediya\":\"VRE\"," +
//
//
//                "\"Vikramnagar\":\"VRG\"," +
//
//
//                "\"Virbhadra\":\"VRH\"," +
//
//
//                "\"Virkudi\":\"VRK\"," +
//
//
//                "\"Varnama\":\"VRM\"," +
//
//
//                "\"Virarakkiyam\":\"VRQ\"," +
//
//
//                "\"Virpur\":\"VRR\"," +
//
//
//                "\"Valiveru\":\"VRU\"," +
//
//
//                "\"Viravada\":\"VRV\"," +
//
//
//                "\"Viravalli\":\"VRVL\"," +
//
//
//                "\"Varahi\":\"VRX\"," +
//
//
//                "\"Vishvamitri\":\"VS\"," +
//
//
//                "\"Vishvamitri\":\"VSI\"," +
//
//
//                "\"Bijaysota\":\"VST\"," +
//
//
//                "\"Bishnupur\":\"VSU\"," +
//
//
//                "\"Vasadva\":\"VSV\"," +
//
//
//                "\"Visavadar\":\"VSW\"," +
//
//
//                "\"Vellore Town\":\"VT\"," +
//
//
//                "\"Vatva\":\"VTA\"," +
//
//
//                "\"Vartej\":\"VTJ\"," +
//
//
//                "\"Vadtalswamnryn\":\"VTL\"," +
//
//
//                "\"Vetapalemu\":\"VTM\"," +
//
//
//                "\"Vaitarna\":\"VTN\"," +
//
//
//                "\"Valantaraval\":\"VTV\"," +
//
//
//                "\"Vaghpura\":\"VU\"," +
//
//
//                "\"Valivade\":\"VV\"," +
//
//
//                "\"Varvala\":\"VVA\"," +
//
//
//                "\"Vivekavihar\":\"VVB\"," +
//
//
//                "\"Vavdi\":\"VVD\"," +
//
//
//                "\"Valivade\":\"VVE\"," +
//
//
//                "\"Vavdi Road\":\"VVF\"," +
//
//
//                "\"Vadviyala\":\"VVL\"," +
//
//
//                "\"Viravasaram\":\"VVM\"," +
//
//
//                "\"Vikravandi\":\"VVN\"," +
//
//
//                "\"Vavera\":\"VVV\"," +
//
//
//                "\"Viduraswattha\":\"VWA\"," +
//
//
//                "\"Vadod\":\"VXD\"," +
//
//
//                "\"Vellpapalyam\":\"VXM\"," +
//
//
//                "\"Vyara\":\"VYA\"," +
//
//
//                "\"Vilayatkalan Road\":\"VYK\"," +
//
//
//                "\"Vyasnagar\":\"VYN\"," +
//
//
//                "\"Balwa\":\"WAB\"," +
//
//
//                "\"Wair\":\"WAIR\"," +
//
//
//                "\"Waltair\":\"WAT\"," +
//
//
//                "\"Wadhwan City\":\"WC\"," +
//
//
//                "\"Wadwalnagnath\":\"WDLN\"," +
//
//
//                "\"Wyndhamganj\":\"WDM\"," +
//
//
//                "\"Wadiaram\":\"WDR\"," +
//
//
//                "\"Wadsinge\":\"WDS\"," +
//
//
//                "\"Wellington\":\"WEL\"," +
//
//
//                "\"Wena\":\"WENA\"," +
//
//
//                "\"Whitefield\":\"WFD\"," +
//
//
//                "\"Waghoda\":\"WGA\"," +
//
//
//                "\"Washim\":\"WHM\"," +
//
//
//                "\"Walajah Road Jn.\":\"WJR\"," +
//
//
//                "\"Vakav\":\"WKA\"," +
//
//
//                "\"Wadakancheri\":\"WKI\"," +
//
//
//                "\"Wan Road\":\"WND\"," +
//
//
//                "\"Wanparti Road\":\"WPR\"," +
//
//
//                "\"Wrscolonyph\":\"WRC\"," +
//
//
//                "\"Wardha East\":\"WRE\"," +
//
//
//                "\"Warora\":\"WRR\"," +
//
//
//                "\"Warisaleganj\":\"WRS\"," +
//
//
//                "\"Washimbe\":\"WSB\"," +
//
//
//                "\"Shivarampur\":\"WSC\"," +
//
//
//                "\"Vasaniyawa\":\"WSE\"," +
//
//
//                "\"Wansjaliya\":\"WSJ\"," +
//
//
//                "\"Jamwanthali\":\"WTJ\"," +
//
//
//                "\"Wathar\":\"WTR\"," +
//
//
//                "\"Bptstation\":\"XXXX\"," +
//
//
//                "\"Yeliyur\":\"Y\"," +
//
//
//                "\"Yerraguntla\":\"YA\"," +
//
//
//                "\"Yataluru\":\"YAL\"," +
//
//
//                "\"Yedekumeri\":\"YDK\"," +
//
//
//                "\"Yusufpur\":\"YFP\"," +
//
//
//                "\"Yadgir\":\"YG\"," +
//
//
//                "\"Yeola\":\"YL\"," +
//
//
//                "\"Yalvigi\":\"YLG\"," +
//
//
//                "\"Yellakaru\":\"YLK\"," +
//
//
//                "\"Ellamanchili\":\"YLM\"," +
//
//
//                "\"Yelhanka Jn.\":\"YNK\"," +
//
//
//                "\"Errupalem\":\"YP\"," +
//
//
//                "\"Yerpedu\":\"YPD\"," +
//
//
//                "\"Yevat\":\"YT\"," +
//
//
//                "\"Yavatmal\":\"YTL\"," +
//
//
//                "\"Zahirabad\":\"ZB\"," +
//
//
//                "\"Jangaon\":\"ZN\"," +
//
//
//                "\"Zamania\":\"ZNA\"," +
//
//
//                "\"Zampini\":\"ZPI\"," +
//
//
//                "\"Zangalapalle\":\"ZPL\"," +
//
//
//                "\"Jiradei\":\"ZRD\"," +
//
//
//                "\"Zawar\":\"ZW\"," +
//
//
//                "\"Zeebeedee\":\"ZZZ\"," +
//                "}";
//    }
//}
