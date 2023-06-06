package com.github.hotire.spring.statemachine.core.example.gmarket

import org.springframework.context.annotation.Configuration
import org.springframework.statemachine.config.StateMachineConfigurerAdapter
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer

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

    override fun configure(transitions: StateMachineTransitionConfigurer<States, Events>) {
        transitions
            .withExternal()
            .source(States.S0).target(States.S5).event(Events.InsertNickel) // S0 상태에서 InsertNickel 입력이 주어진 경우 S5 상태로 transition
            .and()
            .withExternal()
            .source(States.S5).target(States.S10).event(Events.InsertNickel)
            .and()
            .withExternal()
            .source(States.S10).target(States.S15).event(Events.InsertNickel)
            .and()
            .withExternal()
            .source(States.S15).target(States.S20).event(Events.InsertNickel)
            .and()
            .withExternal()
            .source(States.S20).target(States.S25).event(Events.InsertNickel)
            .and()
            .withExternal()
            .source(States.S25).target(States.S30).event(Events.InsertNickel)
            .and()
            .withInternal()
            .source(States.S30).event(Events.InsertNickel) // S30 상태에서 InsertNickel 입력이 주어진 경우, 다시 S30 상태로 transition
            .and()
            .withExternal()
            .source(States.S30).target(States.S0).event(Events.PushAppleJuice) // S30 상태에서 주스를 뽑으면 S0 상태로 transition
            .and()
            .withExternal()
            .source(States.S30).target(States.END).event(Events.PushOrangeJuice)
    }
}
