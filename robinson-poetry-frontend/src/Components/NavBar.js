import React from "react";
import { Link } from "react-router-dom";

export default function navBar(){
return(
    <nav class="navbar navbar-expand-lg navbar-dark bg-blue ">
    <a class="navbar-brand" href="/">Home</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
           <li class="nav-item">
            //link to poetry home page for user
             <a class="nav-link" href="/DisplayPoems"><b>Poetry</b></a>
           </li>
        <li class="nav-item">
            //link to writing home page for user
          <a class="nav-link" href="/DisplayWriting"><b>Creative Writing</b></a>
        </li>
        <li class="nav-item">
            //link to blog home page for user
          <a class="nav-link" href="/DisplayCode"><b>Coding</b></a>
        </li>
        <li class="nav-item">
            //link to about me page
          <a class="nav-link" href="/AboutMe"><b>About The Writing Robin</b></a>
         </li>
         <li class="nav-item">
            //link to log out
            <a class="nav-link" href="/logout"><b>Logout</b></a>
          </li>
      </ul>
    </div>
  </nav>
);
}