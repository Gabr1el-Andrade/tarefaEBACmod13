public class Main {
    public static void main (String args []){


        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setNome("teste");
        pessoa.setIdade("18");
        pessoa.setCpf(123456789);
        System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " e o seu cpf é " + pessoa.getCpf());
    }
}
