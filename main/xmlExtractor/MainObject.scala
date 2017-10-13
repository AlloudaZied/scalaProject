package xmlExtractor

object MainObject {
  
  
  def main(args :Array[String]): Unit = {
//    val seqNode = getNode("/music.xml")
//    println(seqNode)
//    val description = seqNode.map(x => x.text)
//    val words = description.flatMap(x => x.split(" ").map(x => (x, 1)))
//    val lisWord = words.toList
//    val coupleObject = lisWord.map(x => new Couple(x._1, x._2))
//    val list = List(Couple("zied", 1)
//    println(reduceByKey(coupleObject))
//  }
    val musicfile = scala.xml.XML.loadFile(getClass.getResource("/music.xml").getFile)
    println(musicfile.child.head)
    val fileLabel = musicfile.label
    fileLabel match {
      case "music" => "file existe with Label : " + fileLabel
      case _ => "file is not Loaded"
    }
    val att = new AttributeTraitImpl()
    att.getArtist(musicfile)
  }
  
}