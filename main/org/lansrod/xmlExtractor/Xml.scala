package org.lansrod.xmlExtractor

import scala.collection.mutable.ListBuffer

/**
 * Problem: In a SCALA application, you want to extract information from XML you receive,
 * so you can use the data in your application
 */
object Xml {
  case class Couple(str: String, number: Int)
  /**
   * Reducing value 3 Key
   */
  def concat(list: List[Couple]): List[Couple] = {
    var buffer = " "
    var count = 1
    var size = list.size - 1
    var listBuffer = new ListBuffer[Couple]
    listBuffer += Couple(list(0).str,0)
    for (cp1 <- 0 to size) {
      
      if (!exist(buffer, listBuffer)) {
        buffer = list(cp1).str
        for (cp2 <- 1 to size) {
          if (buffer == list(cp2).str) {
            count += 1
          }
        }
        listBuffer += Couple(buffer, count)
      }
    }
  
    
    listBuffer.toList
  }
  def exist(str: String, listBuffer: ListBuffer[Couple]): Boolean = {
    var bool = false
    var cp = 1
    var size = listBuffer.size 
    do {
      if (str == listBuffer(cp).str) {
        bool = true
      } else bool = false
    } while ((bool == true) || (cp > size))
    bool
  }
  def main(args: Array[String]): Unit = {
    val musicfile = scala.xml.XML.loadFile("ressources/tmp/music.xml")
    println(musicfile.child.head)
    val fileLabel = musicfile.label
    fileLabel match {
      case "music" => "file existe with Label : " + fileLabel
      case _ => "file is not Loaded"
    }
    var seqNode = musicfile \\ "description"
    var description = seqNode.map(x => x.text)
    var words = description.flatMap(x => x.split(" ").map(x => (x, 1)))
    var lisWord = words.toList
    var coupleObject = lisWord.map(x => new Couple(x._1, x._2))
    var list = List(Couple("zied", 1),
      Couple("The", 1),
      Couple("King", 1),
      Couple("of", 1),
      Couple("Limbs", 1),
      Couple("is", 1),
      Couple("the", 1),
      Couple("eighth", 1),
      Couple("studio", 1),
      Couple("album", 1),
      Couple("by", 1),
      Couple("English", 1),
      Couple("rock", 1),
      Couple("band", 1),
      Couple("Radiohead,", 1),
      Couple("produced", 1),
      Couple("by", 1),
      Couple("Nigel", 1),
      Couple("Godrich.", 1),
      Couple("zied", 1),
      Couple("was", 1),
      Couple("self-released", 1),
      Couple("on", 1),
      Couple("18", 1),
      Couple("February", 1),
      Couple("2011", 1),
      Couple("as", 1),
      Couple("a", 1),
      Couple("zied", 1),
      Couple("in", 1),
      Couple("MP3", 1),
      Couple("and", 1),
      Couple("WAV", 1),
      Couple("formats,", 1),
      Couple("followed", 1),
      Couple("by", 1),
      Couple("physical", 1),
      Couple("CD", 1),
      Couple("and", 1),
      Couple("12", 1),
      Couple("vinyl", 1),
      Couple("releases", 1),
      Couple("28", 1),
      Couple("March,", 1),
      Couple("a", 1),
      Couple("wider", 1),
      Couple("digital", 1),
      Couple("release", 1),
      Couple("via", 1),
      Couple("AWAL,", 1),
      Couple("and", 1),
      Couple("a", 1),
      Couple("special", 1),
      Couple("newspaper", 1),
      Couple("edition", 1),
      Couple("on", 1),
      Couple("9", 1),
      Couple("May", 1),
      Couple("2011.", 1),
      Couple("The", 1),
      Couple("physical", 1),
      Couple("editions", 1),
      Couple("were", 1),
      Couple("released", 1),
      Couple("through", 1),
      Couple("the", 1),
      Couple("band's", 1),
      Couple("Ticker", 1),
      Couple("Tape", 1),
      Couple("imprint", 1),
      Couple("on", 1),
      Couple("XL", 1),
      Couple("in", 1),
      Couple("the", 1),
      Couple("United", 1),
      Couple("Kingdom,", 1),
      Couple("TBD", 1),
      Couple("in", 1),
      Couple("the", 1),
      Couple("United", 1),
      Couple("States,", 1),
      Couple("and", 1),
      Couple("Hostess", 1))
      println(concat(list))
      
  }
}