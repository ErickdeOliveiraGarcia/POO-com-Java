package Questao3;

/*/*a) A classe Veiculo (abstrata)

b) A classe Motorizado

c) A classe NãoMotorizado

d) Um exemplo de polimorfismo*/*/ */


    public class MotorizadoNao extends Veiculo{

        private String meioLocomocao;
    
        
        public MotorizadoNao(int ano,float preco,String descricao,String meioLocomocao){
            super(ano, preco, descricao);
            this.setMeioLocomocao(meioLocomocao);
        }
    
        public String getMeioLocomocao(){
            return meioLocomocao;
        }
    
        public void setMeioLocomocao(String meioLocomocao){
            this.meioLocomocao = meioLocomocao;
        }
        
        
    }  

