package com.github.hotire.spring.statemachine.core.example.gmarket

enum class States {
    S0, S5, S10, S15, S20, S25, S30
}

enum class Events {
    InsertNickel, // insert 5 cents
    InsertDime, // insert 10 cents
    InsertQuarter, // insert 25 cents
    PushAppleJuice, // push apple juice
    PushOrangeJuice
    // push orange juice
}
