class Foto(val id: Long, val owner: String, val title: String , val farm: Int)

val fotos = parseiaResultado(resultadoServico)
val countFotosFarm7 = fotos.count(foto => foto.farm == 2)
