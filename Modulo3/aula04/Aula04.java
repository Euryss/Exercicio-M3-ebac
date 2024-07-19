public class Aula04
{
    public static void main(String [] args)
    {
        String ambiente = args[0];
        if(ambiente.equalsIgnoreCase("DEV")){
          System.out.println("Executando em DEV " );  
        }else if(ambiente.equalsIgnoreCase("TESTE") ){
            System.out.println("Executando em Teste");
        }else{
            System.out.println(ambiente);
        }
        
    }
} 