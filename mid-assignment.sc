//task-1  Bucketise the given array[Double] into buckets having range interval (x, x+0.049).
def Bucketize(value: Float,start:Float,diff:Float):(Float,Float)={
  (start+((value/diff).floor)*diff,(start+((value/diff).floor)*diff+0.049F))}


println(Bucketize(12.05F,0.0F,0.05F))
println(Bucketize(12.03F,0.0F,0.05F))
println(Bucketize(10.33F,0.0F,0.05F))
println(Bucketize(11.45F,0.0F,0.05F))
println(Bucketize(13.50F,0.0F,0.05F))
//task-2
// Player with the best highest run scored.
val players_info=Array((2021, "sam", "India", 23, 2300, 3
),(2021, "Ram", "India", 23, 400, 30
),(2021, "Mano", "india", 23, 600, 13
),(2021, "Virat", "india", 23, 11300, 15),(2021, "Rohit", "india", 23, 12300, 10),(2021, "Msd", "india", 23, 12400, 213))

//
players_info.sortWith(_._5>_._5).take(1)(0)._2


//Top 5 players by run scored.

for(x <-players_info.sortWith(_._5>_._5).take(5)){
  println(x._2)
}
//Top 5 players by wicket taken.
for(x <-players_info.sortWith(_._6>_._6).take(5)){
  println(x._2)
}
//Rank players with overall performance give weight 5x to wicket taken and (5/100)x to run scored.
players_info.sortBy(y=>y._5*0.05+y._6*5).reverse


