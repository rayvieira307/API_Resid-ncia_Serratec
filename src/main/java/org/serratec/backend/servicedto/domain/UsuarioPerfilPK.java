package org.serratec.backend.servicedto.domain;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class UsuarioPerfilPK implements Serializable{

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "id_Usuario")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "id_perfil")
	private Perfil perfil;
	

	@Override
	public int hashCode() {
		return Objects.hash(perfil, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioPerfilPK other = (UsuarioPerfilPK) obj;
		return Objects.equals(perfil, other.perfil) && Objects.equals(usuario, other.usuario);
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}



	
}
