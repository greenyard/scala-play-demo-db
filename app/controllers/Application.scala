package controllers

import play.api._
import play.api.mvc._
object Application extends Controller {
  def index = Action { implicit request =>
    Redirect(routes.Items.list)
  }

  def login = Action { implicit request =>
    Redirect(routes.Items.list)
  }
  def register = Action { implicit request =>
    Redirect(routes.Items.list)
  }
}