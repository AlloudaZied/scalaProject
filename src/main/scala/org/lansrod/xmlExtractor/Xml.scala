package org.lansrod.xmlExtractor

import scala.collection.mutable.ListBuffer
import scala.tools.ant.sabbus.Break

/**
 * Problem: In a SCALA application, you want to extract information from XML you receive,
 * so you can use the data in your application
 * @author Zied
 */
object Xml {
  case class Couple(str: String, number: Int)
  /**
   * Function that reduce a  List of Couple object
   * @param list : List of Couple
   * @return List of Couple
   */
  def reduceByKey(list: List[Couple]): List[Couple] = {
    var count = 1
    var size = list.size - 1
    var listBuffer = new ListBuffer[Couple]
    for (cp1 <- 0 to size) {
      if (!exist(list(cp1).str, listBuffer)) {
        for (cp2 <- 1 to size) {
          if (list(cp1).str == list(cp2).str) {
            count += 1
          }
        }
        listBuffer += Couple(list(cp1).str, count)
      }
    }
    listBuffer.toList
  }
  /**
   * Function for existence used By $reduceByKey
   * @param str
   * @param listBuffer
   */
  def exist(str: String, listBuffer: ListBuffer[Couple]): Boolean = {
    var bool = false
    var cp = 0
    var size = listBuffer.size
    while ((bool == false) && (cp < size)) {
      if ((str == listBuffer(cp).str) && (cp != 0)) {
        bool = true
        cp = size
      } else cp += 1
    }
    bool
  }
  def main(args: Array[String]): Unit = {
    val musicfile = scala.xml.XML.loadFile(getClass.getResource("/music.xml").getFile)
    println(musicfile.child.head)
    val fileLabel = musicfile.label
    fileLabel match {
      case "music" => "file existe with Label : " + fileLabel
      case _ => "file is not Loaded"
    }
    val seqNode = musicfile \\ "description"
    val description = seqNode.map(x => x.text)
    val words = description.flatMap(x => x.split(" ").map(x => (x, 1)))
    val lisWord = words.toList
    val coupleObject = lisWord.map(x => new Couple(x._1, x._2))
    val list = List(Couple("zied", 1),
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
    println(reduceByKey(coupleObject))

  }
}