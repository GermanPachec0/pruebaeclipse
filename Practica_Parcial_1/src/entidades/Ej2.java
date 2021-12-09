package entidades;
import java.util.ArrayList;


public class Ej2 {
	
	
	public String getEstado(ArrayList<Double> notas)
	{
		Double total= 0.0;
		for (Double minota : notas) {
			
			total = minota + total;
			
		}
		
		Double prom = total / notas.size();
		
		if(prom < 6)
		{
			return "NA";
		}
		else if(prom >= 6 && prom <= 8) 
		{
			return "A";
		}else
		{
			return "A+";
		}
	}
}

