(ns kotoba.capability.corpus.append
  "Importable contract for corpus/append.")

(def manifest
  {:schema "kotoba.capability.repository.v1", :capability/version 1, :capability/dependencies #{}, :capability/imports #{:corpus-append}, :authority "kotoba-lang/kotoba-core-contracts", :capability/default-policy :autonomous, :capability/artifact {:format :wasm-component, :digest-required? true, :signature-required? true}, :capability/radicle-rid nil, :capability/repository "kotoba-lang/capability-corpus-append", :capability/id "corpus/append", :capability/effects #{:storage-write}, :capability/provider-status :contract-only})
