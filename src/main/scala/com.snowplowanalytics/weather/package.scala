/*
 * Copyright (c) 2015-2017 Snowplow Analytics Ltd. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
package com.snowplowanalytics

import com.snowplowanalytics.weather.providers.openweather.Errors

// Scala
import scala.concurrent.Future

// This library
import Errors._

package object weather {

  type Timestamp = Int
  type Day = Int        // 0:00:00 timestamp of day

  // Type aliases/lambdas
  type ValidatedWeather[+A] = Either[WeatherError, A]
  type AsyncWeather[+A] = Future[Either[WeatherError, A]]
}
