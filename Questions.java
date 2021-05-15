import java.util.*;
class Questions extends Main
{
static String q1[]={"Who is the father of Ghatotkach in Mahabharata: ",
    "Where is Kohinoor Diamond :",
    "Calcium content is maximum in?",
    "The Qutub minar was finished by:",
    "The Directive principles in the Indian Constitution are drawn on the lines of ?",
    "What would be equivalent of 451 Farenheit if converted to Celcius :",
    "In which sport event did Pan Singh Tomar represent India :",
    "Which of the folowing chemicals is used in preserving fruit juice ?",
    "Who is the first batsman to scoree a century in all three formats of the game of cricket?",
    "Who is known as Man of Iron and Blood ?",
    "Ukai Project is associated with which river ?",
    "A sudden fall in barometric height indicates what ?",
    "Which of these is not a comoputer virus ?",
    "Al Mukhabarat is the intelligence agency of which country ?",
    "Which of the following is not a pair of parent and child,who have both won Nobel Prizes?"};
static String op1[]={"A : Bhima\t\t B : Hidamba\n C : Arjuna\t\t D : Khumbkaran",
    "A : U.S.A.\t\t B : England\n C : Persia\t\t D : Germany",
    "A : Wheat\t\t B : Maize\n C : Bajra\t\t D : Sorghum",
    "A : Qutub-ud-din aibak\t\t B : Iltutmish\n C : Firoz Shah Tughlaq\t\t D : Mohammad Bin Tughlaq",
    "A : American Constitution\t\t B : Canadian Constitution\n C : French Constitution\t\t D : Irish Constitution",
    "A : 381 C\t\t B : 869 C\n C : 754 C\t\t D : 233 C",
    "A : 5000 m race\t\t B : Long Jump\n C : 110m hurdles\t\t D : 3000 m stepl chase",
    "A : Ammonium Sulphate\t\t B : Sodium Hydroxide\n C : Sodium benzoate\t\t D : Potassium nitrate",
    "A : Suresh raina\t\t B: Chris gayle\n C: A.B.Devillers\t\t D : Brendon Macculum",
    "A : Prince Bismark\t\t B: Napolean\n C : Duke of Wellington\t\t D : Earl of Warwick",
    "A : Tapti\t\t B : Narmada\n C: Mahanadi\t\t D : Damodar",
    "A : Rain\t\t B: Storm\n C: Fine weather\t\t D : Extremly cold",
    "A : I Love You\t\t B: Cyberwarfare\n C: Stuxnet\t\t D : Creeper",
    "A : Saudi Arabia\t\t B: Iraq\n C: Germany\t\t D : Afganistan",
    "A:Marie Curie,Irene Joliot Curie\t\tB:J J Thomson\nC:Niels Bohr,Aage Bohr\t\tD:Hermann Fischer,Hans Fischer"};
static char answr1[]={'A','B','B','B','D','D','D','C','B','A','A','B','B','B','D'};

static String q2[]={"How many rings does Olympic logo have ? ",
    "Who is the mother of Rama in Ramayan :",
    "Among the following ,which is not an ape:",
    "How many members are nominated to the Rajya Sabha by the president :",
    "The laws of Planetary Motion Was Discovered by:",
    "DDT is a type of which :",
    "The deepest trench in the world \'Marina Trench\' is in :",
    "The onk whom Chandragupta Maurya Accompanied to the south was:",
    "Which of these titles is associated with Shrew(Suncus Etruscus):",
    "The sultan who called himself Naib- i- Khudai:",
    "The Ashokan inscription on which of these gives an account of kaling war and its consequences:",
    "Which country has more than 200 volcanoes with most of them still active:",
    "Cyrogenics is science dealing with:",
    "Who is known as father of nano technology:",
    "Who became the Chairman of Tata Sons in 2017?"};
static String op2[]={"A: 2\t\tB: 5\nC: 7\t\t D: 3",
    "A : Sumitra\t\t B : Mantra \n C : Kaushalya \t\t D : Kakie",
    "A : Gibob\t\tB : Gorilla\nC : Langur\t\t D : Orangutan",
    "A : 2\t\t B : 11\n C : 12\t\t D: 23",
    "A : Galelio \t\t B : Issac Newton \n C : Thomas Edison \t\t D : Johannes Kepler",
    "A : Vitamin \t\t B : Pesticide \n C : Fertilizer \t\t D : Vaccine",
    "A : Atlantic ocean \t\t B :Indian Ocean \n C : Artic Ocean \t\t D : Pacific Ocean",
    "A : Asvaghosha \t\t B : Vasumitra \n C : Upagupta \t\t D : Bhadrabahu",
    "A : Smallest mamal \t\t B : Smallest bird \n C : Smallest flower \t\t D : Smallest virus",
    "A : Ibraham lodi \t\t B : Balban \n C : Iltutmish \t\t D : Allaudin Khilji",
    "A : Grinar rock edict \t\t B : Minor rock edict III \n C : Minor rock edict IV \t\t D : Minor rock edict XIII",
    "A : Finland \t\t B : Iceland \n C : Ireland \t\t D : Norway",
    "A : High Temperatures \t\t B : Low Temperature \n C : Friction and wear \t\t D : growth of crystals",
    "A : Edward Jenner \t\t B : Richard Erret Smalley \n C : Vinton Cerf \t\t D : Aguste Comete",
    "A : Ratan Tata \t\t B : Cyrus Mistry \n C : N. Chandrasekharan \t\t D : Rajesh Gopinath"};
static char answr2[]={'B','C','C','C','B','B','D','A','A','B','D','B','B','A','D'};

static String q3[]={"What was the symbol of Nazi:",
    "Which of these is a symbol of peace :",
    "Which of the folowing is arich source of vitamin B-12:",
    "Which of the following was a saint of Bhakti Movement :",
    "The most salty sea in the world is :",
    "Which of these Actresses is the daughter in law of a former Indian Test Captain",
    "Which of these players is better known as Mr. Dependable or Shriman Bharosemand:",
    "Coal is an example of:",
    "Which American scientist is associated with the discovery of the ball point pen:",
    "The Doctrine of Communism was propounded by:",
    "Dast-e-lut is a desert in which of these countries:",
    "Blood Grouping was discovered by :",
    "Which of these is not formed by runnin g water:",
    "Which of the following discovery is associated with edward teller:",
    "Who is the first woman to successfully climb K2, the world’s second highest mountain peak?"};
static String op3[]={"A: Cross \t B: Skull and Bones \n C: Owl \t\t D: Swastik",
    "A : Lotus \t\t B : Two Leaves \n C : Hand \t\t D : Dove with Olive branch",
    "A : Fish \t\t B: Apple \n C: Water melon \t\t D: Cashewnut",
    "A : Kabir \t\t B: Tulsi Das \n C: Vivekanand  \t\t D: Chaitanya",
    "A : Dead sea  \t\t B: Red sea \n C: Ural Sea \t\t D: Black sea",
    "A : Kareena Kapoor \t\t B: Shilpa Shetty \n C: Sushmita Sen \t\t D: Lara Dutta",
    "A : Rahul Dravid \t\t B: M.S.Dhoni \n C: Suresh Raina \t\t D: Sachin Tendulkar",
    "A : Stone \t\t B: Igneous rock \n C: Sedimentary rock \t\t D: Metamorphic rocks",
    "A : Alexander Graham Bell \t\t B: Bell labs \n C: P.T.Farnsworth \t\t D: John J loud",
    "A : Adam Smith \t\t B: Joseph S talin \n C: Karl Marx \t\t D: Ronald Reagan",
    "A : Arabia \t\t B: Egypt \n C: Iraq \t\t D: Iran",
    "A : William Harvey \t\t B: Land Steineri \n C: Robert koch \t\t D: Louis Pasteur",
    "A : Valleys \t\t B: Tunnels \n C: Gorges \t\t D: Canyons",
    "A : Hydrogen Bomb \t\t B: Uranium Fusion \n C: Atom bomb \t\t D: Radio Carbon Dating",
    "A : Junko Tabei \t\t B : Wanda Rutkiewicz \n C : Tamae Watanabe \t\t D : Chantal Mauduit"};
static char answr3[]={'D','D','A','D','A','A','A','A','D','C','D','B','B','A','B'};

static String q4[]={"Whose touch turned all Gold:",
    "Which of these is not an epic:",
    "Mumps is caused by:",
    "National Income of India is compiled by :",
    "Which is the worlds first truly electronic digital comptuer:",
    "Which of the following is not a part of the Indian Constitution",
    "What is jweller's rough:",
    "Artesians wells are formed in:",
    "Where is the Lokpriya Gopinath Bordoli Airport International located:",
    "The Equator cuts through which of the foolowing islands:",
    "Nobel prize was named after Alfred Nobel who invented :",
    "Lambart's law is related to:",
    "Seif is a structure formed by action of:",
    "Fathom is unit to measure which of these:",
    "Who commanded the ‘Hector’, the first British trading ship to land at Surat?"};    
static String op4[]={"A: Midas \t\t B: Argus \n C : Aurum \t\t D: Auralius",
    "A:Mahabharat\t\t B :Ramayana \n C : Odessey \t\tD : Mein Kampf",
    "A:Bactetia \t\t B: Fungi \t\t C : Protozoa \t\t D: Virus",
    "A:Planning Commission \t\t B: Finance Commission \n C : Indian Statistical Institute \t\t D: Central Statistical Organization",
    "A:ENIAC \t\t B: UNIVAC \n C : IBM \t\t D: EDSAC",
    "A:Secularism \t\t B: Socialism \n C : Democratic Republic \t\t D: Fedralism",
    "A:Ferric oxide \t\t B: Ferrous Oxide \n C : Ferrous Carbonate \t\t D: Ferric carbonate",
    "A:Basalt Rock \t\t B: Coral rock \n C : Aquifer rock \t\t D: Dykes",
    "A:Guwahati \t\t B: Delhi \n C : Hyderabad \t\t D: Amritsar",
    "A:Madagascar \t\t B: Tasmania \n C : Java \t\t D: Bornea",
    "A:Helicopter \t\t B: Safety Lamp \n C : Dynamitie \t\t D: Disel Engine",
    "A:Reflection \t\t B: Refraction \n C : Interferance \t\t D: Illumination",
    "A:River \t\t B: Sea Water \n C : Glacier \t\t D: Wind",
    "A:Viscosity \t\t B: Magnetic permeabilty \n C : Illumination \t\t D: Depth of sea",
"A : Paul Canning \t\t B : William Hawkins \t\t C : Thomas Roe : D : James Lancaster"};          
static char answr4[]={'A','D','D','D','A','D','A','C','A','D','C','D','D','D','B'};

static String q5[]={"Who heads the Reserve Bank of India:",
    "Where is the Wailing Wall : ",
    "The Great Grannary of harappan civilization was found at ",
    "AIDS virus HTLV was discovered in:",
    "Who adopted the Universal Declaration of Human Rights:",
    "The first operational compound Microscope was developed by :",
    "Which of these is a communicable disease :",
    "The idea of Constitution for India was first given by:",
    "What is the currency of spain:",
    "Cheif Minister is responsible to:",
    "Which of the following is a feature formed by rivers:",
    "Elephant pass is located in:",
    "Which of the following is a cold current:",
    "Rashtriya panchyat is the Parliament of :",
    "What was the name given to the supercluster of galaxies, discovered by ateam of Indian astronomers in 2017 ?"};
static String op5[]={"A:Finance Minister \t\t B: Commissioner \n C: Cheif Bank Manager \t\t D: Governor",
     "A:Rome \t\t B : Paris \n C : Baghdad \t\tD : Jerusalem",
     "A:Harappa \t\t B: Mohenjodaro \n C: Kalibangan \t\t D: Lothal",
     "A:India \t\t B: China \n C: U.S.A \t\t D: Japan",
     "A:Amnesty International \t\t B: UN \n C: NATO \t\t D: League of Nations",
     "A:Robert Hooke \t\t B:Robert Brown \n C:Janseen \t\t D: M.Schultez",
     "A:Diptheria t\t B: Diabetes \n C: Cancer \t\t D: Rheumatism",
     "A:Mahatama Gandhi \t\t B: Dr. B.R.Ambedkar \n C: Dr. Rajendra Prasad \t\t D: P.Upendra",
     "A:Peso \t\t B: Peseta \n C: Leva \t\t D: Escudo",
     "A:Governor \t\t B: Legislative Assembly \n C: Prime Minister \t\t D: Rajya Sabha",
     "A:Cirque \t\t B: Inselburg \n C: Meander \t\t D: Moraines",
     "A:India \t\t B: Pakistan \n C:Sri Lanka \t\t D: China",
     "A:Kuroshio \t\t B: Benguela \n C: Brazil \t\t D: Gulf stream",
     "A:Zambia \t\t B: Burma \n C: Mongoliya \t\t D: Bangladesh",
    "A :Laxmi \t\t B : Parvati \n C : Saraswati \t\t D : Durga"};
static char answr5[]={'D','D','A','C','D','C','A','D','D','B','C','C','B','D','C'};

public static void run()
     {
         switch((int)(Math.random()*5)+1)
         {
             case 1:
             lev=0;
             for(int i=0;i<15;i++)
             {
                 System.out.println("Q."+(i+1)+". "+q1[i]+"\n"+op1[i]);
                 ans=answer.accept();
                 help.check(ans,answr1[i]);
                 flag=answer.check(ans,answr1[i],lev);
                 lev++;
                 if(flag==false)
                 break;
             }
             break;
             case 2:
             lev=0;
             for(int i=0;i<15;i++)
             {
                 System.out.println("Q."+(i+1)+". "+q2[i]+"\n"+op2[i]);
                 ans=answer.accept();
                 help.check(ans,answr2[i]);
                 flag=answer.check(ans,answr2[i],lev);
                 lev++;
                 if(flag==false)
                 break;
             }
             break;
             case 3:
             lev=0;
             for(int i=0;i<15;i++)
             {
                 System.out.println("Q."+(i+1)+". "+q3[i]+"\n"+op3[i]);
                 ans=answer.accept();
                 help.check(ans,answr3[i]);
                 flag=answer.check(ans,answr3[i],lev);
                 lev++;
                 if(flag==false)
                 break;
             }
             break;
             case 4:
             lev=0;
             for(int i=0;i<15;i++)
             {
                  System.out.println("Q."+(i+1)+". "+q4[i]+"\n"+op4[i]);
                  ans=answer.accept();
                  help.check(ans,answr4[i]);
                  flag=answer.check(ans,answr4[i],lev);
                  lev++;
                  if(flag==false)
                  break;
             }
             break;
             case 5:
             lev=0;
             for(int i=0;i<15;i++)
             {
                  System.out.println("Q."+(i+1)+". "+q5[i]+"\n"+op5[i]);
                  ans=answer.accept();
                  help.check(ans,answr5[i]);
                  flag=answer.check(ans,answr5[i],lev);
                  lev++;
                  if(flag==false)
                  break;
             }
             break;
         }
     }
}