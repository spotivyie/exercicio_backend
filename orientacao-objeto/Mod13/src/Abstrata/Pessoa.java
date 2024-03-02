package Abstrata;

public class Pessoa {
	
    public static void main(String aargs[]) {
    	System.out.println("** Pessoa Física **");
        PessoaFisica pf = new PessoaFisica();
        PessoaFisica pfa = new PessoaFisica();
        PessoaFisica pfb = new PessoaFisica();
        
        pf.setNome("Maria");
        pf.setSobrenome("Brenda");
        pf.setCpf("105463453");
        pfa.setNome("Ana");
        pfa.setSobrenome("Pires");
        pfa.setCpf("105463783");
        pfb.setNome("Clara");
        pfb.setSobrenome("Martines");
        pfb.setCpf("105463783");
        
        System.out.println("Nome: " + pf.getNome() + " " + pf.getSobrenome() + " - Cpf: " + pf.getCpf());
        System.out.println("Nome: " + pfa.getNome() + " " + pfa.getSobrenome() +  " - Cpf: " + pfa.getCpf());
        System.out.println("Nome: " + pfb.getNome() + " " + pfb.getSobrenome() +  " - Cpf: " + pfb.getCpf());

        System.out.println("** Pessoa Jurídica **");
        PessoaJuridica pj = new PessoaJuridica();
        PessoaJuridica pja = new PessoaJuridica();
        
        pj.setNome("Joao");
        pj.setSobrenome("Carlos");
        pj.setCnpj("16745640");
        pja.setNome("Eduardo");
        pja.setSobrenome("Muniz");
        pja.setCnpj("1674560345");
        
        System.out.println("Nome: " + pj.getNome() + " " + pj.getSobrenome() +  " - Cnpj: " + pj.getCnpj());
        System.out.println("Nome: " + pja.getNome() + " " + pja.getSobrenome() +  " - Cnpj: " + pja.getCnpj());
    }
}
