object Solution {
    import scala.collection.mutable.Map
    
    sealed trait Event
    case class FindStrongest(army: Int) extends Event
    case class StrongestDied(army: Int) extends Event
    case class Recruit(army: Int, strength: Int) extends Event
    case class Merge(army: Int, armyToMerge: Int) extends Event
    
    def processEvents(events: List[Event], armiesNum: Int) = {
        val armyStrengths: Map[Int, List[Int]] = Map((1 to armiesNum).map(x => x -> Nil): _*)
        for(event <- events) yield event match {
            case FindStrongest(army) => println(armyStrengths.maxBy(_._2))
            case StrongestDied(army) => 
            case Recruit(army, strength) =>
            case Merge(army, armyToMerge) =>
        }
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in)
        val armiesNum = sc.nextInt()
        val eventsCount = sc.nextInt()
        val events = for (i <- 0 until eventsCount) yield sc.nextInt() match {
            case 1 => FindStrongest(sc.nextInt())
            case 2 => StrongestDied(sc.nextInt())
            case 3 => Recruit(sc.nextInt(), sc.nextInt())
            case 4 => Merge(sc.nextInt(), sc.nextInt())
        }
        processEvents(events.toList, armiesNum)
    }
}
