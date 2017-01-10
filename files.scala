import java.io._

object Files {
    def main(args: Array[String]): Unit = {
        val arquivos = new File(".").listFiles
        val extensoesImgs = List(".jpeg" , ".jpg" , ".gif" , ".png" , ".svg")

        def ehImagem(nomeArq: String) = extensoesImgs.exists(nomeArq.endsWith(_))

        arquivos.filter(arq => ehImagem(arq.getName)).foreach(_.delete)

        arquivos.foreach(println(_))

    }
}
