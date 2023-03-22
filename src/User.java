public class User {
  String nome;
  Curso curso;
  private String email;
  private int telefone;

  public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

  public int getTelefone() {
		return this.telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

}
