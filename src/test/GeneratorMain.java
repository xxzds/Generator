package test;

import com.ebiz.generator.GeneratorFacade;

public class GeneratorMain {
	public static void main(String[] args) throws Exception {
		GeneratorFacade g = new GeneratorFacade();
		g.clean(); 
//		g.printAllTableNames();
//		g.createGeneratorForDbTable();
		
//		g.generateByClass(GeneratorMain.class);
		g.generateByTable("hly_user");
	}
}
