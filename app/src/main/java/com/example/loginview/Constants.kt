package com.example.loginview

object Constants {

    fun getQuestions():ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val quest1 = Question(
            1, "What is the Capital of France?",
            "Roma", "Kingston", "Paris", "Berlin", 2
        )
        val quest2 = Question(2, "How many bits in a byte?",
        "1", "2", "4", "8", 3
        )

        val quest3 = Question(3, "What is finding and fixing errors in programs?",
        "Debbugging", "Program", "Bug", "Code", 0
        )

        val quest4 = Question(4, "What is the fastest bird in the world?",
            "Red Tailed Hawk", "Common Swift","Peregrine Falcon",
            "Golden Eagle", 2
        )

        val quest5 = Question(5, "What is the fastest animal on land?",
        "Lion", "Hare", "Pronghorn", "Cheetah", 3
        )
        questionList.add(quest1)
        questionList.add(quest2)
        questionList.add(quest3)
        questionList.add(quest4)
        questionList.add(quest5)

        return questionList

    }
}