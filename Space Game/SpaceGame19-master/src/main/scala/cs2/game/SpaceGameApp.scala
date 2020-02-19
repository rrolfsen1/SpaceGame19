package cs2.game

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.canvas.Canvas
import scalafx.animation.AnimationTimer

/** main object that initiates the execution of the game, including construction
 *  of the window.
 *  Will create the stage, scene, and canvas to draw upon. Will likely contain or
 *  refer to an AnimationTimer to control the flow of the game.
 */
object SpaceGameApp extends JFXApp {
    stage = new JFXApp.PrimaryStage {
        title = "Galaga-Like-lite"
        scene = new Scene(1000,1000) {
            val canvas = new Canvas(1000,1000)
            content = canvas
            val g = canvas.graphicsContext2D
        
        }
    }
}