package Abstrata;

public class Pessoa{
	
	private String nome;
	
	private String email;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
    public static void main(String aargs[]) {
    	System.out.println("** Pessoa Física **");
        PessoaFisica pf = new PessoaFisica();
        PessoaFisica pfa = new PessoaFisica();
        PessoaFisica pfb = new PessoaFisica();
        
        pf.setNome("Maria");
        pf.setCpf("105463453");
        pf.setEmail("email@");
        pfa.setNome("Ana");
        pfa.setCpf("105463783");
        pfa.setEmail("email@a");
        pfb.setNome("Clara");
        pfb.setCpf("105463783");
        pfb.setEmail("email@b");
        
        System.out.println("Nome: " + pf.getNome() + " - Cpf: " + pf.getCpf() + " - Email: " + pf.getEmail());
        System.out.println("Nome: " + pfa.getNome() + " - Cpf: " + pfa.getCpf() + " - Email: " + pfa.getEmail());
        System.out.println("Nome: " + pfb.getNome() + " - Cpf: " + pfb.getCpf() + " - Email: " + pfb.getEmail());

        System.out.println("** Pessoa Jurídica **");
        PessoaJuridica pj = new PessoaJuridica();
        PessoaJuridica pja = new PessoaJuridica();
        
        pj.setNome("Joao");
        pj.setCnpj("16745640");
        pj.setEmail("email@");
        pja.setNome("Eduardo");
        pja.setCnpj("1674560345");
        pja.setEmail("email@a");
        
        System.out.println("Nome: " + pj.getNome() +  " - Cnpj: " + pj.getCnpj() + " - Email: " + pj.getEmail());
        System.out.println("Nome: " + pja.getNome() +  " - Cnpj: " + pja.getCnpj() + " - Email: " + pja.getEmail());
    }
}
