package com.datainc.pipeline.workflow

import akka.actor.Actor

class WorkExecutor extends Actor {

  def receive = {
    case n: Int =>
            val n2 = n * n
            val result = s"$n * $n = $n2"
      sender() ! TodoWorker.WorkComplete(result)
  }

}