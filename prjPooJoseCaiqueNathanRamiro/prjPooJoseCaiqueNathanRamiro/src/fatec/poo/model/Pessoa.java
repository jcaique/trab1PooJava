package fatec.poo.model;

public class Pessoa {

    private String cpf;
    private String nome;
    private String endereco;
    private String cidade;
    private String uf;
    private String cep;
    private String ddd;
    private String telefone;

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public String getCep() {
        return cep;
    }

    public String getDdd() {
        return ddd;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public static boolean validarCpf(String cpf){
  //Retirando os pontos e o traço
        String cpfNoFormat = cpf.replace(".","");          
        cpfNoFormat = cpfNoFormat.replace("-", "");
        
        String cpf2 = cpfNoFormat.substring(0, 9);//começa no 0 e vai até o nove sem o nove;
        String cpf3 = cpfNoFormat.substring(0, 10); 
        
        int verifiers = Integer.parseInt(cpfNoFormat.substring(9));
        int digitoVer1 = 0;
        int digitoVer2 = 0;

        for (int i = 0; i < cpf2.length(); i++) {
            digitoVer1 += Integer.parseInt(String.valueOf(cpf2.charAt(i))) * (i + 1);
        }
        if(digitoVer1 % 11 == 10){
            digitoVer1 = 0;
        }else{
            digitoVer1 = digitoVer1 % 11;
        }

        for (int i = 0; i < cpf3.length(); i++) {
            digitoVer2 += Integer.parseInt(String.valueOf(cpf3.charAt(i))) * (12 - (i + 1));
        }
        digitoVer2 = digitoVer2 * 10;
        
        if(digitoVer2 % 11 == 10){
            digitoVer2 = 0;
        }else{
            digitoVer2 = digitoVer2 % 11;
        }

        String verifiers2 = String.valueOf(digitoVer1) + String.valueOf(digitoVer2);

        return Integer.parseInt(verifiers2) == verifiers;
    }
}
