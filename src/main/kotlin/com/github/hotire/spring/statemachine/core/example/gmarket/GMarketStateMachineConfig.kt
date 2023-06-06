package com.github.hotire.spring.statemachine.core.example.gmarket

import org.springframework.context.annotation.Configuration
import org.springframework.statemachine.config.StateMachineConfigurerAdapter
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer

@Configuration
class GMarketStateMachineConfig : StateMachineConfigurerAdapter<States, Events>() {

    override fun configure(config: StateMachineStateConfigurer<States, Events>) {
        config
            .withStates()
            .initial(States.S0)
            .end(States.END)
            .state(States.S5)
            .state(States.S10)
            .state(States.S15)
            .state(States.S20)
            .state(States.S25)
            .state(States.S30)
    }
}
