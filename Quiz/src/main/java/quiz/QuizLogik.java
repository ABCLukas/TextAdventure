package quiz;

import java.util.ArrayList;

public class QuizLogik {

	private static quiz_gui fenster;
	private static FileReader reader;
	private static ArrayList<Frage> fragen;
	private static Frage currentQuestion;
	public static int counter =0;
    private static boolean checkAnswer;


	public   QuizLogik(quiz_gui ff) {
		this.fenster = ff;
		reader = new FileReader();
		fragen = reader.readQuestionsFromFile("fragen.txt");	
	}
	
	public static boolean hasNextQuestion() {
		if(counter<fragen.size()) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void showQuestion() {
		//int r = (int)(Math.random()*3);
		Frage f = fragen.get(counter);
		counter++;
		currentQuestion = f;
		fenster.setFrageText(f.getFrage());
		fenster.setAntwort1(f.getAntwort1());
		fenster.setAntwort2(f.getAntwort2());
		fenster.setAntwort3(f.getAntwort3());
		fenster.setAntwort4(f.getAntwort4());
	}
	
	public static boolean checkAnswer(int antwort) {
		
		if(currentQuestion.getRichtigeAntwort()== antwort) {
			return true;
		}else {
			return false;
		}
	}
        public static void counter(){
        int counter = 0;
        int counter_richtig=0;
    }

    
	
	
}
