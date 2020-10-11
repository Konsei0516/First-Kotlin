var i: Int = 65534
var j: Int = i
var k: Int? = i
//参照先を変更
println(i == j)
println(i === j)
println(i == k)
println(i === k)