



object `TryThis-5.1` {
/*<script>*/// Write a program to compute the discount for a given price as follows:
// -	0% discount if the price is less than $50
// -	10% discount if the price is at least $50 but less than $100
// -	15% discount if the price is at least $100


// ANSWER

def applyDiscount(price: Double) = {
  val discount = {
    if (price >= 100) 0.15
    else if (price >= 50) 0.10
    else 0
  }

  price * (1 - discount)
}

for (p <- List(10, 60, 110)) println(applyDiscount(p))
/*</script>*/ /*<generated>*/
  def args = `TryThis-5.1_sc`.args$
  /*</generated>*/
}
object `TryThis-5.1_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }
  def main(args: Array[String]): Unit = {
    args$set(args)
    `TryThis-5.1`
  }
}

