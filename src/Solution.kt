fun main(args:Array<String>){
    val N = readLine()!!.toInt()
    for(i in 1..N+1){

        val s = readLine()!!.split(" ")
        val si = s[0].toInt()
        val p = s[1].toInt()


        var ans = Int.MAX_VALUE
        var hours = 0
        var start = 0
        val skills = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()

        skills.sortDescending()

        for(j in 0 until si){

            hours+= (skills[start] - skills[j])
            if(j+1 >= p){
                ans = minOf(hours,ans)


                hours -= ((skills[start] - skills[start+1]) * (p-1))
                start+=1
            }

        }
        print("Case #${i}: $ans")

    }
}