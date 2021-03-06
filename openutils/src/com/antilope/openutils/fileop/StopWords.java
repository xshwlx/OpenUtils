package com.antilope.openutils.fileop;

import java.util.ArrayList;
import java.util.List;
/**
 * StopWords列表
 *
 * @author         :    xsh
 * @date           :    2014/07/19
 * @version        :    1.0 20120307 
 * @since          :    1.0 20120307
 *
 */
public class StopWords {
	
	public static final List<String> STOPWORDS = new ArrayList<String>(){{
		add("--");
		add("?");
		add("“");
		add("”");
		add(" ");
		add("》");
		add("－－");
		add("able");
		add("ABLE");
		add("about");
		add("ABOUT");
		add("above");
		add("ABOVE");
		add("according");
		add("ACCORDING");
		add("accordingly");
		add("ACCORDINGLY");
		add("across");
		add("ACROSS");
		add("actually");
		add("ACTUALLY");
		add("after");
		add("AFTER");
		add("afterwards");
		add("AFTERWARDS");
		add("again");
		add("AGAIN");
		add("against");
		add("AGAINST");
		add("ain't");
		add("AIN'T");
		add("all");
		add("ALL");
		add("allow");
		add("ALLOW");
		add("allows");
		add("ALLOWS");
		add("almost");
		add("ALMOST");
		add("alone");
		add("ALONE");
		add("along");
		add("ALONG");
		add("already");
		add("ALREADY");
		add("also");
		add("ALSO");
		add("although");
		add("ALTHOUGH");
		add("always");
		add("ALWAYS");
		add("am");
		add("AM");
		add("among");
		add("AMONG");
		add("amongst");
		add("AMONGST");
		add("an");
		add("AN");
		add("and");
		add("AND");
		add("another");
		add("ANOTHER");
		add("any");
		add("ANY");
		add("anybody");
		add("ANYBODY");
		add("anyhow");
		add("ANYHOW");
		add("anyone");
		add("ANYONE");
		add("anything");
		add("ANYTHING");
		add("anyway");
		add("ANYWAY");
		add("anyways");
		add("ANYWAYS");
		add("anywhere");
		add("ANYWHERE");
		add("apart");
		add("APART");
		add("appear");
		add("APPEAR");
		add("appreciate");
		add("APPRECIATE");
		add("appropriate");
		add("APPROPRIATE");
		add("are");
		add("ARE");
		add("aren't");
		add("AREN'T");
		add("around");
		add("AROUND");
		add("as");
		add("AS");
		add("a's");
		add("A'S");
		add("aside");
		add("ASIDE");
		add("ask");
		add("ASK");
		add("asking");
		add("ASKING");
		add("associated");
		add("ASSOCIATED");
		add("at");
		add("AT");
		add("available");
		add("AVAILABLE");
		add("away");
		add("AWAY");
		add("awfully");
		add("AWFULLY");
		add("be");
		add("BE");
		add("became");
		add("BECAME");
		add("because");
		add("BECAUSE");
		add("become");
		add("BECOME");
		add("becomes");
		add("BECOMES");
		add("becoming");
		add("BECOMING");
		add("been");
		add("BEEN");
		add("before");
		add("BEFORE");
		add("beforehand");
		add("BEFOREHAND");
		add("behind");
		add("BEHIND");
		add("being");
		add("BEING");
		add("believe");
		add("BELIEVE");
		add("below");
		add("BELOW");
		add("beside");
		add("BESIDE");
		add("besides");
		add("BESIDES");
		add("best");
		add("BEST");
		add("better");
		add("BETTER");
		add("between");
		add("BETWEEN");
		add("beyond");
		add("BEYOND");
		add("both");
		add("BOTH");
		add("brief");
		add("BRIEF");
		add("but");
		add("BUT");
		add("by");
		add("BY");
		add("came");
		add("CAME");
		add("can");
		add("CAN");
		add("cannot");
		add("CANNOT");
		add("cant");
		add("CANT");
		add("can't");
		add("CAN'T");
		add("cause");
		add("CAUSE");
		add("causes");
		add("CAUSES");
		add("certain");
		add("CERTAIN");
		add("certainly");
		add("CERTAINLY");
		add("changes");
		add("CHANGES");
		add("clearly");
		add("CLEARLY");
		add("c'mon");
		add("C'MON");
		add("co");
		add("CO");
		add("com");
		add("COM");
		add("come");
		add("COME");
		add("comes");
		add("COMES");
		add("concerning");
		add("CONCERNING");
		add("consequently");
		add("CONSEQUENTLY");
		add("consider");
		add("CONSIDER");
		add("considering");
		add("CONSIDERING");
		add("contain");
		add("CONTAIN");
		add("containing");
		add("CONTAINING");
		add("contains");
		add("CONTAINS");
		add("corresponding");
		add("CORRESPONDING");
		add("could");
		add("COULD");
		add("couldn't");
		add("COULDN'T");
		add("course");
		add("COURSE");
		add("c's");
		add("C'S");
		add("currently");
		add("CURRENTLY");
		add("definitely");
		add("DEFINITELY");
		add("described");
		add("DESCRIBED");
		add("despite");
		add("DESPITE");
		add("did");
		add("DID");
		add("didn't");
		add("DIDN'T");
		add("different");
		add("DIFFERENT");
		add("do");
		add("DO");
		add("does");
		add("DOES");
		add("doesn't");
		add("DOESN'T");
		add("doing");
		add("DOING");
		add("done");
		add("DONE");
		add("don't");
		add("DON'T");
		add("down");
		add("DOWN");
		add("downwards");
		add("DOWNWARDS");
		add("during");
		add("DURING");
		add("each");
		add("EACH");
		add("edu");
		add("EDU");
		add("eg");
		add("EG");
		add("eight");
		add("EIGHT");
		add("either");
		add("EITHER");
		add("else");
		add("ELSE");
		add("elsewhere");
		add("ELSEWHERE");
		add("enough");
		add("ENOUGH");
		add("entirely");
		add("ENTIRELY");
		add("especially");
		add("ESPECIALLY");
		add("et");
		add("ET");
		add("etc");
		add("ETC");
		add("even");
		add("EVEN");
		add("ever");
		add("EVER");
		add("every");
		add("EVERY");
		add("everybody");
		add("EVERYBODY");
		add("everyone");
		add("EVERYONE");
		add("everything");
		add("EVERYTHING");
		add("everywhere");
		add("EVERYWHERE");
		add("ex");
		add("EX");
		add("exactly");
		add("EXACTLY");
		add("example");
		add("EXAMPLE");
		add("except");
		add("EXCEPT");
		add("far");
		add("FAR");
		add("few");
		add("FEW");
		add("fifth");
		add("FIFTH");
		add("first");
		add("FIRST");
		add("five");
		add("FIVE");
		add("followed");
		add("FOLLOWED");
		add("following");
		add("FOLLOWING");
		add("follows");
		add("FOLLOWS");
		add("for");
		add("FOR");
		add("former");
		add("FORMER");
		add("formerly");
		add("FORMERLY");
		add("forth");
		add("FORTH");
		add("four");
		add("FOUR");
		add("from");
		add("FROM");
		add("further");
		add("FURTHER");
		add("furthermore");
		add("FURTHERMORE");
		add("get");
		add("GET");
		add("gets");
		add("GETS");
		add("getting");
		add("GETTING");
		add("given");
		add("GIVEN");
		add("gives");
		add("GIVES");
		add("go");
		add("GO");
		add("goes");
		add("GOES");
		add("going");
		add("GOING");
		add("gone");
		add("GONE");
		add("got");
		add("GOT");
		add("gotten");
		add("GOTTEN");
		add("greetings");
		add("GREETINGS");
		add("had");
		add("HAD");
		add("hadn't");
		add("HADN'T");
		add("happens");
		add("HAPPENS");
		add("hardly");
		add("HARDLY");
		add("has");
		add("HAS");
		add("hasn't");
		add("HASN'T");
		add("have");
		add("HAVE");
		add("haven't");
		add("HAVEN'T");
		add("having");
		add("HAVING");
		add("he");
		add("HE");
		add("hello");
		add("HELLO");
		add("help");
		add("HELP");
		add("hence");
		add("HENCE");
		add("her");
		add("HER");
		add("here");
		add("HERE");
		add("hereafter");
		add("HEREAFTER");
		add("hereby");
		add("HEREBY");
		add("herein");
		add("HEREIN");
		add("here's");
		add("HERE'S");
		add("hereupon");
		add("HEREUPON");
		add("hers");
		add("HERS");
		add("herself");
		add("HERSELF");
		add("he's");
		add("HE'S");
		add("hi");
		add("HI");
		add("him");
		add("HIM");
		add("himself");
		add("HIMSELF");
		add("his");
		add("HIS");
		add("hither");
		add("HITHER");
		add("hopefully");
		add("HOPEFULLY");
		add("how");
		add("HOW");
		add("howbeit");
		add("HOWBEIT");
		add("however");
		add("HOWEVER");
		add("i'd");
		add("I'D");
		add("ie");
		add("IE");
		add("if");
		add("IF");
		add("ignored");
		add("IGNORED");
		add("i'll");
		add("I'LL");
		add("i'm");
		add("I'M");
		add("immediate");
		add("IMMEDIATE");
		add("in");
		add("IN");
		add("inasmuch");
		add("INASMUCH");
		add("inc");
		add("INC");
		add("indeed");
		add("INDEED");
		add("indicate");
		add("INDICATE");
		add("indicated");
		add("INDICATED");
		add("indicates");
		add("INDICATES");
		add("inner");
		add("INNER");
		add("insofar");
		add("INSOFAR");
		add("instead");
		add("INSTEAD");
		add("into");
		add("INTO");
		add("inward");
		add("INWARD");
		add("is");
		add("IS");
		add("isn't");
		add("ISN'T");
		add("it");
		add("IT");
		add("it'd");
		add("IT'D");
		add("it'll");
		add("IT'LL");
		add("its");
		add("ITS");
		add("it's");
		add("IT'S");
		add("itself");
		add("ITSELF");
		add("i've");
		add("I'VE");
		add("just");
		add("JUST");
		add("keep");
		add("KEEP");
		add("keeps");
		add("KEEPS");
		add("kept");
		add("KEPT");
		add("know");
		add("KNOW");
		add("known");
		add("KNOWN");
		add("knows");
		add("KNOWS");
		add("last");
		add("LAST");
		add("lately");
		add("LATELY");
		add("later");
		add("LATER");
		add("latter");
		add("LATTER");
		add("latterly");
		add("LATTERLY");
		add("least");
		add("LEAST");
		add("less");
		add("LESS");
		add("lest");
		add("LEST");
		add("let");
		add("LET");
		add("let's");
		add("LET'S");
		add("like");
		add("LIKE");
		add("liked");
		add("LIKED");
		add("likely");
		add("LIKELY");
		add("little");
		add("LITTLE");
		add("look");
		add("LOOK");
		add("looking");
		add("LOOKING");
		add("looks");
		add("LOOKS");
		add("ltd");
		add("LTD");
		add("mainly");
		add("MAINLY");
		add("many");
		add("MANY");
		add("may");
		add("MAY");
		add("maybe");
		add("MAYBE");
		add("me");
		add("ME");
		add("mean");
		add("MEAN");
		add("meanwhile");
		add("MEANWHILE");
		add("merely");
		add("MERELY");
		add("might");
		add("MIGHT");
		add("more");
		add("MORE");
		add("moreover");
		add("MOREOVER");
		add("most");
		add("MOST");
		add("mostly");
		add("MOSTLY");
		add("much");
		add("MUCH");
		add("must");
		add("MUST");
		add("my");
		add("MY");
		add("myself");
		add("MYSELF");
		add("name");
		add("NAME");
		add("namely");
		add("NAMELY");
		add("nd");
		add("ND");
		add("near");
		add("NEAR");
		add("nearly");
		add("NEARLY");
		add("necessary");
		add("NECESSARY");
		add("need");
		add("NEED");
		add("needs");
		add("NEEDS");
		add("neither");
		add("NEITHER");
		add("never");
		add("NEVER");
		add("nevertheless");
		add("NEVERTHELESS");
		add("new");
		add("NEW");
		add("next");
		add("NEXT");
		add("nine");
		add("NINE");
		add("no");
		add("NO");
		add("nobody");
		add("NOBODY");
		add("non");
		add("NON");
		add("none");
		add("NONE");
		add("noone");
		add("NOONE");
		add("nor");
		add("NOR");
		add("normally");
		add("NORMALLY");
		add("not");
		add("NOT");
		add("nothing");
		add("NOTHING");
		add("novel");
		add("NOVEL");
		add("now");
		add("NOW");
		add("nowhere");
		add("NOWHERE");
		add("obviously");
		add("OBVIOUSLY");
		add("of");
		add("OF");
		add("off");
		add("OFF");
		add("often");
		add("OFTEN");
		add("oh");
		add("OH");
		add("ok");
		add("OK");
		add("okay");
		add("OKAY");
		add("old");
		add("OLD");
		add("on");
		add("ON");
		add("once");
		add("ONCE");
		add("one");
		add("ONE");
		add("ones");
		add("ONES");
		add("only");
		add("ONLY");
		add("onto");
		add("ONTO");
		add("or");
		add("OR");
		add("other");
		add("OTHER");
		add("others");
		add("OTHERS");
		add("otherwise");
		add("OTHERWISE");
		add("ought");
		add("OUGHT");
		add("our");
		add("OUR");
		add("ours");
		add("OURS");
		add("ourselves");
		add("OURSELVES");
		add("out");
		add("OUT");
		add("outside");
		add("OUTSIDE");
		add("over");
		add("OVER");
		add("overall");
		add("OVERALL");
		add("own");
		add("OWN");
		add("particular");
		add("PARTICULAR");
		add("particularly");
		add("PARTICULARLY");
		add("per");
		add("PER");
		add("perhaps");
		add("PERHAPS");
		add("placed");
		add("PLACED");
		add("please");
		add("PLEASE");
		add("plus");
		add("PLUS");
		add("possible");
		add("POSSIBLE");
		add("presumably");
		add("PRESUMABLY");
		add("probably");
		add("PROBABLY");
		add("provides");
		add("PROVIDES");
		add("que");
		add("QUE");
		add("quite");
		add("QUITE");
		add("qv");
		add("QV");
		add("rather");
		add("RATHER");
		add("rd");
		add("RD");
		add("re");
		add("RE");
		add("really");
		add("REALLY");
		add("reasonably");
		add("REASONABLY");
		add("regarding");
		add("REGARDING");
		add("regardless");
		add("REGARDLESS");
		add("regards");
		add("REGARDS");
		add("relatively");
		add("RELATIVELY");
		add("respectively");
		add("RESPECTIVELY");
		add("right");
		add("RIGHT");
		add("said");
		add("SAID");
		add("same");
		add("SAME");
		add("saw");
		add("SAW");
		add("say");
		add("SAY");
		add("saying");
		add("SAYING");
		add("says");
		add("SAYS");
		add("second");
		add("SECOND");
		add("secondly");
		add("SECONDLY");
		add("see");
		add("SEE");
		add("seeing");
		add("SEEING");
		add("seem");
		add("SEEM");
		add("seemed");
		add("SEEMED");
		add("seeming");
		add("SEEMING");
		add("seems");
		add("SEEMS");
		add("seen");
		add("SEEN");
		add("self");
		add("SELF");
		add("selves");
		add("SELVES");
		add("sensible");
		add("SENSIBLE");
		add("sent");
		add("SENT");
		add("serious");
		add("SERIOUS");
		add("seriously");
		add("SERIOUSLY");
		add("seven");
		add("SEVEN");
		add("several");
		add("SEVERAL");
		add("shall");
		add("SHALL");
		add("she");
		add("SHE");
		add("should");
		add("SHOULD");
		add("shouldn't");
		add("SHOULDN'T");
		add("since");
		add("SINCE");
		add("six");
		add("SIX");
		add("so");
		add("SO");
		add("some");
		add("SOME");
		add("somebody");
		add("SOMEBODY");
		add("somehow");
		add("SOMEHOW");
		add("someone");
		add("SOMEONE");
		add("something");
		add("SOMETHING");
		add("sometime");
		add("SOMETIME");
		add("sometimes");
		add("SOMETIMES");
		add("somewhat");
		add("SOMEWHAT");
		add("somewhere");
		add("SOMEWHERE");
		add("soon");
		add("SOON");
		add("sorry");
		add("SORRY");
		add("specified");
		add("SPECIFIED");
		add("specify");
		add("SPECIFY");
		add("specifying");
		add("SPECIFYING");
		add("still");
		add("STILL");
		add("sub");
		add("SUB");
		add("such");
		add("SUCH");
		add("sup");
		add("SUP");
		add("sure");
		add("SURE");
		add("take");
		add("TAKE");
		add("taken");
		add("TAKEN");
		add("tell");
		add("TELL");
		add("tends");
		add("TENDS");
		add("th");
		add("TH");
		add("than");
		add("THAN");
		add("thank");
		add("THANK");
		add("thanks");
		add("THANKS");
		add("thanx");
		add("THANX");
		add("that");
		add("THAT");
		add("thats");
		add("THATS");
		add("that's");
		add("THAT'S");
		add("the");
		add("THE");
		add("their");
		add("THEIR");
		add("theirs");
		add("THEIRS");
		add("them");
		add("THEM");
		add("themselves");
		add("THEMSELVES");
		add("then");
		add("THEN");
		add("thence");
		add("THENCE");
		add("there");
		add("THERE");
		add("thereafter");
		add("THEREAFTER");
		add("thereby");
		add("THEREBY");
		add("therefore");
		add("THEREFORE");
		add("therein");
		add("THEREIN");
		add("theres");
		add("THERES");
		add("there's");
		add("THERE'S");
		add("thereupon");
		add("THEREUPON");
		add("these");
		add("THESE");
		add("they");
		add("THEY");
		add("they'd");
		add("THEY'D");
		add("they'll");
		add("THEY'LL");
		add("they're");
		add("THEY'RE");
		add("they've");
		add("THEY'VE");
		add("think");
		add("THINK");
		add("third");
		add("THIRD");
		add("this");
		add("THIS");
		add("thorough");
		add("THOROUGH");
		add("thoroughly");
		add("THOROUGHLY");
		add("those");
		add("THOSE");
		add("though");
		add("THOUGH");
		add("three");
		add("THREE");
		add("through");
		add("THROUGH");
		add("throughout");
		add("THROUGHOUT");
		add("thru");
		add("THRU");
		add("thus");
		add("THUS");
		add("to");
		add("TO");
		add("together");
		add("TOGETHER");
		add("too");
		add("TOO");
		add("took");
		add("TOOK");
		add("toward");
		add("TOWARD");
		add("towards");
		add("TOWARDS");
		add("tried");
		add("TRIED");
		add("tries");
		add("TRIES");
		add("truly");
		add("TRULY");
		add("try");
		add("TRY");
		add("trying");
		add("TRYING");
		add("t's");
		add("T'S");
		add("twice");
		add("TWICE");
		add("two");
		add("TWO");
		add("un");
		add("UN");
		add("under");
		add("UNDER");
		add("unfortunately");
		add("UNFORTUNATELY");
		add("unless");
		add("UNLESS");
		add("unlikely");
		add("UNLIKELY");
		add("until");
		add("UNTIL");
		add("unto");
		add("UNTO");
		add("up");
		add("UP");
		add("upon");
		add("UPON");
		add("us");
		add("US");
		add("use");
		add("USE");
		add("used");
		add("USED");
		add("useful");
		add("USEFUL");
		add("uses");
		add("USES");
		add("using");
		add("USING");
		add("usually");
		add("USUALLY");
		add("value");
		add("VALUE");
		add("various");
		add("VARIOUS");
		add("very");
		add("VERY");
		add("via");
		add("VIA");
		add("viz");
		add("VIZ");
		add("vs");
		add("VS");
		add("want");
		add("WANT");
		add("wants");
		add("WANTS");
		add("was");
		add("WAS");
		add("wasn't");
		add("WASN'T");
		add("way");
		add("WAY");
		add("we");
		add("WE");
		add("we'd");
		add("WE'D");
		add("welcome");
		add("WELCOME");
		add("well");
		add("WELL");
		add("we'll");
		add("WE'LL");
		add("went");
		add("WENT");
		add("were");
		add("WERE");
		add("we're");
		add("WE'RE");
		add("weren't");
		add("WEREN'T");
		add("we've");
		add("WE'VE");
		add("what");
		add("WHAT");
		add("whatever");
		add("WHATEVER");
		add("what's");
		add("WHAT'S");
		add("when");
		add("WHEN");
		add("whence");
		add("WHENCE");
		add("whenever");
		add("WHENEVER");
		add("where");
		add("WHERE");
		add("whereafter");
		add("WHEREAFTER");
		add("whereas");
		add("WHEREAS");
		add("whereby");
		add("WHEREBY");
		add("wherein");
		add("WHEREIN");
		add("where's");
		add("WHERE'S");
		add("whereupon");
		add("WHEREUPON");
		add("wherever");
		add("WHEREVER");
		add("whether");
		add("WHETHER");
		add("which");
		add("WHICH");
		add("while");
		add("WHILE");
		add("whither");
		add("WHITHER");
		add("who");
		add("WHO");
		add("whoever");
		add("WHOEVER");
		add("whole");
		add("WHOLE");
		add("whom");
		add("WHOM");
		add("who's");
		add("WHO'S");
		add("whose");
		add("WHOSE");
		add("why");
		add("WHY");
		add("will");
		add("WILL");
		add("willing");
		add("WILLING");
		add("wish");
		add("WISH");
		add("with");
		add("WITH");
		add("within");
		add("WITHIN");
		add("without");
		add("WITHOUT");
		add("wonder");
		add("WONDER");
		add("won't");
		add("WON'T");
		add("would");
		add("WOULD");
		add("wouldn't");
		add("WOULDN'T");
		add("-");
		add("yes");
		add("YES");
		add("\"No");
		add("yet");
		add("possibly");
		add("Itwont");
		add("Written");
		add("YET");
		add("J0IN");
		add("Click");
		add("total");
		add("you");
		add("YOU");
		add("you'd");
		add("YOU'D");
		add("you'll");
		add("YOU'LL");
		add("your");
		add("YOUR");
		add("you're");
		add("YOU'RE");
		add("yours");
		add("YOURS");
		add("yourself");
		add("YOURSELF");
		add("yourselves");
		add("YOURSELVES");
		add("you've");
		add("YOU'VE");
		add("zero");
		add("ZERO");
		add("zt");
		add("ZT");
		add("zz");
		add("ZZ");
		add("");

		
	}};
}
