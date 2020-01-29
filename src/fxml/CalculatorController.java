package fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.script.ScriptEngineManager;

import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class CalculatorController {
	@FXML private Button clear;
	
	@FXML private Button switchSign;
	
	@FXML private Button modulo;
	
	@FXML private Button divide;
	
	@FXML private Button seven;
	
	@FXML private Button eight;
	
	@FXML private Button nine;
	
	@FXML private Button multiply;
	
	@FXML private Button four;
	
	@FXML private Button five;
	
	@FXML private Button six;
	
	@FXML private Button minus;
	
	@FXML private Button one;
	
	@FXML private Button two;
	
	@FXML private Button three;
	
	@FXML private Button plus;
	
	@FXML private Button zero;
	
	@FXML private Button dot;
	
	@FXML private Button equal;
	
	@FXML private TextField result;
	
	ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    boolean evaluated = false;
    
	@FXML protected void handleButton(ActionEvent event) {
		
		if (evaluated) {
			result.clear();
			evaluated = false;
		}
		if (event.getSource().equals(clear)) {
			result.clear();
		}
		if (event.getSource().equals(switchSign)) {
			
		}
		if (event.getSource().equals(equal)) {
			String answer = "";
			if (!result.getText().isEmpty() && !result.getText().trim().isEmpty()) {
				try {
					answer = engine.eval(result.getText().toString()).toString();
					result.appendText(" = " + answer);
				} catch (ScriptException e) {
					result.clear();
					result.appendText("Malformed expression!");
				}			
				evaluated = true;
			}
		}
		
		if (event.getSource().equals(divide)) {
			result.appendText(" / ");
		}
		if (event.getSource().equals(plus)) {
			result.appendText(" + ");
		}
		if (event.getSource().equals(minus)) {
			result.appendText(" - ");
		}
		if (event.getSource().equals(multiply)) {
			result.appendText(" * ");
		}
		if (event.getSource().equals(modulo)) {
			result.appendText(" % ");
		}
		if (event.getSource().equals(dot)) {
			result.appendText(".");
		}
		
		if (event.getSource().equals(one)) {
			result.appendText("1");
		}
		if (event.getSource().equals(two)) {
			result.appendText("2");
		}
		if (event.getSource().equals(three)) {
			result.appendText("3");
		}
		if (event.getSource().equals(four)) {
			result.appendText("4");
		}
		if (event.getSource().equals(five)) {
			result.appendText("5");
		}
		if (event.getSource().equals(six)) {
			result.appendText("6");
		}
		if (event.getSource().equals(seven)) {
			result.appendText("7");
		}
		if (event.getSource().equals(eight)) {
			result.appendText("8");
		}
		if (event.getSource().equals(nine)) {
			result.appendText("9");
		}
		
	}
}
