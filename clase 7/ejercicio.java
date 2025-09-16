import java.util.Stack;

public class ejercicio {
 Stack<String> pilaS;

    public boolean validarParentesisi ( String[]s){
            boolean flag = false;

             pilaS= new Stack<> ();
            


       //alamcenar en la pila el arreglo de signos

        for(int j=0 ; j < s.length; j++){

            pilaS.push(s[j]);
    }
    int tam = pilaS.size();
    int cont1 = 0, cont2 = 0;
    //recorrer la pila 
    for (int j = 0; j < tam; j++){
            if (pilaS.peek().equals("(")){
                cont1 += 1;
            }else{
                cont2 +=1;
            }
            pilaS.pop();
    }
        flag = (cont1 == cont2 ? true: false);

        return flag;
    }}
        
  
  

    

