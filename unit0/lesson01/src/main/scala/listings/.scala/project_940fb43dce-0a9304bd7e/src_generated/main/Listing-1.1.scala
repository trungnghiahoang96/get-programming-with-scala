



object `Listing-1.1` {
/*<script>*/class MyClass(name: String) {
  def sayHello(otherName: String) =
    s"Hi $otherName, my name is $name!" 
}
/*</script>*/ /*<generated>*/
  def args = `Listing-1.1_sc`.args$
  /*</generated>*/
}
object `Listing-1.1_sc` {
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
    `Listing-1.1`
  }
}

