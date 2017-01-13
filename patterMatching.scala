def usuarioAtual() = usuarioOpt match {
    case Some(usuario) => usuario
    case None => "anonimo"
}

val usuario1 = usuarioAtual()
