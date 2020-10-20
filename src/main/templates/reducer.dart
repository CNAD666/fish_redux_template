import 'package:fish_redux/fish_redux.dart';

import 'action.dart';
import 'state.dart';

Reducer<$nameState> buildReducer() {
  return asReducer(
    <Object, Reducer<$nameState>>{
      $nameAction.onRefresh: _onRefresh,
    },
  );
}

$nameState _onRefresh($nameState state, Action action) {
  return state.clone();
}
