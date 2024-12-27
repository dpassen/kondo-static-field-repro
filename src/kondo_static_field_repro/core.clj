(ns kondo-static-field-repro.core
  (:import
   (clojure.lang PersistentQueue)
   (io.temporal.workflow Workflow)
   (java.time.temporal ChronoField)))

(System/err)
System/err

(PersistentQueue/EMPTY)
PersistentQueue/EMPTY

(Workflow/DEFAULT_VERSION)
Workflow/DEFAULT_VERSION

(ChronoField/DAY_OF_MONTH)
ChronoField/DAY_OF_MONTH
