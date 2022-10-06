package Animais;
public class Animal {
        private String raca;
        private int idade;
        private String porte;
        
        public Animal(String raca, int idade, String porte) {
            this.raca = raca;
            this.idade = idade;
            this.porte = porte;
        }
    
        public String getRaca() {
            return raca;
        }
    
        public void setRaca(String raca) {
            this.raca = raca;
        }
    
        public int getIdade() {
            return idade;
        }
    
        public void setIdade(int idade) {
            this.idade = idade;
        }
    
        public String getPorte() {
            return porte;
        }
    
        public void setPorte(String porte) {
            this.porte = porte;
        }
        
        public int cul_idade(int data){
            int ano_at = 2022;
            return ano_at - data;
        }
        
        
    }
    
