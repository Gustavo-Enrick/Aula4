package EMPREGADO;

public class Empresa {
        private String razaoSocial;
        private String cnpj;
        private String fone;

        // Métodos Setters
        public void setRazaoSocial(String razaoSocial) {
            this.razaoSocial = razaoSocial;
        }

        public void setCNPJ(String cnpj) {
            this.cnpj = cnpj;
        }

        public void setFone(String fone) {
            this.fone = fone;
        }

        // Métodos Getters
        public String getRazaoSocial() {
            return this.razaoSocial;
        }

        public String getCNPJ() {
            return this.cnpj;
        }

        public String getFone() {
            return this.fone;
        }
}
