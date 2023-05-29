import React from 'react'
import './cardpoint.css'

export const Cardpoint = ({title}) => {
  return (

          <div className="cardesign">
      <img src="outer.jpg" alt={title} width="320" height="300"/>
      <h4>제목입니다</h4>
      <p>내용입니다</p>
    </div>

  )
}
