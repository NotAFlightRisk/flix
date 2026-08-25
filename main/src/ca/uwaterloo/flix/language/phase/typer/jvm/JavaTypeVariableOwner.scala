/*
 * Copyright 2026 Flix Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ca.uwaterloo.flix.language.phase.typer.jvm

import java.lang.constant.ClassDesc

/** Identifies the declaration that owns a Java type variable. */
sealed trait JavaTypeVariableOwner

object JavaTypeVariableOwner {
  case class Class(owner: ClassDesc) extends JavaTypeVariableOwner

  case class Method(owner: JavaMethodRef) extends JavaTypeVariableOwner

  /** Used only if a class-file parser reports a symbolic variable without its declaring source. */
  case object Unknown extends JavaTypeVariableOwner
}
